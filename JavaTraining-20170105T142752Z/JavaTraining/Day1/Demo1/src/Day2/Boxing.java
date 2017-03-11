package Day2;

public class Boxing {
 
	public static void main(String[] args) {
		int x=12;
		double y=1.4;
		String s="manoj";
		/*Boxing*/
		Object obj1=x;
		Object obj2=y;
		Object obj3=s;
		/*Unbox*/
		int x1=(Integer)obj1;
		double y1=(Double)obj2;
		String s1=(String)obj3;
		System.out.println(++x1);
		System.out.println(y1);
		System.out.println(s1);

	}
}
