import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Scan3 {

	
public static void main(String[] args) {
	try {
		FileInputStream fin=new FileInputStream("D:/JavaTraining/Day1/Collections/src/ArrList.java");
		Scanner scr=new Scanner (fin);
		while(scr.hasNextLine()) {
			System.out.println(scr.nextLine());
		}
		scr.close();
		fin.close();
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}
}
