import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class IV {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t--!=0)
		{
			long inversion_count=0;
			System.out.println();
			
			int n=Integer.parseInt(br.readLine());
			
			
			int [] nos= new int [ n];
			for(int i=0;i<n;i++)
			{
				nos[i]=Integer.parseInt(br.readLine());
			}
	for(int i=0;i<(n-1);i++)
		{
	for(int j=i+1;j<n;j++)
		{
		if(nos[i]>nos[j])
		{
		inversion_count++;
		}
		}
		}
		System.out.println(inversion_count);
			
			
			
		}

	}

}
