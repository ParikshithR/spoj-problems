

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;



public class GoldDigger {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	static HashMap  hm=new HashMap ();
	
	static long equiDollars(long n)
	{
		if(n==1||n==0)
		{
			hm.put(new Long(n),new Long(n));
			return n;
		}
		long a,b,c;
		Long a1=new Long(n/2),a2=new Long(n/3),a3=new Long(n/4);
		if(hm.containsKey(a1))
		{
			a=((Long)(hm.get(a1))).longValue();
		}
		else
		{
			a=GoldDigger.equiDollars(n/2);
		}
		if(hm.containsKey(a2))
		{
			b=((Long)(hm.get(a2))).longValue();
		}
		else
		{
			b=GoldDigger.equiDollars(n/3);
		}
		if(hm.containsKey(a3))
		{
			c=((Long)(hm.get(a3))).longValue();
		}
		else
		{
			c=GoldDigger.equiDollars(n/4);
		}
		if(a+b+c>n)
		{
			hm.put(new Long(n), new Long(a+b+c));
			return a+b+c;
		}
		else
		{
			hm.put(new Long(n), new Long(n));
			return n;
		}
		
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		for(int i=0;i<10;i++)
		{
			long n=Long.parseLong(br.readLine());
			n=GoldDigger.equiDollars(n);
			System.out.println(n);
			
		}
		
	}

}