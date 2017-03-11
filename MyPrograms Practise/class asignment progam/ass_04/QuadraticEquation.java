import java.io.*;
import	java.lang.Math.*;
public class QuadraticEquation
{
	public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String args[])throws IOException
		{
			double a,b,c;
			System.out.println("Enter the value for the Coefficient of the Quadratic Equation aX^2 + bx + c=0");					System.out.print("a ?");
			a=Double.parseDouble(br.readLine());
		
			System.out.print("b ?");
			b=Double.parseDouble(br.readLine());

			System.out.print("c ?");
			c=Double.parseDouble(br.readLine());
			
			Equation e=new Equation(a,b,c);
			double root1,root2;
			if(e.hasSolution()==true)
				{	
					root1=e.getSolution1();												root1=e.getSolution1();
					root2=e.getSolution2();
					System.out.println("root1="+root1);
					System.out.println("root1="+root2);
				}
			else
				System.out.print("No real roots");			
			
		}
}


class Equation
{
	double a,b,c;

	public Equation(double x,double y,double z)
		{
			a=x;b=y;c=z;
		}
	public double getD()
		{
			return b*b-(4*a*c);
		 }
	
	public boolean hasSolution()
		{
			if(getD()>0)
				return true;
			else	
				return false;
		}
	public double getSolution1()
		{	
			return (-b+Math.sqrt(getD()))/(2*a);	
		}
	
	public double getSolution2()
		{	
				return (-b-Math.sqrt(getD()))/(2*a);
		}


}