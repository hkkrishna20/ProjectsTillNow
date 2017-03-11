import java.util.Scanner;


public class Scan2 {

	public static void main(String[] args) {
		System.out.println("Enter 2  nos");
		int a,b;
		Scanner scr=new Scanner(System.in);
		a=scr.nextInt();
		b=scr.nextInt();
		int c=a+b;
		System.out.println("Sum is " +c);
	}
}
