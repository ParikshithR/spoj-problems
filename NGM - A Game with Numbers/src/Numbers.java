import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;


public class Numbers {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedOutputStream bos=new BufferedOutputStream(System.out);
		long n=Long.parseLong(br.readLine());
		if(n%10==0)
		{
			bos.write("2\n".getBytes());
		}
		else
		{
			bos.write(("1\n"+(n%10)).getBytes());
		}
		bos.flush();

	}

}
