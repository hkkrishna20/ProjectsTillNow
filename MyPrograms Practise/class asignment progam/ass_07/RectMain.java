public class RectMain
{
	public static void main(String args[])
	{
		Rect r=new Rect(2,3);
		r.showArea();
		r.showPeri();
	}
}

class Rect
{
	
	private double l,b;
	
	Rect(double l,double b)
	{
		this.l=l;
		this.b=b;
	}
	
	double area()
	{
		return l*b;
	}
	double perimeter()
	{
		return 2*(l+b);
	}
	void showArea()
	{
		System.out.println("Area="+area());
	}
	void showPeri()
	{
		System.out.println("Perimeter="+perimeter());
	}
}

