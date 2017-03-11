class InvalidEmailException extends Exception {
	public InvalidEmailException (String error) {
		super(error);
	}
}

class InvalidUserException extends Exception {
	public InvalidUserException (String error) {
		super(error);
	}
}


public class ExcepEg {
	
	public void show(String email) throws InvalidEmailException {
		if(email.contains ("\\@") )
				{
			          boolean flag=false;
			          throw new InvalidEmailException("Enter correct email");
			}
		
	}
	public static void main(String[] args) {
		String email=args[30];
		ExcepEg obj=new ExcepEg();
		try {
			obj.show(email);
		} catch (InvalidEmailException e) {
		
			e.printStackTrace();
		}
		
	}

}
