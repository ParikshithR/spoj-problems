import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Vector;

 class QuickFind {
	private Vector<Integer> id;
	public QuickFind(int n)
	{
		id=new Vector<Integer>(n);
		for(int i=0;i<n;i++)
		{
			id.add(i,i);
		}
	}
	public int nodes()
	{
		return id.size();
	}
	public int union(int a,int b)
	{
		int k=id.get(a);
		int count=0;
		
		for(int i=0;i<id.size();i++)
		{
			if(id.get(i)==k)
			{
				id.set(i,b);
				
				count++;
			}
		}
		return count;
	}
	public boolean find(int i,int j)
	{
		if(id.get(i)==id.get(j))
		{
			return true;
		}
		return false;
	}
	

	

}
class Test
{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		StringTokenizer st=new StringTokenizer(s);
		int n=Integer.parseInt(st.nextToken());
		int e=Integer.parseInt(st.nextToken());
		if(n!=e+1)
		{
			System.out.println("NO");
		}
		else
		{
			int a,b,temp=e;
			QuickFind qf=new QuickFind(n);
			while(temp--!=0)
			{
				String edge=br.readLine();
				st=new StringTokenizer(edge);
				a=Integer.parseInt(st.nextToken());
				b=Integer.parseInt(st.nextToken());
				if(qf.find(a-1, b-1))
				{
					System.out.println("NO");
					System.exit(0);
				}
				else
				{
					qf.union(a-1, b-1);
				}
			}
			System.out.println("YES");
		}
		
		
		

	}
}
