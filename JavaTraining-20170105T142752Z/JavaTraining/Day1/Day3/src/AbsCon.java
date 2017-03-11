
abstract class Employ {
	int empno;
	String name;
	double basic;
	
	public Employ (int empno,String name, double basic) {
		this.empno=empno;
		this.name=name;
		this.basic=basic;
	}
	
	@Override
	public String toString() {
		
		return "Empno  " +empno+ " Name  " + name+ "Sal  " + basic;
	}
}

class Sai extends Employ {

	public Sai(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
	
	
}

public class AbsCon {
 
	public static void main(String[] args) {
		Employ obj=new Sai(1, "Manoj", 500000);
		System.out.println(obj);
	}
}
