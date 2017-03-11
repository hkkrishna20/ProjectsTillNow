class Scope
{
	public static void main(String args[])
		{
			int x=10;
			if(x==10)
				{
					int y=10;
					System.out.println("x and y;"+x+" "+y);
					x*=2;
				}
			System.out.println("x is:"+x);
		}
}