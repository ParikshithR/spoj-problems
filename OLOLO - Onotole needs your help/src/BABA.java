import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;




public class BABA {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int unique;
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			bidi
			
			int a=Integer.parseInt(br.readLine()); 
			if(hm.containsKey(new Integer(a)))
			{
				hm.replace(new Integer(a), new Integer(2));
			}
			else
			{
				hm.put(new Integer(a), new Integer(1));
			}
			
		}
		hm.ge

	}

}
