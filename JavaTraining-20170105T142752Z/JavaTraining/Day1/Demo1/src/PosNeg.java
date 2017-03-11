
public class PosNeg {
	
	public void check(int n) {
		
		if (n>0) {
			System.out.println("Number is Positive" );
		}
		else {
			System.out.println("Number is Negative");
		}
	}
	public static void main(String[] args) {
		
		int n=10;
		PosNeg obj=new PosNeg();
		obj.check(n);
	}

}
