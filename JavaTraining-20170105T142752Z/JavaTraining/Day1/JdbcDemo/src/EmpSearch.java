import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class EmpSearch {
	
	public static void main(String[] args) {
		int empno;
		System.out.println("Enter Eploy no");
		Scanner scr=new Scanner(System.in);
		empno=scr.nextInt();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORACLE","scott","tiger");
PreparedStatement pst=con.prepareStatement("Select * from employ where empno= ?");
pst.setInt(1, empno);
ResultSet rs=pst.executeQuery( );
if(rs.next()) {
	System.out.println("Employ No " +rs.getInt("EMPNO"));
	System.out.println("Name " +rs.getString("NAME"));
	System.out.println("Dept  " +rs.getString("DEPT"));
	System.out.println("Desig  " +rs.getString("DESIG"));
	System.out.println("Basic  " +rs.getInt("BASIC"));
}
else {
	System.out.println("Record not found.......");
}

		}
		 catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		 
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}
}


