import java.io.*;
class Complex
{	
	
	double real,img;
	Complex()
	{
		real=0;
		img=0;
	}
	
	Complex(double x,double y)
	{
		real=x;
		img=y;
	}
	protected void read()
	{	
		
		System.out.println("real part="+real);
		System.out.println("imaginary part"+img);
	}
	protected boolean equals(Complex c1)
		{
			if((this.real==c1.real) && (this.img==c1.img))
				return true;
			else 	return false;
		}
	public String toString()
		{
			return "toString() Overridden";
		}
	
}

public class MainComplex
{	
	public static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	public static void main(String args[])throws IOException
	{	
		double real,img;
		System.out.print("real ? ");
		real=Double.parseDouble(br.readLine());

		System.out.print("imagionary ? ");
		img=Double.parseDouble(br.readLine());
		
		Complex c=new Complex(real,img);
		c.read();
		
		Complex c2=new Complex(2,3);
		boolean b=c.equals(c2);
		if(b==true)
			System.out.print("Equal");
		else	System.out.print("Not Equal");
		
		System.out.println(c.toString());
	}
}
