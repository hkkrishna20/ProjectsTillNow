
public class Student {

	String FirstName;
	String LastName;
	String City;
	double  cgpa;
	
	public Student( ) {
		
	}
	
	public Student (String FirstName, String Lastname, String City,double cgpa) {
		
		this.FirstName=FirstName;
		this.LastName=Lastname;
		this.City= City;
		this.cgpa=cgpa;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name " +FirstName+ "City  " +City+  "Grade  " +cgpa;
	}
}
