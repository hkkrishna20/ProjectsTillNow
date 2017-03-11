import java.util.HashSet;
import java.util.Set;


public class SetDemo {

	public static void main(String[] args) {
		Set s=new HashSet ();
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
