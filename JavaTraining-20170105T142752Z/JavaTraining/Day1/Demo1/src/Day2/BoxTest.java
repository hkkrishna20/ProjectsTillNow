package Day2;

public class BoxTest {

	public void show(Object ob) {
		String type=ob.getClass().getSimpleName();
		// System.out.println(type);
		if(type.equals("Integer")) {
			int x=(Integer)ob;
			System.out.println("Integer Casting" +x);
		}
		if(type.equals("Double")) {
			double y=(Double)ob;
			System.out.println("Double Casting" +y);
		}
		if(type.equals("String")) {
			String name=(String)ob;
			System.out.println("String Casting" +name);
		}
		}
	public static void main(String[] args) {
		int x=12;
		double y=12.5;
		String name= " Manoj";
		
		BoxTest obj=new BoxTest();
		obj.show(x);
		obj.show(y);
		obj.show(name);
	}
}
