
class C1 {
		 public void show( ) {
			 System.out.println("Show from class C1");
		 }
}

class C2 extends C1 {
	public void show( ) {
		super.show();
		System.out.println("Show from class C2");
	}
}


public class SuperDemo {

		 public static void main(String[] args) {
			C2 obj=new C2();
			obj.show();
		}
}
