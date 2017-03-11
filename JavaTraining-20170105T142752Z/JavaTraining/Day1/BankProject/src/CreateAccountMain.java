import java.util.Scanner;


public class CreateAccountMain {

	public static void main(String[] args) {
		Bank obj=new Bank();
		System.out.println(obj.generateAccountNo());
		System.out.println("Enter FirstName, Last Name, City,state, Amount, ChecFacil, and Account type");
		Scanner scr=new Scanner(System.in);
		obj.setAccountNo(obj.generateAccountNo());
		obj.setFirstName(scr.nextLine());
		obj.setLastName(scr.nextLine());
		obj.setCity(scr.nextLine());
		obj.setState(scr.nextLine());
		obj.setAmount(Integer.parseInt(scr.nextLine()));
		obj.setCheqFacil(scr.nextLine());
		obj.setAmountType(scr.nextLine());
		System.out.println(obj.createAccount(obj));
	}
}
