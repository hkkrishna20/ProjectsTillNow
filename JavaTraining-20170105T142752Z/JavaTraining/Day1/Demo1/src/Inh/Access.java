package Inh;

class Test {
	private int x=12;
	public double y=13.7;
	protected String name="Manoj";
	String topic="java";
	public void show() {
		Test obj=new Test();
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.name);
		System.out.println(obj.topic);
		
	}
}

class Data {
	public void show() {
		Test obj=new Test();
		//System.out.println(obj.x); //Not accessed
		System.out.println(obj.y);
		System.out.println(obj.name);
		System.out.println(obj.topic);
	}
}

class C11 extends Test {
	public void show() {
		Test obj=new Test();
		//System.out.println(obj.x); //Not accessed
		System.out.println(obj.y);
		System.out.println(obj.name);
		System.out.println(obj.topic);
}
class Demo {
	
	
}

public class Access {

}

}
