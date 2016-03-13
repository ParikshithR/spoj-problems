import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long [] data={2,4,8,16,32,64,128,256,512,1024,2048,4096
				,8192,16384,32768,65536,131072,262144,524288,1048576,2097152
				,4194304,8388608,16777216,33554432,67108864,134217728,268435456
				,536870912,1073741824,2147483648l,4294967296l,8589934592l,17179869184l,34359738368l
				,68719476736l,137438953472l,274877906944l,549755813888l,1099511627776l
				,2199023255552l,4398046511104l,8796093022208l,17592186044416l,35184372088832l
				,70368744177664l};

		Scanner sc=new Scanner(System.in);
		long i=sc.nextLong();
		for(int j=0;j<data.length;j++)
		{
			if(data[j]==i)
			{
				System.out.println("TAK");
				System.exit(0);
			}
		}
		System.out.println("NIE");
	}

}
