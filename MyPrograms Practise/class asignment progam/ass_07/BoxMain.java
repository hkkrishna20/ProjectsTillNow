class Box
{
	private double l,b,h;
	
	Box()
	{
		l=1;b=1;h=1;
	}
	
	protected void read(double l,double b,double h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
	}
	
	protected double vol()
	{
		return l*b*h;
	}
	
	protected boolean isCube()
	{
		if(l==b && b==h)
			return true;
		else return false;
	}
	
	protected void write()
	{	
		
		System.out.println("volume="+vol());
		if(isCube()==true)
			System.out.println("Cube");
		else
			System.out.println("Not a Cube");
 				
		
	}
}
	
public class BoxMain
{
	public static void main(String args[])
	{
		Box b=new Box();
		Box b2=new Box();
		
		b2.read(2,3,4);
		
		b.write();
		
		b2.write();
	}
}