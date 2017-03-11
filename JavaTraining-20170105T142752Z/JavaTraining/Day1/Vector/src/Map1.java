import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;


public class Map1 {
	
	public static void main(String[] args) {
		Map<Integer, String> m= new Hashtable<Integer, String>( );
		m.put(1,"satya");
		m.put(2,"manoj");
		m.put(3,"mani");
		m.put(4	,"swetha");
		int key;
		String value;
		System.out.println("Enter Key ");
		Scanner scr=new Scanner(System.in);
		key=scr.nextInt( );
		value=m.getOrDefault(key, " wrongds1");
		System.out.println("value  "  +value);
		
		
	}

}
