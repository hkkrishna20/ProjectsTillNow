
public class While {

	public void show() {
		int i=7;
		while(i>3) {
			System.out.println("Welcome to Java");
			i--;
		}
	}
	public static void main(String[] args) {
		
		While obj=new While();
		obj.show();
	}
}
