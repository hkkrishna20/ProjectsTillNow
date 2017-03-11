import java.util.Comparator;


public class CgpaComp implements Comparator{

	@Override
	public int compare(Object ob1, Object ob2) {
		Student s1=(Student)ob1;
		Student s2=(Student)ob2;
		if(s1.cgpa >= s2.cgpa) {
			return -1;
		}
		else {
			return 1;
		}
	
	}

	
}
