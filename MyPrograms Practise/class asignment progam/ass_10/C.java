public class C
{
	public static void main(String args[])
	{
		Outer.Inner1.Inner2.Inner3 i=new Outer().new Inner1().new Inner2().new Inner3();
	
		i.display();
	}
}