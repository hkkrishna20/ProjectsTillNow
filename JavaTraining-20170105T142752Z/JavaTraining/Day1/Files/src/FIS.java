import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FIS {

	public static void main(String[] args) {
		try {
			FileInputStream fin= new FileInputStream ("D:/JavaTraining/Day1/Files/src/Files.java");
			int ch;
			while ((ch=fin.read()) !=-1) {
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
}
