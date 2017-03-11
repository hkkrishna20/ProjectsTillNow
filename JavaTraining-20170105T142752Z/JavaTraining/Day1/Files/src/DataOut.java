import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;




public class DataOut {

		public static void main(String[] args) {
			try {
				FileOutputStream fout=new FileOutputStream ("d:/data.txt");
				DataOutputStream dout=new DataOutputStream(fout);
				dout.writeInt(12);
				dout.writeUTF("Manoj");
				dout.writeDouble(76988);
				dout.writeBoolean(true);
				dout.close();
				fout.close();
				System.out.println("*****File Created*****");
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	
}
