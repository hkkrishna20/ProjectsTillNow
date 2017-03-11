import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class SearchAccountMain {
	
	public static void main(String[] args) {
		int accountNo;
		System.out.println("Enter the account number to search on");
		Scanner scr=new Scanner(System.in);
		accountNo=scr.nextInt();
		Bank objBank=new Bank();
		ResultSet rs=objBank.searchAccount(accountNo);
		try {
			if(rs.next()) {
				System.out.println("First Name  " +rs.getString("FirstName"));
				System.out.println("Last Name  " +rs.getString("LastName"));
				System.out.println("city " +rs.getString("City"));
				System.out.println("State  " +rs.getString("State"));
				System.out.println("Amount  " +rs.getString("Amount"));
				System.out.println("Cheqfacil  " +rs.getString("CheqFacil"));
				
			}
			else {
				System.out.println("Account Not found");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
