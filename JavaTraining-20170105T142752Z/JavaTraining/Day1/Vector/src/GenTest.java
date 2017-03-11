class Test<T,V> {
	T t;
	V v;
	public Test(T t, V v) {
		this.t=t;
		this.v=v;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return t.getClass().getSimpleName() + "\n"  +  v.getClass().getSimpleName();
	}
}
public class GenTest {
	public static void main(String[] args) {
		Test obj1=new Test(12,"Ram");
		System.out.println(obj1);
		Test obj2=new Test("Kalyan",45.45);
		System.out.println(obj2);
	}

}
