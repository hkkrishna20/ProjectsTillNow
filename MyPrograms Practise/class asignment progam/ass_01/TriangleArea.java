import java.io.*;
import java.lang.Math.*;
public class TriangleArea
	{
	public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String args[])throws IOException
		{
		double a,b,c;
		double s,area;
		System.out.println("Enter the sides of Triangle--");
		System.out.print("a?");
		a=Double.parseDouble(br.readLine());
		System.out.println("");

		System.out.print("b?");
		b=Double.parseDouble(br.readLine());
		System.out.println("");

		System.out.print("c?");
		c=Double.parseDouble(br.readLine());
		System.out.println("");

		s=(a+b+c)/2;
		area=Math.round(0.5*Math.sqrt((s-a)*(s-b)*(s-c)));
		
		System.out.println("Area="+area);
		}
}