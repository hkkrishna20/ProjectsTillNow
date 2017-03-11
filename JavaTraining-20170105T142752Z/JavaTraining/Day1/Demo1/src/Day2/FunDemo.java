package Day2;

public class FunDemo {

	void show(int x) {
		System.out.println("Show with int parameter" +x);
	}
	void show(double x) {
		System.out.println("Show with Double parameters" +x);
	}
	void show(String x) {
		System.out.println("Show with String parameters" +x);
	}
	void show(boolean x) {
		
	}
	public static void main(String[] args) {
		FunDemo obj=new FunDemo();
		obj.show(12);
		obj.show(12.5);
		obj.show("Java");
		obj.show(true);
	}
}

		