public class SI
{
	public static void main(String args[])
	{	
		double p=Double.parseDouble(args[0]);
		double r=Double.parseDouble(args[1]);
		double t=Double.parseDouble(args[2]);
		
		System.out.print("SimpleInterest="+(p*r*t)/100);
	}
}
		