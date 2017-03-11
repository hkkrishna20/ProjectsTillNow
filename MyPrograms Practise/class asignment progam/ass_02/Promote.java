public class Promote
{
	public static void main(String args[])
	{
		byte b=42;
		char c='s';
		short s=1024;
		int i=50000;
		float f=5.67f;
		double d=.1234;
		
		System.out.println((int)c);
		double result=(i/c);
		System.out.println(result);

		result=(f*b);
		System.out.println(result);

		result=(d*c);
		System.out.println(result);
		
		result=(f*b)+(i/c)-(d*c);
		System.out.println(result);



		
	}
}