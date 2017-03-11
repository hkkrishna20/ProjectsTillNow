import java.io.*;
public class String2
{
	public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String args[])throws IOException
	{	
		String name=new String();
		String sex=new String();
		String salute=new String();
		
		System.out.print("Name ? ");
		name=br.readLine();
		
		System.out.print("Sex ? ");
		sex=br.readLine();
		
		char nam[]=name.toCharArray();
		int l=name.length();
		char shortname[]=new char[l] ;
		int c=1;
		shortname[0]=nam[0];
		for(int i=1;i<l;i++)
		{
			if(nam[i]==' ')
			{	
				shortname[c]=nam[i+1];
				c++;
			}
		}
	if("female".equals(sex)==true)
		salute="Miss ";
	else	salute="Mr. ";
	
	System.out.print(salute);
	for(int i=0;i<c-1;i++)
		System.out.print(shortname[i]+". ");
	
	int count=0;
	for(int i=0;i<l;i++)
	{
		if(nam[i]==' ')
			count++;
		if(count==c-1)
			System.out.print(nam[i]);
	}
}
}