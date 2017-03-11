import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class EmployShow {
	
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORACLE","scott","tiger");
		    Statement st=con.createStatement();
		    ResultSet rs=st.executeQuery("select * from EMPLOY");
		    while(rs.next()) {
		    	System.out.println("Employ No " +rs.getInt("EMPNO"));
		    	System.out.println("Name " +rs.getString("NAME"));
		    	System.out.println("Dept  " +rs.getString("DEPT"));
		    	System.out.println("Desig  " +rs.getString("DESIG"));
		    	System.out.println("Basic  " +rs.getInt("BASIC"));
		    	
		    }
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
