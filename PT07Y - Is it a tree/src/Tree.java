import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Vector;

class Graph{
	private int [][] adjMatrix;

	private int nodes;
	Vector<Vector<Integer>> graph=new Vector<Vector<Integer>>();
	//LinkedList<LinkedList<Integer>> graph=new LinkedList<LinkedList<Integer>>();
	public Graph(int n)
	{
		nodes=n;
		for(int i=0;i<n;i++)
		{
			graph.add(new Vector<Integer>());
		}
		
		
	}
	
	public void connectNodes(int i,int j)
	{
		graph.get(i).add(j);
		graph.get(j).add(i);
	}
	public int [] DFS(int start)
	{
		int [] visited=new int[nodes];
		Stack<Integer> s=new Stack <Integer>();
		s.add(start);
		visited[start]=1;
	
		
		while(s.isEmpty()==false)
		{
			int i,c=s.peek();
			Vector<Integer> ab=graph.get(c);
			int size=ab.size();
			for(i=0;i<size;i++)
			{
				int t=ab.get(i);
				if(visited[t]!=1)
				{
					visited[t]=1;
					s.add(t);
					break;
				}
			}
			
			if(i==size)
				{
					s.pop();
					
				}
		}
		return visited;
	}
}
public class Tree {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int v=Integer.parseInt(st.nextToken());
		int e=Integer.parseInt(st.nextToken());
		if(e!=v-1)
		{
			System.out.println("NO");
		}
		else
		{
			Graph g=new Graph(v);
			
			int t=e;
			while(t--!=0)
			{
				st= new StringTokenizer(br.readLine());
				int i1=Integer.parseInt(st.nextToken());
				int i2=Integer.parseInt(st.nextToken());
				g.connectNodes(i1-1, i2-1);
			}
			int [] visited=g.DFS(0);
			int i;
			for( i=0;i<v;i++)
			{
				if(visited[i]==0)
				{	System.out.println("NO");
					break;
				}
			}
			if(i==v)
				System.out.println("YES");
		}
	}

}
