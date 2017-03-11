import java.util.ArrayList;
import java.util.List;




public class ArrList {
	
	public static void main(String[] args) {
		List lstnames=new ArrayList();
		lstnames.add("Mekala");
		lstnames.add("Venkata");
		lstnames.add("Sai");
		lstnames.add("Manoj");
		System.out.println("Default values are ");
		for (Object ob : lstnames) {
			System.out.println(ob);
		}
		lstnames.set(3,"bobby");
		System.out.println("List aftre update");
		for (Object ob : lstnames) {
			System.out.println(ob);
		}
		lstnames.add(1,"Sreya");
		System.out.println("List aftre add new item");
		for (Object ob : lstnames) {
			System.out.println(ob);
		}
		lstnames.remove("bobby");
		System.out.println("List after remove by name");
		for (Object ob : lstnames) {
			System.out.println(ob);
		}
		lstnames.remove(1);
		System.out.println("List after remove by index");
		for (Object ob : lstnames) {
			System.out.println(ob);
		}
		
	}

}
