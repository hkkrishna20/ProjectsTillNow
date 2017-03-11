package Day2;

public class Cons {
	static int x;
	double y;
	static {
		x=12;
		System.out.println("Static Block");
	}
	
	public Cons() {
		y=12.5;
	
		System.out.println("Default Block");
	}
	
	public static void main(String[] args) {
		
			System.out.println(Cons.x);
			
	}

}
