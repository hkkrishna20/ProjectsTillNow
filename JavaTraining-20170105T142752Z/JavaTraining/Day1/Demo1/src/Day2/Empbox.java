package Day2;

public class Empbox {

	int empno;
	String name;
	double basic;
	
	public void show(Object ob) {
		Empbox x=(Empbox)ob;
		System.out.println(x.empno +" " +x.name + " " +x.basic);
	}
	public static void main(String[] args) {
		
		Empbox e1=new Empbox();
		e1.empno=1;
		e1.name="Manoj";
		e1.basic=30000;
		e1.show(e1);
		
	}
}
