abstract class Fruit
{
	abstract public String toString();
}
class Apple extends Fruit
{	
	String colour="red";
	public String toString()
	{
		return "Apple "+colour;
	}
}
	
class Banana extends Fruit
{	
	String colour="yellow";
	public String toString()
	{
		return "Banana "+colour;
	}
}

class Orange extends Fruit
{	
	String colour="orange";
	public String toString()
	{
		return "Orange "+colour;
	}
}
class Application
{	
	public static void calltoString(Fruit f)
	{
		System.out.println(f.toString());
	}
	public static void main(String args[])
	{
		Banana b=new Banana();
		Orange o=new Orange();
		Apple a=new Apple();
		
		calltoString(a);
		calltoString(o);
		calltoString(b);
	}
}
