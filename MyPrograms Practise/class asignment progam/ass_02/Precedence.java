public class Precedence
{
	public static void main(String args[])
	{
		int a=10,b=20,c=30;
		int res=a+b*c;
		System.out.println(res);
		res=a+(b*c);
		System.out.println(res);
		res=(a+b)*c;
		System.out.println(res);
	}
}