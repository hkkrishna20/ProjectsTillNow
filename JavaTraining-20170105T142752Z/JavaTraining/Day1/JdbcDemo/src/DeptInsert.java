import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class DeptInsert {
	 public static void main(String[] args) {
		int deptno;
		String dname,loc,city,head;
		System.out.println("enter deptno, dname, location, city, head");
		Scanner scr=new Scanner(System.in);
		deptno=Integer.parseInt(scr.nextLine());
		dname=scr.nextLine();
		loc=scr.nextLine();
		city=scr.nextLine();
		head=scr.nextLine();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORACLE","scott","tiger");
String cmd="insert into department values(?,?,?,?,?)";
PreparedStatement pst=con.prepareStatement(cmd);
		pst.setInt(1, deptno);
		pst.setString(2, dname);
		pst.setString(3, loc);
		pst.setString(4, city);
		pst.setString(5, head);
		pst.executeUpdate();
		System.out.println("Done");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
