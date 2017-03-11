import java.util.Comparator;
import java.util.TreeSet;


public class SortStudent {
	
	public static void main(String[] args) {
		Student s1=new Student("Nikhil","Teja","hyderabad", 4.3);
		Student s2=new Student("Venkat","manoj","nuzvid", 4.9);
		Student s3=new Student("sreya","satya","bhimvaram", 4.2);
		Student s4=new Student("mani","sai","ongole", 4.5);
		Student s5=new Student("hari","krishna","tirupati", 4.6);
		
		//Comparator c=new FirstNameComp( );
		Comparator c=new CgpaComp( );
		TreeSet ts=new TreeSet(c );
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		
		for(Object ob : ts) {
			Student s=(Student)ob;
			System.out.println(s);
		}

		
		
	}

}
