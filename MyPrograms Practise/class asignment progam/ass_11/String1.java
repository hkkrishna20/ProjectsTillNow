import java.io.*;
public class String1
{
	public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String args[])throws IOException
	{	
		String s[]=new String[6];
		for(int i=0;i<6;i++)
		{
			System.out.print("String "+(i+1)+"  ? ");	
			s[i]=br.readLine();
		}
		
		String max=s[0];
		String min=s[1];
		
		for(int i=0;i<6;i++)
		{	
			//System.out.println(max+"  "+min+"\n");
			if(max.compareTo(s[i])>0)
				{
					max=null;
					max=new String();
					max=s[i];
				}
			if(min.compareTo(s[i])<0)
				{
					min=null;
					min=new String();
					min=s[i];
				}
		}
	
	System.out.println("Lexicographic Maximum="+max);
	System.out.println("Lexicographic Minimum="+min);
		
	}
}