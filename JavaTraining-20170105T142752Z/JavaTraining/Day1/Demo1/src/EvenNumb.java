
public class EvenNumb {

	public void show(int n) {
		int i=0;
		while (i<20) {
			i=i+2;
			System.out.println("Even " +i);
		}
	}
	public static void main(String[] args) {
		int n=20;
		EvenNumb obj=new EvenNumb();
		obj.show(n);
	}
}
