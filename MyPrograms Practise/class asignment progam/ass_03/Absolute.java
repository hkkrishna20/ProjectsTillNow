import java.io.*;
public class Absolute
{
	public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	public static void main(String args[])throws IOException
		{
			double d;
			System.out.println("Enter any number ? ");
			d=Double.parseDouble(br.readLine());
		
			d=(d>0)?d:(-d);
			System.out.println("Absolute("+d+")="+d);
		}
} 