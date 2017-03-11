import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class DepartDelete {
	
	public static void main(String[] args) {
		int deptno;
		System.out.println("Enter dept no");
		Scanner scr=new Scanner(System.in);
		deptno=Integer.parseInt(scr.nextLine());
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORACLE","scott","tiger");
		String cmd="delete from department where deptno=?";
		PreparedStatement pst=con.prepareStatement(cmd);
		pst.setInt(1, deptno);
		pst.executeUpdate();
		System.out.println("***Record Deleted****");
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}

}
