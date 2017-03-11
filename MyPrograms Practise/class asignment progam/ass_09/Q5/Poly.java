abstract class Vehicle
{
	abstract int numWheels();
}

class Car extends Vehicle
{
	public int numWheels()
	{	
		System.out.print("Car has ");
		return 4;
	}
}

class Truck extends Vehicle
{
	public int numWheels()
	{	
		System.out.print("Truck has ");
		return 6;
	}
}
public class Poly
{
	public static void callnumWheels(Vehicle obj)
	{
		System.out.print(obj.numWheels()+" wheels");
	}
	public static void main(String args[])
	{
		Car c=new Car();
		Truck t=new Truck();

		callnumWheels(c);
		System.out.println();
		callnumWheels(t);
	}
}