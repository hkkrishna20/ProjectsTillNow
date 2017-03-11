import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;


public class SortStudent {
	
	public static void main(String[] args) {
		Comparator<Student> c=new FirstNameComp( );
		SortedSet<Student> s=new TreeSet<Student>(c );
		
		s.add(new Student("Nikhil","Teja","Hyd",4.5));
		s.add(new Student("Manoj","venkat","vij",4.6));
		s.add(new Student("sreya","swetha","sec",4.7));
		s.add(new Student("xyz","abc","kkd",4.4));
		for (Student s1 : s) {
			System.out.println(s1);
		}
		
	}

}
