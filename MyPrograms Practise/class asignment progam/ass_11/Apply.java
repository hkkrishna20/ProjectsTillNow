public class Apply
{
	public static void main(String args[])
	{
		StringBuffer s=new StringBuffer("National Institute Of Science And Technology");
		System.out.println(s.delete(5,15));
		System.out.println(s.append(78));
		System.out.println(s.insert(4,"NA"));
		System.out.println(s.deleteCharAt(s.length()-1));
		System.out.println(s.replace(0,2,"RA"));
	}
}