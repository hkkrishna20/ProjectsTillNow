
public class ThrowDemo {

	public void show(String name) {
		boolean flag=true;
		if (name.equals("Manoj")) {
			flag=false;
			throw new NumberFormatException("Manoj not allowed");
		}
		
		if (name.equals("Venkat")) {
			flag=false;
			throw new ArithmeticException("Venkat is not allowed");
		}
		
		if (flag==true) {
			System.out.println("Name is "  +name);
		}
	}
	public static void main(String[] args) {
		
			String name="Venkat";
			ThrowDemo obj=new ThrowDemo();
			try {
				obj.show(name);
		} 
		catch (ArithmeticException e) {
						e.printStackTrace();
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
