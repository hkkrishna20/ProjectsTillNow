import java.util.Comparator;


public class FirstNameComp implements Comparator {

	@Override
	public int compare(Object ob1, Object ob2) {
		Student s1=(Student)ob1;
		Student s2=(Student)ob2;
		return s2.FirstName.compareTo(s1.FirstName);
	}

	
}


