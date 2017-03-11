import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;



public class ReadEmploy {
	
	public static void main(String[] args) {
		try {
			FileInputStream fin=new FileInputStream("d:/emp.txt");
			ObjectInputStream objin=new ObjectInputStream(fin);
			Employ e=(Employ)objin.readObject( );
			System.out.println(e);
			objin.close();
			fin.close();
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
	
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
	
			e.printStackTrace();
		}
	}

}