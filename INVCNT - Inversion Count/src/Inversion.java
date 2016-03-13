import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Inversion {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	static int length;
	public static long sort(int []nos,int start,int mid,int end)
	{
		long count=0;
		int [] temp=new int [(end-start)+1];
		int i=start,j=mid+1,k=0;
		for(;i<=mid;i++)
		{
			for(;j<=end;)
			{
				if(nos[i]>nos[j])
				{
					j++;
				}
				else
					break;
			}
			count+=j-(mid+1);
		}
		i=start;j=mid+1;
		while(i<=mid&&j<=end)
		{
			if(nos[i]<nos[j])
			{
				temp[k++]=nos[i++];
			}
			else
			{
				temp[k++]=nos[j++];
			}
		}
		while(i<=mid)
		{
			temp[k++]=nos[i++];
		}
		while(j<=end)
		{
			temp[k++]=nos[j++];
		}
		k=0;
		for( i=start;i<=end;k++,i++)
		{
			nos[i]=temp[k];
		}
		return count;
	}
	public static long mergeSort(int [] nos,int start,int end)
	{
		long count=0;
		if(start<end)
		{
		
			int mid=(start+end)/2;
			count+=mergeSort(nos,start,mid);
			count+=mergeSort(nos, mid+1, end);
			count+=sort(nos,start,mid,end);
			
		}
		return count;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t--!=0)
		{
			
			System.out.println();
			
			int n=Integer.parseInt(br.readLine());
			
			
			int[] nos= new int[ n];
			for(int i=0;i<n;i++)
			{
				nos[i]=Integer.parseInt(br.readLine());
			}
			System.out.println(mergeSort(nos, 0, n-1));
		}

	}

}
