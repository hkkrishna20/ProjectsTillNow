import sumpack.Sum;
//or import sumpack.*.

import sumpack.subpack.Sub;

import mulpack.Mul;
public class Test 
{
	public static void main(String args[])
	{
		Sum s=new Sum();//or sumpack.Sum s=new sumpack.Sum();
		Sub d=new Sub();
		Mul m=new Mul();

		System.out.println("2+3="+s.add(2,3));
		System.out.println("2-3="+d.diff(2,3));
		System.out.println("2*3="+m.pro(2,3));
		
	}
}