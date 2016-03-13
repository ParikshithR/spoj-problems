import java.util.Scanner;




class Decoder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		while(n!=0)
		{
			int x=0,j;
			String s=sc.next();
			String ans="";
			int var=1;;
			for(int i=0;i<n;i++,var+=2)
			{
				j=i;
				
				ans+=s.charAt(j);
			
				j+=2*n-var;
				x=0;
				for(;j<s.length();)
				{	
					if(x==0)
					{
						
						ans+=s.charAt(j);
						x=1;
						j+=var;
					}
					else
					{
						
						ans+=s.charAt(j);
						x=0;
						j+=2*n-var;
					}
				}
			}
			System.out.println(ans);
			n=sc.nextInt();
		}
		// TODO Auto-generated method stub

	}

}
