class Box extends Rectangle
{	
	private double height;
	protected Box()
	{
		height=1;
	}
	
	protected void print()
	{
		System.out.print("height="+height+" ");
		super.print();
	}
	protected double getheight()
	{
		return height;
	}
	protected void setheight(double h)
	{
		height=h;
	}
	
}
	
