public class CircleMain
{
	public static void main(String args[])
	{
		Circle c=new Circle(2,1,1);
		c.showArea();
		System.out.println(c.toString());	
	}
}

class Circle
{
	
	private double r,x,y;
	
	Circle(double r,double x,double y)
	{	
		this.r=r;
		this.x=x;
		this.y=y;
	}
	
	double findArea()
	{
		return Math.PI*r*r;
	}
	double findPerimeter()
	{
		return 2*Math.PI*r;
	}
	void showArea()
	{
		System.out.println("Area="+findArea());
	}
	void showPeri()
	{
		System.out.println("Perimeter="+findPerimeter());
	}
	public String toString()
	{	
		String s=new String();
		s="r x y";
		return s;	
	}
}

