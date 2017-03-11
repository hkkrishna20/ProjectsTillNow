import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 
public class NewProgram {
	private static List<String> timesArray = new ArrayList<String>();
	public static void main(String args[]) throws IOException {  	     
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter path of directory in Style C:\\Test\\Test1");
		String dir = reader.nextLine();
		System.out.println("Enter file name "); 
		String filename = reader.nextLine();
		NewProgram t1=new NewProgram();
		String Pathh=dir+"\\"+filename;
//			t1.inpFile(Pathh);
		try {
            File file = new File(Pathh);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] times = scanner.nextLine().split("-|\\.|\\s+");
                for (String time : times) {
                    timesArray.add(time);
                }
                }
    		for (String e : timesArray)  
    		{  
    		 System.out.println(e);  
    		}           
    		/*for(int ip=0;ip<timesArray.size();ip++){
            	String ip1;	
            	System.out.println(timesArray);
            }
            */
        } catch (Exception e) {
            e.printStackTrace();
        }
		 }
}