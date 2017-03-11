
public class SumDemo {
	
	public void sum(int a,int b) {
		int c=a+b;
		System.out.println("The sum of a and b is" +c);
	}
	
	public void sub(int x,int y) {
		int z=x-y;
		System.out.println(" The subtraction of x and y is" +z);
	}
	
	public void mul(int p,int q) {
		int r=p*q;
		System.out.println("The multiplication of p and q is" +r);
	}
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		
		SumDemo obj=new SumDemo();
		obj.sum(a, b);
		obj.sub(a, b);
		obj.mul(a, b);
	}

}
