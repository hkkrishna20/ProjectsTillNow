public class Triangle
{
	public static void main(String args[])
	{	
		double a=Double.parseDouble(args[0]);
		double b=Double.parseDouble(args[1]);
		double b=Double.parseDouble(args[2]);
		
		
		if(((a*a+b*b)==(c*c)) ||((b*b+c*c)==(a*a))||((a*a+c*c)==(b*b)))
			{
				System.out.print("Right Triangle");
			}
	}
}
		