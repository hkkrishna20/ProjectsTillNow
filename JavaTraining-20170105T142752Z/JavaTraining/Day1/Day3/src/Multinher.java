interface Ione {
	void name( );
}

interface Itwo {
	void email( );
}

class Test implements Ione,Itwo {

	@Override
	public void email() {
		System.out.println("Email is tejasri.harshitha@gmail.com");
		
	}

	@Override
	public void name() {
		System.out.println("  tejasri.harshitha");
	}
	
}

class Test1 implements Ione,Itwo {

	@Override
	public void email() {
		System.out.println("Email is sriharshitha reddy@gmail.com");
		
	}

	@Override
	public void name() {
		System.out.println("  reddy");
	}
	
}

public class Multinher {
	public static void main(String[] args) {
		
		Ione [] obj=new Ione[] {
				new Test(), new Test1( )
		}; 
		
		Itwo[] obj1=new Itwo[] {
				new Test(), new Test1( )
		};
		
		
		for (Ione i : obj) {
			i.name( ); 
		
			
			for (Itwo  m : obj1) {
				
				m.email( );
			}
		
		}
	
		
		
	}


}
