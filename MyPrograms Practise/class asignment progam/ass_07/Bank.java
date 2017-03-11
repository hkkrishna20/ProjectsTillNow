import java.io.*;
public class Bank
{	
	public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String args[])throws IOException
	{	
		System.out.print("Enter transaction amount? ");
		String transamount=(br.readLine());

		int l=transamount.length();
		char ch=checkRange(transamount);
		
		switch(ch)
		{
			case 'l':Account a=new Account(Long.parseLong(transamount));
				System.out.print("Saving Account Created");break;
			case 'f':Account b=new Account(Float.parseFloat(transamount));
				System.out.print("Current Account Created");break;
			case 'd':Account c=new Account(Double.parseDouble(transamount));
				System.out.print(" Recurring Account Created");break;
			default:System.out.print("Invalid Amount");
		}
	}
	
	public static char checkRange(String s)
	{
		if(Long.parseLong(s)>0 && Long.parseLong(s)<Math.pow(2,63))
			return 'l';
		
	else if(Float.parseFloat(s)>0 && Float.parseFloat(s)<3.4*Math.pow(10,38))
			return 'd';
		
	else return 'i';}
}

class Account
{
	long l;
	double d;
	float f;
	
	Account(long l)
		{
			this.l=l;
		}
	
	
	Account(float f)
		{
			this.f=f;
		}
	
	
	Account(double d)
		{
			this.d=d;
		}
	double withdrawLong(long w)
		{
			l=l-w;
			return l;
		}
	
	double withdrawFloat(float w)
		{
			f=f-w;
			return f;
		}

	double withdrawDouble(double w)
		{
			d=d-w;
			return d;
		}
}