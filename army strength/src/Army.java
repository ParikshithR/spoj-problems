import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Army {

	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int t;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		t=Integer.parseInt(br.readLine());
		while(t--!=0)
		{
			System.out.println();
			String s[]=br.readLine().split(" ");
			int a=Integer.parseInt(s[0]);
			
			int b=Integer.parseInt(s[1]);
		
			
			
			
			s=br.readLine().split(" ");
			int max=0;
			for(int i=0;i<a;i++)
			{
				int p=Integer.parseInt(s[i]);
				if(max<p)
					max=p;
			}
			s=br.readLine().split(" ");
			int max2=0;
			for(int i=0;i<b;i++)
			{
				int p=Integer.parseInt(s[i]);
				if(max2<p)
					max2=p;
			}
			
			if(max<max2)
			{
				System.out.println("MechaGodzilla");
			}
			else
				
			{
				System.out.println("Godzilla");
			}
		}
	}

}
