import java.util.Scanner;

import javax.swing.plaf.metal.MetalBorders.PaletteBorder;


public class Plaindrome {

	/**
	 * @param args
	 */
	static int ARRAY_LENGTH;
	static void add1(char []a)
	{
		int carry=1;
		int sum=0;
		int i;
		
		for(i=0;i<ARRAY_LENGTH&&carry!=0;i++)
		{
			sum=(a[i]-'0')+carry;
			carry=sum/10;
			sum=sum%10;
			a[i]=(char)(sum+'0');
		}
		if(carry!=0)
		{
			a[i++]=(char)(carry+'0');
			ARRAY_LENGTH=i;
		}
		
	}
	
	static void nextPalindrome(char a[])
	{
		int i,j;
		
		outer :while(true)
		{	for(i=0,j=ARRAY_LENGTH-1;i<ARRAY_LENGTH/2;i++,j--)
			{
				if(a[i]!=a[j])
				{
					Plaindrome.add1(a);
					continue outer;
				}
			}
		
		
		for(int k=0;k<ARRAY_LENGTH;k++)
		{
			System.out.print(a[k]);
		}
		System.out.println();
		return ;
		
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n--!=0)
		{
			StringBuilder sb=new StringBuilder(sc.next());
			String s=sb.reverse().toString()+"0";
			char a[]=s.toCharArray();
			ARRAY_LENGTH=a.length-1;
			Plaindrome.add1(a);
			Plaindrome.nextPalindrome(a);
			
			
			
			
		}
	}

}
