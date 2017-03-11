import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class CustomImp {

		public static void main(String[] args) {
			
			System.out.println("Enter the name");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			try {
				String name=br.readLine();
				System.out.println("Name is " +name);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
}
