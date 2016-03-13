import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Christmas {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t--!=0)
		{
			StringTokenizer st=new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			int k=Integer.parseInt(st.nextToken());
			st=new StringTokenizer(br.readLine());
			int i=0,heights []=new int [n];
			while(st.hasMoreTokens())
			{
				heights[i++]=Integer.parseInt(st.nextToken());
				
			}
			//sort to ascending inorder to find minimum height difference
			//O(nlogn) dual pivot quick sort
			Arrays.sort(heights);
			//ceate a temp which will act as infinity
			int temp=1000000000;
			//check for the minimum height difference
			for( i=0;i<=n-k;i++)
			{
				int temp2=heights[i+k-1]-heights[i];
				if(temp2<temp)
					temp=temp2;
			}
			System.out.println(temp);
		}
	}

}
