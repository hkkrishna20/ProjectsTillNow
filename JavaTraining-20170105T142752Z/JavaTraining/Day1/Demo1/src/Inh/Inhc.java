package Inh;

class c1 {
	public c1() {
		System.out.println("Base class conc");
	}
	
}
class c2 extends c1{
	public c2() {
		System.out.println("Derived class conc");
	}
}

public class Inhc {
	public static void main(String[] args) {
		c2 obj=new c2();
	}
}
