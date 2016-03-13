import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javafx.geometry.Orientation;


public class Palindrome {

	/**
	 * @param args
	 */
	static int ARRAY_LENGTH;
	static char []ORIGINAL_ARRAY;
	static void mirror(char []a)
	{
		int i,j;
		if(ARRAY_LENGTH%2==0)
		{
			j=ARRAY_LENGTH/2;
			i=j-1;
		}
		
		else
		{
			 j=(ARRAY_LENGTH/2)+1;
			i=j-2;
			
		}
		for(;i>=0;i--,j++)
		{
			a[j]=a[i];
		}
	}
	static boolean checkIfGreaterThan(char a[])
	{
		for(int i=ARRAY_LENGTH/2;i<ARRAY_LENGTH;i++)
		{
			if(a[i]<ORIGINAL_ARRAY[i])
			{
				return false;
			}
		}
		return true;
	}
	static boolean checkPalindrome(char a[])
	{
		for(int i=0,j=ARRAY_LENGTH-1;i<ARRAY_LENGTH/2;i++,j--)
		{
			if(a[i]!=a[j])
			{
				return false;
			}
		}
		return true;
	}
	static char[] incrementArray(char a[])
	{
		int k=ARRAY_LENGTH/2,left,right;
		int carry=0,sum=0;
		if(ARRAY_LENGTH%2==0)
		{
			sum=(a[k]-'0')+1;
			a[k]=(char)((sum%10)+'0');
			carry=sum/10;
			a[k-1]=(char)((sum%10)+'0');
			
			left=k-2;
			right=k+1;
		}
		else
		{
			sum=(a[k]-'0')+1;
			a[k]=(char)((sum%10)+'0');
			carry=sum/10;
			right=k+1;
			left=k-1;
		}
		sum=0;
		for(;left>=0&&carry!=0;left--,right++)
		{
		
			sum=(a[left]-'0')+carry;
			a[left]=a[right]=(char)((sum%10)+'0');
			carry=sum/10;
			
		}
		if(carry==1)//case:999(eg)
		{
			a=new char[ARRAY_LENGTH+1];
			ARRAY_LENGTH+=1;
			for(int i=0;i<ARRAY_LENGTH;i++)
			{
				if(i==0||i==ARRAY_LENGTH-1)
				{
					
					a[i]=1+'0';
				}
				else
				{
					a[i]=0+'0';
				}
			}
			return a;
		}
		return a;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(bf.readLine());
		
		while(n--!=0)
		{
			String k=bf.readLine();
			//int k=sc.nextInt();
			//first check for single digit no
			/*if(k=="9")
			{
				System.out.println("11");
				continue;
			}
			if(k>=0&&k<=8)
			{
				System.out.println(k+1);
				continue;
			}*/
			int inputLength=k.length();
			int x=0;
			for(int i=0;i<inputLength;i++)
			{
				if(k.charAt(i)!='0')
				{
					x=1;
					k=k.substring(i);
					break;
				}
			}
			if(x==0)
			{
				k="0";
			}
			char a[]=k.toCharArray();
			
			ORIGINAL_ARRAY=k.toCharArray();
			ARRAY_LENGTH=a.length;
			if(Palindrome.checkPalindrome(a))
			{
				a=Palindrome.incrementArray(a);
			}
			else
			{
				Palindrome.mirror(a);
				if(Palindrome.checkIfGreaterThan(a))
				{
					
					for(int i=0;i<ARRAY_LENGTH;i++)
					{
						System.out.print(a[i]);
					}
					System.out.println();
					continue;
				}
				else
				{
					a=Palindrome.incrementArray(a);
				}
			}
			for(int i=0;i<ARRAY_LENGTH;i++)
			{
				System.out.print(a[i]);
			}
			System.out.println();
			
		}
	}

}
