import java.util.Map;
import java.util.Properties;
import java.util.Scanner;


public class Prop {

	public static void main(String[] args) {
		Map m=new Properties();
		m.put("Hari", "Krishna");
		m.put("manoj", "naidu");
		m.put("sreya", "sastry");
		m.put("mani", "sai");
		String user,pwd;
		System.out.println("Enter user and password");
		Scanner scr=new Scanner(System.in);
		user=scr.nextLine( );
		pwd=scr.nextLine();
		
		String res=(String)m.getOrDefault(user, "not found");
		if(pwd.equals(res)) { 
			System.out.println("correct");
		}
		else {
			System.out.println("invalid");
		}
		
		
	}
}
