public class CommandLine
{
	public static void main(String args[])
		{
			System.out.println("String array length = "+args.length);
	
			for(int i=0;i<args.length;i++)
			System.out.println(args[i]+" has length="+args[i].length());
		}
}