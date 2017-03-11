public class Temperature
{
	public static void main(String args[])
		{	
			double Fahr=62.5;
			double Celcius=F2C(Fahr);
			System.out.println("Fahrenheit "+Fahr+"=Celcius"+Celcius);
		}


static double F2C(double f)
	{
		return (double)5/9*(f-32);
	}
}