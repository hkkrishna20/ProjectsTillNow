import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FRead {

	public static void main(String[] args) {
		File f1=new File ("D:/JavaTraining/Day1/Files/src/Files.java");
		try {
		
			FileReader fr=new FileReader(f1);
			int ch;
			while((ch=fr.read()) != -1) {
				System.out.print((char)ch);
			}
			fr.close();
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
}
