public class Swap
{
	public static void main(String args[])
	{	
		double a=Double.parseDouble(args[0]);
		double b=Double.parseDouble(args[1]);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("args[0]="+a);
		System.out.println("args[1]="+b);
		
	}
}