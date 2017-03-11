
class NegativeException extends Exception {
	public NegativeException (String error) {
		super(error);
	}
}
class NumberZeroException extends Exception {
	public NumberZeroException (String error) {
		super(error);
	}
}

public class Custom {
	
	public void sum (int a, int b) throws NegativeException, NumberZeroException {
		boolean flag=true;
		if(a < 0 || b < 0 ) {
			flag=false;
			throw new NegativeException("Negative Nos not allowed");
		}
		
		if( a==0 || b==0) {
			flag=false;
			throw new NumberZeroException("Zero is invali value");
		}
		
		if (flag==true) {
			int c=a+b;
			System.out.println("Sum " +c);
		}
	}
	 public static void main(String[] args) {
		 
		 int a,b;
		 a=5;
		 b=7;
		 Custom obj=new Custom();
		 try {
			obj.sum(a, b);
		} catch (NegativeException e) {

			e.printStackTrace();
		} catch (NumberZeroException e) {
	
			e.printStackTrace();
		}
	}
}
