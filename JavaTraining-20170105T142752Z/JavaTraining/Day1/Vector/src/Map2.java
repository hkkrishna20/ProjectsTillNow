import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;


public class Map2 {
	
	public static void main(String[] args) {
		Map<String,Double> m=new Hashtable<String, Double>( );
		m.put("Ayesha", 63478.34);
		m.put("manoj", 565265.34);
		m.put("sreya", 5266.34);
		m.put("mani", 54678.34);
		String String;
		double salary;
		System.out.println("Enter name ");
		Scanner scr=new Scanner(System.in);
		String=scr.nextLine( );
		salary=m.getOrDefault(String, 00.00);
		System.out.println("Salary is " +salary);
		
	}

}
