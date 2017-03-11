interface Animal1
{	
	int leg=4;
	public void running();
}
interface Bird
{	
	int leg=2;
	public void flying();
}
public class FlyingTiger implements Animal1,Bird
{	
	private int leg=Animal1.leg+Bird.leg;
	public void running()
	{
		System.out.print(" run");
	}
	
	public void flying()
	{
		System.out.print(" fly");
	}
	public static void main(String args[])
	{
		FlyingTiger ft=new FlyingTiger();
		System.out.println("FlyingTiger has "+ft.leg+" legs");
		System.out.print("FlyingTiger can");
	
		ft.running();
		System.out.print(" and");
		ft.flying();
		
	}
	
}