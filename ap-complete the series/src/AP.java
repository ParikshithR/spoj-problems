import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class AP {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedOutputStream bos=new BufferedOutputStream(System.out);
		int t;
		t=Integer.parseInt(br.readLine());
		while(t--!=0)
		{
			String [] a=br.readLine().split(" ");
			long thirdTerm=Integer.parseInt(a[0]);
			long thirdLastTerm=Integer.parseInt(a[1]);
			long sum=Integer.parseInt(a[2]);
			long length=2*(sum/(thirdLastTerm+thirdTerm));
			long d=(thirdLastTerm-thirdTerm)/(length-5);//coz third and third last thats y 5
			long firstTerm =thirdTerm-2*d;
			bos.write((length+"\n").getBytes());
			int j=1;
			for(long i=firstTerm;j<=length;j++,i+=d)
			{
				bos.write((i+" ").getBytes());
				
			}
		}
		bos.flush();

	}

}
