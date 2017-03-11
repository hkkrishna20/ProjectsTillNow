public class Outer
{	
	int x=10;
	
	public class InnerOne extends Base
	{
		int x=100;
		void showX()
		{
			System.out.println("x of InnerOne "+x);
			System.out.println("x of Base "+super.x);
		}
	}
	
	
	
	 class InnerTwo extends Outer{}
	
	public void  accessMe()
	{
		System.out.println("x of Outer "+x);
	}
}
class Base
{
	int x=200;
}
