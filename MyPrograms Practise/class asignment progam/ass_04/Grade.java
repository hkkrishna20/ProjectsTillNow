import java.io.*;
public class Grade
{
	public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String args[])throws IOException
		{
			String grade;
			float a,b,c,d,f;
			a=4;b=3;c=2;d=1;f=0;
			System.out.print("Enter grade? ");
			grade=br.readLine();
			
			if((grade.charAt(0)=='A'||grade.charAt(0)=='a'))
				System.out.println(grade+"\'s Numeric Value="+a);
			
		   else	if((grade.charAt(0)=='B'||grade.charAt(0)=='b'))
				System.out.println(grade+"\'s Numeric Value="+b);

		   else	if((grade.charAt(0)=='C'||grade.charAt(0)=='c'))
				System.out.println(grade+"\'s Numeric Value="+c);

      		   else	if((grade.charAt(0)=='D'||grade.charAt(0)=='d'))
				System.out.println(grade+"\'s Numeric Value="+d);

     		   else	if((grade.charAt(0)=='F'||grade.charAt(0)=='f'))
				System.out.println(grade+"\'s Numeric Value="+f);
			else System.out.println("Invalid Grade");
			
		}
}
		