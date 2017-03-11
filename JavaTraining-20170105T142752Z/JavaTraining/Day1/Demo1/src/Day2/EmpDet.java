package Day2;

public class EmpDet {

	int empno;
	String ename;
	double basic;
	
	public EmpDet() {
		
	}
	
	public EmpDet show (EmpDet e) {
		e.ename=e.ename.toUpperCase();
		e.basic=e.basic+1000;
		return e;
		
		
	}
	
	public EmpDet(int empno,String ename,double basic) {
		this.empno=empno;
		this.ename=ename;
		this.basic=basic;
	}
	
	@Override
	public String toString() {
		
		return "Eno " +empno + "Ename " +ename + "Salary " +basic;
	}
	
	public static void main(String[] args) {
		EmpDet obj=new EmpDet(12,"Manoj",30000);
		EmpDet e2=obj.show(obj);
		System.out.println(e2);
		
	}
}
