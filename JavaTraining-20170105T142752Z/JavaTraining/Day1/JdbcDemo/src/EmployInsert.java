import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class EmployInsert {

	public static void main(String[] args) {
		int empno,basic;
		String name,dept,desig;
		System.out.println("Enter empno, name, dept, desig, basic");
		Scanner scr=new Scanner(System.in);
		empno=Integer.parseInt(scr.nextLine());
		name=scr.nextLine();
		dept=scr.nextLine();
		desig=scr.nextLine();
		basic=Integer.parseInt(scr.nextLine());
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORACLE","scott","tiger");
String cmd="insert into employ values(?,?,?,?,?)";
PreparedStatement pst=con.prepareStatement(cmd);
		pst.setInt(1, empno);
		pst.setString(2, name);
		pst.setString(3, dept);
		pst.setString(4, desig);
		pst.setInt(5, basic);
		pst.executeUpdate();
		System.out.println("***Record Inserted*****");
		
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}
}
