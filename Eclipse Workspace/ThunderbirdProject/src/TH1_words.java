import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TH1_words {
	public static void main(String args[]) throws IOException {  	     
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter path of directory in Style C:\\Test\\Test1");
		String dir = reader.nextLine();
		System.out.println("Enter file name "); 
		String filename = reader.nextLine();
		TH1_words t1=new TH1_words();
		t1.wcCount(dir,filename);
		 }
	public String wordCount(String dir,String filename) throws IOException{
		String Pathh=dir+"\\"+filename;
		System.out.println(Pathh);
		  BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(Pathh)));
  	    String line = null;
  	  String[] words=null; 
  	try {
  		 while(true)
	        {
	            line = br.readLine();
	            if(line==null)
	                break;
	             words = line.split(" ");//those are your words
	        }
  		for(int i=0;i<words.length;i++){
  		    
  		       System.out.println(words[i]); //Matching the string and printing.
  		  
  		}
	    } 
	catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	    catch(IOException e)
	    {
	        e.printStackTrace();
	    }
	  
		return " ";
	}
public String wcCount(String dir,String filename) throws IOException{
	String Pathh=dir+"\\"+filename;
	//System.out.println(Pathh);
	String line=new String();
	  String[] words=null;
    FileReader in = null;
    FileWriter out = null;
int i=0;
List<String> a = new ArrayList<String>();


    try {
       in = new FileReader(Pathh);
       out = new FileWriter("output.txt");
       int c;
       while ((c = in.read()) != -1) {
    	   char c1=(char)c;
    	   String q=c1+"";
    	 //  System.out.println(q);
    	   if(q!=" "){
    		   line=line+q;
    		   continue;
      		  }
    	   else{
    		   a.add(line);
    	    	    //System.out.println(line);
    	   System.out.println(a.indexOf(i));
    	   i++;
    	   }
     	  
    	   //out.write(c);
       }
       for(String model : a) {
           System.out.println(model);
       }

       /* String[] myArray = new String[a.size()];
       a.toArray(myArray);
   	for( i=0;i<myArray.length;i++){
		    
   		
	       System.out.println(myArray[i]); //Matching the string and printing.
	  
	}*/
    }finally {
       if (in != null) {
          in.close();
       }
       if (out != null) {
          out.close();
       }
    }return  "";
}
}