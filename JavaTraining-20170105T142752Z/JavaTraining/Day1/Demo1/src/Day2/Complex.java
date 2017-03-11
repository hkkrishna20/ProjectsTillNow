package Day2;

public class Complex {
	
	int a,b;
	 
	public Complex() {
		
	}
	
	public Complex (int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public Complex sum(Complex c1,Complex c2) {
		Complex c3=new Complex();
		c3.a=c1.a+c2.a;
		c3.b=c1.b+c2.b;
		return c3;
	}
	
	@Override
	public String toString() {
		
		return a + "+i" +b;
	}
	
	public static void main(String[] args) {
		Complex c1=new Complex(12,5);
		Complex c2=new Complex(2,5);
		Complex c3=new Complex();
		c3=c3.sum(c1, c2);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
