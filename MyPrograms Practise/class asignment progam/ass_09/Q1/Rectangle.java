class Rectangle extends Line
{	
	private double width;
	protected Rectangle()
	{
		width=1;
	}
	protected Rectangle(double l,double w)
	{
		width=w;
		length=l;
	}
	
	protected void print()
	{	

		System.out.print("width="+width+"  ");
		super.print();
	}
	protected double getwidth()
	{
		return width;
	}
	protected void setwidth(double w)
	{
		width=w;
	}
	
}
	
