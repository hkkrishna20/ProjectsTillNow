interface Idata {
	void name ( );
	void email( );
}

class Hari implements Idata {

	@Override
	public void name() {
		System.out.println("Name is Hari..");
			
	}

	@Override
	public void email() {
		System.out.println(" Email is Hari@gmail.com");
	}
	
}

class Narayana implements Idata {

	@Override
	public void name() {
		System.out.println("Name is narayana");		
	}

	@Override
	public void email() {
		System.out.println("Email is narayana@gmail.com");
	}
	
}
public class Interface {
	public static void main(String[] args) {
		Idata[] arr=new Idata[] {
				new Hari( ), new Narayana( ) };
		for (Idata i : arr) {
			i.name( );
			i.email();
		}
	}

}
