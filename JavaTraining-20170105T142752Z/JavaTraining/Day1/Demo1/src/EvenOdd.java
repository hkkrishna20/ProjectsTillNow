
public class EvenOdd {

	public void check(int n) {
		if(n%2==0) {
			System.out.println("The number is Even");
		}
		else {
			System.out.println("The number is odd");
		}
	}
	public static void main(String[] args) {
		int n=25;
		EvenOdd obj=new EvenOdd();
		obj.check(n);
	}
}
