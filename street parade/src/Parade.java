import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;


public class Parade {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		do
		{
			String s[]=br.readLine().split(" ");
			ArrayDeque <Integer> stack=new ArrayDeque<Integer>();
			int j=1,i;
			for( i=0;i<s.length;i++)
			{
				int no=Integer.parseInt(s[i]);
				if(no==j)
				{
					j++;
					continue;
				}
				if(!stack.isEmpty())
				{
					
					if(stack.peekLast()==j)
					{
						stack.removeLast();
						j++;
						if(no==j)
						{
							j++;
							continue;
						}
					}
					
					while(!stack.isEmpty()&&stack.peekLast()==j)
					{
						j++;
						stack.removeLast();
					}
					
					if(!stack.isEmpty()&&stack.peekLast()<no)
					{
						System.out.println("no");
						break;
					}
					stack.addLast(no);
				}
				else
				{
					stack.addLast(no);
				}
			}
			if(i==s.length)
			{
				System.out.println("yes");
			}
			
			
			 n=Integer.parseInt(br.readLine());
		}while(n!=0);

	}

}
