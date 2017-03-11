public class StaticBlock
{
	static int i=12;
	public static void show()
	{
		System.out.println("I'm static method");
		System.out.println("i="+i);
	}
	public static void main(String[] args)
	{
		StaticBlock.show();
		++i;
		System.out.println("I'm in main:");
		System.out.println("i="+i);
	}
	static
	{
		System.out.println("i="+i);		
		System.out.println("I'm static block1");
	}
	static
	{

		System.out.println("I'm static block2");
	}
}
