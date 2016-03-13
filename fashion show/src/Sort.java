
import java.util.Scanner;


public class Sort {
	
	int low[]=new int[50],high[]=new int[50],top=-1;
	static int partition(int low,int h,int n,int a[])
	{
		int pivot=a[low];
		int l=low+1;
		while(true)
		{
			while(a[l]<pivot&&l<n)
			{
				l=l+1;
			}
			while(a[h]>pivot)
			{
				h=h-1;
			}
			if(l<h)
			{
				int temp=a[l];
				a[l]=a[h];
				a[h]=temp;
			}
			else
			{
				a[low]=a[h];
				a[h]=pivot;
				break;
			}
		}
		return h;
	}
	void quickSort(int a[])
	{
		top=-1;
		
		++top;
		low[top]=0;
		high[top]=a.length-1;
		while(top!=-1)
		{
			
			int x=low[top];
			int y=high[top];
			top--;
			if(x<y)
			{
				int n=Sort.partition(x, y, y, a);
				if(n!=x)
				{
					top++;
					low[top]=x;
					high[top]=n-1;
				}
				if(n!=y)
				{
					top++;
					low[top]=n+1;
					high[top]=y;
				}
			}
			
		}
		
	}
	public static void main(String []a)
	{
		Sort s=new Sort();
		Scanner sc=new Scanner(System.in);
		int testcases=sc.nextInt();
		while(testcases--!=0)
		{
			int n=sc.nextInt();
			int men[]=new int[n];
			int lad[]=new int[n];
			for(int i=0;i<n;i++)
			{
				men[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				lad[i]=sc.nextInt();
			}
		
			s.quickSort(men);
			s.quickSort(lad);
			int sum=0;
			for(int i=0;i<n;i++)
			{
				sum+=(men[i]*lad[i]);
			}
			System.out.println(sum);
		}
	}

}
