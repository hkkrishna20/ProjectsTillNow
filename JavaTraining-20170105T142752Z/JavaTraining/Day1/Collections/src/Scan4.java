import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Scan4 {
	
	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("d:/scan.txt");
			fw.write("12 prasanna 12.4 55 34 true ram krishna 45 46 53.2  false hello");
			fw.close();
			FileReader fr=new FileReader("d:/scan.txt");
			Scanner scr=new Scanner(fr);
			while(scr.hasNext()) {
				if(scr.hasNextInt()) {
					System.out.println(scr.nextInt());
				}
				else {
					scr.next();
				}
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}

}
