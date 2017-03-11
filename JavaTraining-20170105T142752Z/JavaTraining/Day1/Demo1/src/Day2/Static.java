package Day2;

public class Static {
	public void show() {
		System.out.println(" From show method");
	}
	
	public static void display() {
		System.out.println("From Display method");
	}
	public static void main(String[] args) {
		Static.display();
		new Static().show();
	}
}
