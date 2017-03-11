import java.util.ArrayList;
import java.util.List;


public class ArrEmp {

	public static void main(String[] args) {
		List lstEmp=new ArrayList();
		lstEmp.add(new Employ(1,"Manoj",56546));
		lstEmp.add(new Employ(2,"Sreya",56546));
		lstEmp.add(new Employ(3,"Swetha",56546));
		lstEmp.add(new Employ(4,"Hari",56546));
		lstEmp.add(new Employ(5,"Mani",56546));
		for(Object ob: lstEmp){
			Employ e=(Employ)ob;
			System.out.println(e);
		
		}
}
}
 