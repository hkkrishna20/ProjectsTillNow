import java.util.Scanner;


public class CloseAccount {

	public static void main(String[] args) {
		int accountNo;
		System.out.println("Enter the bank account to close");
		Scanner scr=new Scanner(System.in);
		accountNo=scr.nextInt();
		Bank objBank=new Bank();
		System.out.println(objBank.closeAccount(accountNo));
	}
}
