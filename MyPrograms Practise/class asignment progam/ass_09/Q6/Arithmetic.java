interface SubSum
{
	double sub(double x,double y);
	double sum(double x,double y);
}
interface MulDiv extends SubSum
{
	public double mul(double x,double y);
	public double div(double x,double y);
}
public class Arithmetic implements MulDiv
{
	int abs(int x)
	{
		if(x<0)
			return -x;
		else
			return x;
	}
	
	public double sub(double x,double y)
	{
		return x-y;
	}
	public double sum(double x,double y)
	{
		return x+y;
	}
	public double mul(double x,double y)
	{
		return x*y;
	}
	public double div(double x,double y)
	{
		return x/y;
	}
	public static void main(String args[])
	{
		Arithmetic ar=new Arithmetic();
		System.out.println("sum="+ar.sum(2.5,4));
		System.out.println("difference="+ar.sub(2.5,4));
		System.out.println("product="+ar.mul(2.5,4));
		System.out.println("division="+ar.div(2.5,4));
	
		SubSum ss;
		ss=ar;
		System.out.println("sum="+ss.sum(2.5,4));
		System.out.println("difference="+ss.sub(2.5,4));
		//System.out.println("product="+ss.mul(2.5,4));//errors
		//System.out.println("division="+ss.div(2.5,4));//errors
		
		MulDiv md;
		md=ar;
		System.out.println("sum="+md.sum(2.5,4));
		System.out.println("difference="+md.sub(2.5,4));
		System.out.println("product="+md.mul(2.5,4));
		System.out.println("division="+md.div(2.5,4));
	
		System.out.println("absolute="+ar.mod(-6));
		//System.out.println("absolute="+ss.mod(-6));//errors
		//System.out.println("absolute="+md.mod(-6));//errors
			
		
	}
	
}