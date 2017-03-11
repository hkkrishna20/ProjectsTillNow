public class PalindromClass
{
	public static void main(String args[])
	{
		System.out.println("No. of palindrom strings="+numPalindrom(args));
	}
	
	public static int numPalindrom(String s[])
	{	
		int count=0,l;
		char chararr[];
		for(int i=0;i<s.length;i++)
		{	
			l=s[i].length();
			chararr=new char[s[i].length()];
			for(int j=0;j<l;j++)
			{
				
				chararr[j]=s[i].charAt(l-1-j);
			}
			
			if(s[i].equals(valueOf(chararr))==true)
				count++;
			chararr=null;
		}
		
		return count;
		
	}
		
}