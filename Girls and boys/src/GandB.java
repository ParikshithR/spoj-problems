import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class GandB {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String s[]=br.readLine().split(" ");
		int girls=Integer.parseInt(s[0]);
		int boys=Integer.parseInt(s[1]);
		while(girls!=-1&&boys!=-1)
		{
			int max=boys>girls?boys:girls;
			int min=boys>girls?girls:boys;
			int a=max/(min+1);
			if(max%(min+1)>0)
			{
				min=1;
			}
			else
				min=0;
			System.out.println(a+min);
			
			 s=br.readLine().split(" ");
			 girls=Integer.parseInt(s[0]);
			 boys=Integer.parseInt(s[1]);
		}
	}

}
