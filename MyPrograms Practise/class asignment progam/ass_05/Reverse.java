import java.io.*;

public class Reverse
{
	public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String args[])throws IOException
	{
		String s=new String();
		System.out.print("Enter any String ? ");
		s=br.readLine();

		char schar[]=s.toCharArray();
		int l=s.length();
		
		char snewchar[]=new char[l];

		int lnew=l;
		for(int i=0;i<l;i++)
		{
			snewchar[lnew-1]=schar[i];
			lnew--;
		}
		
		System.out.print("Reversed String-");
		for(int i=0;i<l;i++)
		System.out.print(snewchar[i]);
	}
}