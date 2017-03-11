import java.util.Scanner;


public class UpdateAccount {

	public static void main(String[] args) {
		int accountNo;
		String city,state;
		System.out.println("Enter the details to update the account");
		Scanner scr=new Scanner(System.in);
		accountNo=Integer.parseInt(scr.nextLine());
		city=scr.nextLine();
		state=scr.nextLine();
		Bank objBank=new Bank();
		System.out.println(objBank.updateAccount(accountNo, city, state));
	}
}
