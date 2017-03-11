
public class Objs {

	int x;
	public static void main(String[] args) {
		Objs obj1=new Objs();
		obj1.x=12;
		Objs obj2=obj1;
		obj2.x=13;
		System.out.println(obj1.x);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	
	}
}
