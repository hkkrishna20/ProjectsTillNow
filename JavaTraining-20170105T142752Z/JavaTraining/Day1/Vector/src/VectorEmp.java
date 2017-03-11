import java.util.Vector;


public class VectorEmp {
	
	public static void main(String[] args) {
		Vector<Employ> v=new Vector<Employ> ( );
			v.addElement(new Employ(1,"Hari",43635));
			v.addElement(new Employ(2,"manoj",43635));
			v.addElement(new Employ(3,"swetha",43635));
			v.addElement(new Employ(4,"mani",43635));
		
			
			for(Employ e: v) {
				System.out.println(e);
			
		}
	}

}
