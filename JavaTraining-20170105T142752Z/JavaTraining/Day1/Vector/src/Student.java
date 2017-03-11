
public class Student {
	
	String firstName;
	String lastName;
	String city;
	double cgpa;
	
	public Student( ) {
		
	}
	
public Student (String FirstName, String Lastname, String City,double cgpa) {
		
		this.firstName=FirstName;
		this.lastName=Lastname;
		this.city= City;
		this.cgpa=cgpa;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name " +firstName+ "LastName"  +firstName+ "City  " +city+  "Grade  " +cgpa;
	}

}
