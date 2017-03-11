
class Data<T> {
	public void swap(T a,T b) {
		T t;
		t=a;
		a=b;
		b=t;
		System.out.println("A value  " +a + "  B value" + b);
	}
}

public class Gen {

	public static void main(String[] args) {
		Data obj=new Data( );
		int a=12,b=5;
		obj.swap(a, b);
		double a1=3.34,b2=231.4;
		obj.swap(a1, b2);
	}
}
