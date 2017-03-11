import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FOS {

	public static void main(String[] args) {
		try {
			FileInputStream src=new FileInputStream("D:/JavaTraining/Day1/Files/src/Files.java");
			FileOutputStream tar=new FileOutputStream("d:/demo.java");
			int ch;
			while((ch=src.read()) != -1) {
				tar.write((char)ch);
				}
			src.close();
			tar.close();
			System.out.println("File copied");
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
