import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pizza {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int a[]=new int[3];
		int pizza=0;
		while(n--!=0)
		{
			Integer n1,n2;
			StringTokenizer st=new StringTokenizer(br.readLine(),"/");
			n1=Integer.parseInt(st.nextToken());
			n2=Integer.parseInt(st.nextToken());
			//store the frequencies of all three slices
			if(n1==1&&n2==4)
			{
				a[0]++;
			}
			if(n1==1&&n2==2)
				a[1]++;
			if(n1==3&&n2==4)
				a[2]++;
		}
			//first take the case of 3/4
			pizza+=a[2];
			//use the 1/4 slices 
			if(a[0]>=a[2])
				a[0]-=a[2];
			else
				a[0]=0;
			//then take the case of 1/2
			pizza+=a[1]/2;
			a[1]=a[1]%2;
			//use the slices of 1/4 for 1/2
			if(a[1]==1)
			{
				pizza+=1;
				if(a[0]>=2)
					a[0]-=2;
				else
					a[0]=0;
			}
			//finally use remaining 1/4 slices
			if(a[0]!=0)
			{
				pizza+=a[0]/4;
				a[0]=a[0]%4;
				if(a[0]!=0)
					pizza++;
			}
			System.out.println(pizza+1);
		
		

	}

}
