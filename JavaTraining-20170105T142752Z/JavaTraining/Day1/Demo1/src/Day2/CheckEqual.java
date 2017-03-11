package Day2;

public class CheckEqual {

	int empno;
	String ename;
	double basic;
	
	public CheckEqual() {
		
	}
	public CheckEqual(int empno,String ename,double basic) {
		this.empno=empno;
		this.ename=ename;
		this.basic=basic;
	}
	
	@Override
	public boolean equals(Object e2) {
		CheckEqual e=(CheckEqual)e2;
		if(basic==e.basic) {
			return true;
		}
		else {
			return false;
		}
	
	}
	public static void main(String[] args) {
	
		CheckEqual e1=new CheckEqual(1,"Manoj", 56666);
		CheckEqual e2=new CheckEqual(2,"Venkat", 56666);
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
		
	}                              
	
	}