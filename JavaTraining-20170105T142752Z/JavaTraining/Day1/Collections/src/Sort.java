import java.util.SortedSet;
import java.util.TreeSet;


public class Sort {

	public static void main(String[] args) {
		SortedSet s=new TreeSet( );
		s.add("Manoj");
		s.add("venkat");
		s.add("sreya");
		s.add("sai");
		s.add("mani");
		s.add("nik");
		s.add("priy");
		s.add("Manoj");
		s.add("Manoj");
		System.out.println("Sorted data");
		for (Object ob : s) {
			System.out.println(ob);
		}
	}
}
