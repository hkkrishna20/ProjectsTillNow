public class Access
{
	public static void main(String args[])
	{
		Outer.InnerTwo innertwo=new Outer().new InnerTwo();
		innertwo.accessMe();
		Outer.InnerOne innerone=innertwo.new InnerOne();
		
		innerone.showX();
	}
}