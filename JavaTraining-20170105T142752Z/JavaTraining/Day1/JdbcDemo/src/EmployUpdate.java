import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class EmployUpdate {
	
	public static void main(String[] args) {
		

	int empno,basic;
	String desig;
	System.out.println("Enter empno,desig and basic");
	Scanner scr=new Scanner(System.in);
	empno=Integer.parseInt(scr.nextLine());
	desig=scr.nextLine();
	basic=Integer.parseInt(scr.nextLine());
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORACLE","scott","tiger");
String cmd="Update employ set desig=?, basic=? where empno=?";
PreparedStatement pst=con.prepareStatement(cmd);
pst.setString(1, desig);
pst.setInt(2, basic);
pst.setInt(3, empno);
pst.executeUpdate();
System.out.println("****Record Update****");
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	
	}
}
