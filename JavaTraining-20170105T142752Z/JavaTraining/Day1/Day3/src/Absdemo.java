
abstract class Training {
	
	abstract void name ( );
	abstract void email( );
}

class Mani extends Training {

	@Override
	void name () {
		System.out.println("Name is Manoj");
		
	}

	@Override
	void email() {
		System.out.println("Email is venkat.manoj75mail.com");
		
	}
	
	
}

class Sreya extends Training {

	@Override
	void name() {
		System.out.println("Name is sreya");
		
	}

	@Override
	void email() {
		System.out.println("Email is sreya75mail.com");
		
	}
	
	
}

class Venkat extends Training {

	@Override
	void name() {
		System.out.println("Name is venkat");
		
	}

	@Override
	void email() {
		System.out.println("Email is venkat75mail.com");
		
	}
	
	
}

public class Absdemo {
 
	public static void main(String[] args) {
		
		Training [] arr=new Training []{
			
			new Mani( ),
			new Sreya( ),
			new Venkat( )
				
					};
		for (Training t : arr) {
			t.name( );
			t.email ( );
		}
	}
	
}
