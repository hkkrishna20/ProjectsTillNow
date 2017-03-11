import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Fcopy {

	public static void main(String[] args) {
		File src= new File("D:/JavaTraining/Day1/Files/src/Files.java");
		File tar=new File("d:/hello.java");
		try {
			FileReader fr=new FileReader(src);
			FileWriter fw=new FileWriter(tar);
			int ch;
			while((ch=fr.read()) != -1) {
				fw.write((char)ch);
			}
			fr.close();
			fw.close();
			System.out.println("***File Copied***");
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
}
