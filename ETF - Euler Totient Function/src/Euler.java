import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Euler {

	public static int gcd(int a,int b)
	{
		if(b==0)
			return a;
		return gcd(b,a%b);
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t--!=0)
		{
			int i;
			int count=0,notPrime=0;
			int n=Integer.parseInt(br.readLine());
			if(n==1)
				System.out.println(1);
			else
			{
				for( i=2;i<=Math.sqrt(n);i++)
				{
					if(Euler.gcd(i, n)==1)
						count++;
					if(n%i==0)
					{
						notPrime=1;
					}
				}
				if(notPrime==0)
					System.out.println(n-1);
				else
				{
					for(i=(int)(Math.sqrt(n)+1);i<n;i++)
					{
						if(Euler.gcd(i, n)==1)
							count++;
					}
					System.out.println(count+1);
				}
			}
				
		
		}
	}

}
