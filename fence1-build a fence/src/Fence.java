import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Fence {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int l=Integer.parseInt(br.readLine());
		do
		{
			double d=(l*l)/(2*Math.PI);
			System.out.println(d);
			
			l=Integer.parseInt(br.readLine());
		}while(l!=0);
	}

}
