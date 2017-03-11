import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;




public class DataInEx {

	public static void main(String[] args) {
		try {
			FileInputStream fin=new FileInputStream ("d:/data.txt");
			DataInputStream din=new DataInputStream(fin);
			int x=din.readInt();
			String n=din.readUTF();
			double y=din.readDouble();
			boolean flag=din.readBoolean();
			System.out.println("x is " +x);
			System.out.println("N is " +n);
			System.out.println("Y is  " +y);
			System.out.println("flag is  " +flag);
			din.close();
			fin.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
