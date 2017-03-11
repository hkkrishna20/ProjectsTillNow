package Inh;

	class First {
		public void show() {
			System.out.println("Show from class first");
		}
	}
	
	class Second extends First {
		public void display() {
			System.out.println("Show from class second");
		}
	}

public class InhDemo {
	
		public static void main(String[] args) {
			Second obj=new Second();
			obj.show();
			obj.display();
		}
}
