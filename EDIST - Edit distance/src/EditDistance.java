import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class EditDistance {
	 static int A_LENGTH;
	 static int  B_LENGTH;
	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	 public static int getEditDistance(String a,String b)
	 {
		 int [][] editMatrix=new int [B_LENGTH+1][A_LENGTH+1];//+1 if either of the string is null
		editMatrix[0][0]=0;//if both strings are null
		for(int i=1;i<A_LENGTH;i++)
		{
			editMatrix[0][i]=i;//initialize source edit dist if the target is null
		}
		for(int i=1;i<B_LENGTH;i++)
		{
			editMatrix[i][0]=i;//initialize the target edit dist if the source is null
		}
		for(int i=1;i<=B_LENGTH;i++)
		{
			for(int j=1;j<=A_LENGTH;j++)
			{
				if(a.charAt(j-1)==b.charAt(i-1))
				{
					editMatrix[i][j]=editMatrix[i-1][j-1];//if the current characters are equal then the dist will be 
					//d[i-1][j-1] because no changes will be made in the current character
				}
				else
				{
					//else check the minimum of the three operations and add 1
					int x=editMatrix[i-1][j];
					int y=editMatrix[i-1][j-1];
					int z=editMatrix[i][j-1];
					int min=x<y?(x<z?x:z):(y<z?y:z);
					min+=1;
					editMatrix[i][j]=min;
				}
			}
		}
		
		 return editMatrix[B_LENGTH][A_LENGTH];
	 }
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedOutputStream bos =new BufferedOutputStream(System.out);
		int t=Integer.parseInt(br.readLine());
		while(t--!=0)
		{
			String a=br.readLine();
			String b=br.readLine();
			A_LENGTH=a.length();
			B_LENGTH=b.length();
			bos.write((EditDistance.getEditDistance(a, b)+"\n").getBytes());
			
			
			
		}
		bos.flush();

	}

}
