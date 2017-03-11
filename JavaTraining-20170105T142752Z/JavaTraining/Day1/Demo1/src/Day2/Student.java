package Day2;

public class Student {
	
	int sno;
	String name;
	char grade;
	
	@Override
	public String toString() {
		
		return " Sno: " +sno + " Name: " +name + " Grade: " +grade;
	}
	
	public static void main(String[] args) {
		Student s1=new Student();
		s1.sno=1;
		s1.name="Manoj";
		s1.grade='a';
		System.out.println(s1);
		
	}

}
