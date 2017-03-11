import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class DeptSearch {
	
	public static void main(String[] args) {
		
		int deptno;
		System.out.println("Please enter the department number for details");
		Scanner scr=new Scanner(System.in);
		deptno=scr.nextInt();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORACLE","scott","tiger");
PreparedStatement pst=con.prepareStatement("Select * from DEPARTMENT where DEPTNO= ?");
pst.setInt(1, deptno);
ResultSet rs=pst.executeQuery();
if(rs.next()) {
	System.out.println("DeptNo " +rs.getInt("DEPTNO"));
	System.out.println("DName " +rs.getString("DNAME"));
	System.out.println("Location  " +rs.getString("LOC"));
	System.out.println("City  " +rs.getString("CITY"));
	System.out.println("Head  " +rs.getString("HEAD"));
		
} 
		
else {
	System.out.println("No Department found on such number");
}
		}
catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}
}

