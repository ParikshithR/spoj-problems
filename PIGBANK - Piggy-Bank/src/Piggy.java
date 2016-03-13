import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Piggy {
	
	static int e,f;
	public static long minAmount(int n,int []wt,int []vl)
	{
		long [][]k=new long [n+1][f+1];
		
		for(int i=0;i<n+1;i++)
		{
			for(int w=0;w<f+1;w++)
			{
				if(w==0||i==0)
				{
					k[i][w]=-1;
				}
				else
				{
					if(wt[i]>w)
					{
						if(k[i-1][w]==-1)
						{
							k[i][w]=-1;
						}
						else
						{
							k[i][w]=k[i-1][w];
						}
					}
					else
					{
						long temp=vl[i]*(w/wt[i]);	
						if(w%wt[i]==0)
						{
							if(k[i-1][w]==-1)
							{
								k[i][w]=temp;
							}
							else
							{
								k[i][w]=Math.min(temp, k[i-1][w]);
							}
						}
						else
						{
							if(k[i-1][w%wt[i]]==-1)
							{
								if(k[i-1][w]==-1)
								{
									k[i][w]=-1;
								}
								else
									k[i][w]=k[i-1][w];
							}
							else
							{
								if(k[i-1][w]==-1)
								{
									k[i][w]=temp+k[i-1][w%wt[i]];
								}
								else
								{
									k[i][w]=Math.min(temp+k[i-1][w%wt[i]],k[i-1][w]);
								}
							}
						}
					}
					
					
				}
			}
			
		}
		return k[n][f];
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t--!=0)
		{
			
			StringTokenizer st=new StringTokenizer(br.readLine());
			e=Integer.parseInt(st.nextToken());
			f=Integer.parseInt(st.nextToken());
			f=f-e;
			if(f==0)
				System.out.println("This is impossible.");
			else {
				int n=Integer.parseInt(br.readLine());
				int [] wt=new int[n+1];
				int []vl=new int[n+1];
				for(int i=0;i<n;i++)
				{
					st=new StringTokenizer(br.readLine());
					vl[i+1]=Integer.parseInt(st.nextToken());
					wt[i+1]=Integer.parseInt(st.nextToken());
					
				}
				long t1=Piggy.minAmount(n, wt, vl);
				if(t1==-1)
				{
					System.out.println("This is impossible.");
				}
				else
					System.out.println("The minimum amount of money in the piggy-bank is "+t1+".");
		
			}
		}

	}

}
