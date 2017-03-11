import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;


public class Hashtab {
	public static void main(String[] args) {
		Map m=new Hashtable( );
		m.put("Hari", 20000.77);
		m.put("manoj", 30000.67);
		m.put("sreya", 40000.76);
		m.put("mani", 50000.77);
		String name;
		double sal;
		System.out.println("Enter Name");
		Scanner scr=new Scanner (System.in);
		name=scr.nextLine( );
		sal=(Double)m.getOrDefault(name, 0.0);
		if(sal==0.0) {
			System.out.println("Not found");
		}
		else {
	
		
		System.out.println("Sal " +sal);
	}
	}
}
