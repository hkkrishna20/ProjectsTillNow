
class Emp {
	int empno;
	String name;
	double basic;
	
	public Emp (int empno, String name,double basic) {
		this.empno=empno;
		this.name=name;
		this.basic=basic;
	}
	
	@Override
	public String toString() {
	
		return "Empno " +empno+ " \nName " +name+ " \nSal " + basic;
	}
}
class Manoj extends Emp {

	public Manoj(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
	
}
public class Supcon {
	public static void main(String[] args) {
		Manoj obj=new Manoj(1, "manoj", 50000);
		System.out.println(obj);
		
	}
 
	
}
