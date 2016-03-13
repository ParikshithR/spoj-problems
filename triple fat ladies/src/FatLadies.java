import java.util.Scanner;


public class FatLadies {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int arr[] = {192,442,692,942};
		int n=sc.nextInt();
		while(n--!=0)
		{
			long a=sc.nextLong();
			a--;
			System.out.println(1000*(a/4)+arr[(int) (a%4)]);
			
		}
		
		
	}

}
