import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;
public class Happy {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		HashMap<Long, Long> hm=new HashMap<Long, Long>();
		//int t=32;
	//	while(t-->0)
		//{
			String s=br.readLine();
			long n=Integer.parseInt(s);
			Stack<Long>  stack=new Stack<Long>();
			stack.add(n);
			do{	
				long temp=stack.peek(),sum=0;
				//first check whether we have memorised the result or not
				if(hm.containsKey(temp))
				{
					break;
				}
				//compute the sum
				while(temp!=0)
				{
					sum+=Math.pow(temp%10,2);
					temp/=10;
				}
				//if the sum is 1 or the sum is in the map then backtrack and keep on adding 1
				if(sum==1||hm.containsKey(sum))
				{
					long k=stack.pop();
					if(sum==1)
					{
						hm.put(k,1L);
						while(stack.isEmpty()!=true)
						{
							long m=stack.pop();
							hm.put(m,hm.get(k)+1);
							k=m;
						}
					}
					else
					{
						//if the sum is -1 then all previous sums will also have the result as (not happy)-1
						if(hm.get(sum)==-1)
						{	hm.put(k,-1L);
							while(stack.isEmpty()!=true)
							{
								long m=stack.pop();
								hm.put(m,-1L);
							}
						}
						else
						{
							hm.put(k,hm.get(sum)+1);
							while(stack.isEmpty()!=true)
							{
								long m=stack.pop();
								hm.put(m,hm.get(k)+1);
								k=m;
							}
						}
					}
				}
				else{
					//check for re occurrence
					if(stack.contains(sum))
					{
						//store result (i.e not happy)for all previous sums
						do
						{
							long o=stack.pop();
							hm.put(o,-1L);
						}while(stack.isEmpty()!=true);
						break;
					}
					//else push in the stack and find for that no
					stack.push(sum);
					}
			}while(stack.isEmpty()==false);
			System.out.println(hm.get(n));
		}
	//}
}
