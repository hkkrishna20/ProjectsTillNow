
abstract class Animal {
	abstract void name();
	abstract void type();
}

class Lion extends Animal {

	@Override
	void name() {
	System.out.println(" Name is Lion...");
		
	}

	@Override
	void type() {
	System.out.println("Its wild animal");
		
	}
	
}

class Cow extends Animal {

	@Override
	void name() {
		System.out.println("Name is Cow ");
		
	}

	@Override
	void type() {
		System.out.println("It is domestic Animla...");
		
	}
	
}
public class AbsTest {
	public static void main(String[] args) {
		Animal [] obj=new Animal[] 
				{
				
					new Lion( ),
					new Cow( )
				};
		for (Animal a : obj) {
			
			a.name( );
			a.type( );
		}
	}
	
	
}
