public class Bakery
{
	public static void main(String args[])
	{
		Cake c=new Cake(1);
		Pizza p=new Pizza(1);
		
		Bake(c);
		Bake(p);

	}
	
	static void Bake(Cake c)
	{
		System.out.print((c.size/2)+" cake Baked");
	}
	
	static void Bake(Pizza p)
	{
		System.out.print((p.size/4)+" pizza Baked");
	}
}

class Cake
{
	double size;
	Cake(double csize)
	{
		size=csize;
	}
	
}

class Pizza
{
	double size;
	Pizza(double psize)
	{
		size=psize;
	}
	
	
}