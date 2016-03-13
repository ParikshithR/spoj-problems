import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Permutations {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		while(n!=0)
		{
			int[] permut=new int[n],inverse_Permut=new int[n];
			String a[]=br.readLine().split(" ");
			for(int i=0;i<n;i++)
			{
				permut[i]=Integer.parseInt(a[i]);
				inverse_Permut[permut[i]-1]=i+1;
			}
			int i;
			for( i=0;i<n;i++)
			{
				if(permut[i]!=inverse_Permut[i])
				{
					System.out.println("non ambiguous");
					break;
				}
				
			}
			if(i>=n)
			{
				System.out.println("ambiguous");
			}
			n=Integer.parseInt(br.readLine());
		}
	}

}
