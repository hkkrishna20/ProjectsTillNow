package Day2;

public class This {

	int a,b;
	public This() {
		
	}
	public This (int a, int b) {
		this.a=a;
		this.b=b;
		
	}
	@Override
	public String toString() {
				return "A value is " +a + "B value is" +b;
	}
	public static void main(String[] args) {
		This obj=new This(23,45);
	System.out.println(obj);
	This obj1=new This(3,6);
	System.out.println(obj1);
	}
}
