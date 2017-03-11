package accesstest2;
import accesstest.*;
/*public class InsideDifferentPackage
{							//only public access
	public static void main(String args[])
	{
		System.out.println(AccessTest.pub);
		//System.out.println(AccessTest.pro);
		//System.out.println(AccessTest.pri);
		//System.out.println(AccessTest.d);
	}
}*/

class  InsideDifferentPackage extends AccessTest
{
	
		public static void main(String args[])
	{
		System.out.println(AccessTest.pub);
		System.out.println(AccessTest.pro);
		//System.out.println(AccessTest.pri);
		//System.out.println(AccessTest.d);
	}
}
	
//private can be accessed only inside the same class in which it is declared
//default is accessible only within the same package in which it is declared