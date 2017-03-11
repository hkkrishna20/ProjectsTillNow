class Dimension
{	
	private double length;
	protected Dimension()
	{
		length=1;
	}
	
	protected Dimension(double l)
	{
		length=l;
	}
	
	protected void print()
	{
		System.out.print("Length="+length+" ");
	}
	protected double getLength()
	{
		return length;
	}
	protected void setLength(double l)
	{
		length=l;
	}
	
}
	
