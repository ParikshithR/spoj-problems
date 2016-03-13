import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.Buffer;


public class AntiBlot {

	/**
	 * @param args
	 * @param  
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//BufferedOutputStream bos=new BufferedOutputStream(System.out);
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int n=0;
		try {
			n = Integer.parseInt(br.readLine());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		while(n--!=0)
		{
			try{
			//bw.newLine();
			//bw.write("\n");
			bw.write("\n");
			bw.flush();
			
			
			String s=br.readLine();
			String []exp=s.split("[+]");
			String s1=exp[0].trim();
			exp=exp[1].split("=");
			String s2=exp[0].trim();
			String s3=exp[1].trim();
			if(s1.indexOf("m")!=-1)
			{
				int n2=Integer.parseInt(s2);
				int n3=Integer.parseInt(s3);
				
				bw.write(((n3-n2)+" + "+s2+" = "+s3+"\n"));
				bw.flush();
				continue;
			}
			if(s2.indexOf("m")!=-1)
			{
				int n1=Integer.parseInt(s1);
				int n3=Integer.parseInt(s3);
				bw.flush();
				continue;
			}
			if(s3.indexOf("m")!=-1)
			{
				int n1=Integer.parseInt(s1);
				int n2=Integer.parseInt(s2);
				bw.write((s1+" + "+s2+" = "+(n1+n2)+"\n"));
				bw.flush();
				continue;
			}
			}
			catch(Exception e){}
			
			
		}
	}

}
