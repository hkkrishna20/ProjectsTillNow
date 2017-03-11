import java.io.*;

public class PalinCheck
{
	public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String args[])throws IOException
	{
		String s=new String();
		int flag=0;
		System.out.print("Enter any String ? ");
		s=br.readLine();

		char schar[]=s.toCharArray();
		int l=s.length();
		
		char snewchar[]=new char[l];

		int lnew=l;
		for(int i=0;i<l;i++)
		{
			snewchar[i]=schar[i];
			
		}
		
		for(int i=0;i<l;i++)
		{
			if(schar[i]!=schar[lnew-1])
				{
					flag=1;
					break;
				}
			lnew--;
		}
		if(flag==0)
		System.out.print("Palindrome");
		else
		System.out.print("Not Palindrome");
		
	}
}