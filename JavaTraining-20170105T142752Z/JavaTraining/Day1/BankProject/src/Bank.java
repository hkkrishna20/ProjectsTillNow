import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Bank {

	private int accountNo;
	private String firstName;
	private String lastName;
	private String city;
	private String state;
	private int amount;
	private String cheqFacil;
	private String amountType;
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getCheqFacil() {
		return cheqFacil;
	}
	public void setCheqFacil(String cheqFacil) {
		this.cheqFacil = cheqFacil;
	}
	public String getAmountType() {
		return amountType;
	}
	public void setAmountType(String amountType) {
		this.amountType = amountType;
	}
	
	private Connection conn;
	private PreparedStatement pst;
	
	public String createAccount(Bank objBank) {
		conn=ConnectionHelper.getConnection();
		String cmd="insert into Bank	(AccountNo, Firstname, LastName, City, State,Amount,"
				+ "CheqFacil,AccountType) values (?,?,?,?,?,?,?,?)";
	try {
		pst=conn.prepareStatement(cmd);
		pst.setInt(1, objBank.getAccountNo());
		pst.setString(2, objBank.getFirstName());
		pst.setString(3, objBank.getLastName());
		pst.setString(4, objBank.getCity());
		pst.setString(5, objBank.getState());
		pst.setInt(6, getAmount());
		pst.setString(7, objBank.getCheqFacil());
		pst.setString(8, objBank.getAmountType());
		pst.executeUpdate();
		return "account created..";
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return e.getMessage();
		
	}			
	}
	
	public String updateAccount(int accountNo, String city, String state){
		conn=ConnectionHelper.getConnection();
		String cmd="update Bank set city=?, state=?, where accountNo=?";
		try {
			pst=conn.prepareStatement(cmd);
			pst.setString(1, city);
			pst.setString(2, state);
			pst.setInt(3, accountNo);
			pst.executeUpdate();
			return "Account upadted..";
		} catch (SQLException e) {
		
			e.printStackTrace();
			return e.getMessage();
		}
	}

	public String closeAccount(int accountNo) {
		conn=ConnectionHelper.getConnection();
		String cmd="update Bank set Status='inactive' where accountNo=?";
		try {
			pst=conn.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			pst.executeUpdate();
			return "Account closed...";
		} catch (SQLException e) {
			
			e.printStackTrace();
			return e.getMessage();
		}
		
	}
	
public ResultSet searchAccount(int accountNo) {
		conn=ConnectionHelper.getConnection();
		try {
			pst=conn.prepareStatement("select * from Bank where accountNo=?");
			pst.setInt(1, accountNo);
			ResultSet rs=pst.executeQuery();
			return rs;
		} catch (SQLException e) {
		
			e.printStackTrace();
			return null;
		}
	}
	
	public int generateAccountNo() {
		
		conn=ConnectionHelper.getConnection();
		String cmd="Select CASE when max(AccountNo) is NULL THEN 1 else MAX(AccountNo)+1"
				+ "END accno from Bank";
		try {
			PreparedStatement pst=conn.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			rs.next();
			int accno=rs.getInt("accno");
			return accno;
		} catch (SQLException e) {
			
			e.printStackTrace();
			return 0;
		}
	}
}
