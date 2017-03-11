
public class DivEx {

	public static void main(String[] args) {
		int a,b,c;
		try {
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			c=a/b;
			System.out.println("Division " +c);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Args are not passed.");
		}
		catch (ArithmeticException e) {
			System.out.println("Division by zero impossible");
		}
		catch (NumberFormatException e) {
			System.out.println("String cannot be converted in to int");
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		finally {
			System.out.println("Program by Java hyd batch");
		}
	}
}
