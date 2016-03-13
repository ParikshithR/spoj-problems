import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Stamps {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void sort(int []a )
	{
		int length=a.length
				;
		int x=0;
		for(int i=0;i<length-1&&x==0;i++)
		{
			x=1;
			for(int j=1;j<length-i;j++)
			{
				if(a[j]>a[j-1])
				{
					x=0;
					int t=a[j];
					a[j]=a[j-1];
					a[j-1]=t;
				}
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int count=t;
		outer :while(t--!=0)
		{
			String [] s=br.readLine().split(" ");
			int monReq=Integer.parseInt(s[0]);
			int frnds=Integer.parseInt(s[1]);
			int [] money=new int [frnds];
			s=br.readLine().split(" ");
			for(int i=0;i<frnds;i++)
			{
				money[i]=Integer.parseInt(s[i]);
			}
			
			Stamps.sort(money);
			
			int sum=0;
			for(int i=0;i<frnds;i++)
			{
				
				sum+=money[i];
				if(sum>=monReq)
				{
					System.out.println("Scenario #"+(count-t)+":\n"+(i+1)+"\n");
					continue outer;
				}
				
			}
			System.out.println("Scenario #"+(count-t)+":\nimpossible\n");

			
			
		}

	}

}
