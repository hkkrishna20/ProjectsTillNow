import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class FoutDemo {

	public static void main(String[] args) {
		String name;
		System.out.println("Enter Name");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			name=br.readLine();
			FileWriter fw=new FileWriter ("d:/demo.txt");
			fw.write(name);
			fw.close();
			System.out.println("Data saved");
			FileInputStream fin=new FileInputStream("d:/demo.txt");
			int ch;
			while ((ch=fin.read()) !=-1) {
				System.out.println((char)ch);
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
