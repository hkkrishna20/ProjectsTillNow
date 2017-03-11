import java.util.LinkedHashSet;
import java.util.Set;


public class Link {
 
	public static void main(String[] args) {
		Set s=new LinkedHashSet( );
		
		
		s.add("Manoj");
		s.add("sravani");
		s.add("nikhil");
		s.add("sai");
		s.add("Manoj");
		s.add("venkat");
		s.add("Manoj");
		s.add("sreya");
		s.add("Manoj");
		s.add("venkat");
		s.add("nikhil");
		s.add("mani");
		s.add("Manoj");
		for(Object ob : s) {
		
			System.out.println(ob);
	}
}
}
