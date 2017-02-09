import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionHelper {
	
	public static Connection getConnection( ) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORACLE","scott","tiger");
return con;
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
		
			e.printStackTrace();
			return null;
		}
	}

}
