public class RevClass
{
	public static void main(String args[])
	{
		String s=new String();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<args.length;i++)
		{
			s+=args[i];
			sb.append(args[i]);
		}
		System.out.println("Reversed String-"+revString(s));
		System.out.println("Reversed StringBuffer-"+revString(sb));
		
	
	}
	
	public static String revString(String s)
	{	
		int l=s.length();
		int c=0;
		char arr[]=new char[s.length()];
		for(int i=l-1;i>=0;i--)
			arr[c++]=s.charAt(i);
		s=null;
		s=new String();
		for(int i=0;i<l;i++)
			s+=arr[i];
		return s;
	}
	
	public static StringBuffer revString(StringBuffer sb)
	{	
		int l=sb.length();
		int c=0;
		char arr[]=new char[sb.length()];
		for(int i=l-1;i>=0;i--)
			arr[c++]=sb.charAt(i);
		sb=null;
		sb=new StringBuffer();
		for(int i=0;i<l;i++)
			sb.append(arr[i]);
		return sb;
	}
}