import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;



public class Party {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		StringTokenizer stringTokenizer=new StringTokenizer(s);
		int budget=Integer.parseInt(stringTokenizer.nextToken());
		int parties=Integer.parseInt(stringTokenizer.nextToken());
		while(budget!=0&&parties!=0)
		{
			int k=0;
			int [] weight=new int [parties];
			int [] value=new int [parties];
			int t=parties;
			while(t--!=0)
			{
				stringTokenizer=new StringTokenizer(br.readLine());
				weight[k]=Integer.parseInt(stringTokenizer.nextToken());
				value[k]=Integer.parseInt(stringTokenizer.nextToken());
				k++;
			}
			int [][] mat=new int [parties][budget+1];
			for(int j=0;j<parties;j++)
			{
				mat[j][0]=0;
			}
			for(int i=0;i<mat.length;i++)
			{
				int w=weight[i];
				for(int j=1;j<mat[i].length;j++)
				{
					if(j<w)
					{
						if(i-1>=0)
						{
							mat[i][j]=mat[i-1][j];
						}
						else
						{
							mat[i][j]=0;
						}
					}
					else
					{
						if(i-1>=0){
							//System.out.print("j:"+ j+"w "+w);
							int t1=value[i]+mat[i-1][j-w];
							int t2=mat[i-1][j];
							mat[i][j]=t1>t2?t1:t2;
						}
							
						else
							mat[i][j]=value[i];
					}
				}
			}
		
			int o=budget;
			int t1=mat[mat.length-1][budget];
			for(int i=budget-1;i>=0;i--)
			{
				if(t1!=mat[mat.length-1][i])
					break;
				else
				{
					o=i;
				}
			}
			System.out.println(o+" "+ mat[mat.length-1][o]);
			br.readLine();
			stringTokenizer=new StringTokenizer(br.readLine());
			 budget=Integer.parseInt(stringTokenizer.nextToken());
			parties=Integer.parseInt(stringTokenizer.nextToken());
			
	
		}
	}

}
