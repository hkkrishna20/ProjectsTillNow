import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class WriteEmploy {

	public static void main(String[] args) {
		try {
			FileOutputStream fout=new FileOutputStream("d:/emp.txt");
			Employ e=new Employ(1,"Manoj",908640);
			ObjectOutputStream objout=new ObjectOutputStream(fout);
			objout.writeObject(e);
			objout.close();
			fout.close();
			System.out.println("**Objects Created**");
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
