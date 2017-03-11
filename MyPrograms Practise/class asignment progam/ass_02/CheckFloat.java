import java.lang.Math.*;
import java.io.*;
public class CheckFloat
{
	public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String args[])throws IOException
		{
			float f;
			System.out.print("Enter a float number ? ");
			f=Float.parseFloat(br.readLine());
			if(f==0)
				System.out.println("Exactly equal to zero");
			else if(Math.round(f)==0)
				System.out.println("Close to zero");
			else
				System.out.println("Not equal to zero");
				
			
		}
}