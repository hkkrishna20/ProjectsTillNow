import java.io.*;
class FileWriterDemo
{
	public static void main(String []args)throws IOException
	{
		String source="Now it\'s the time for good people to love and to be loved";
		char buffer[]=new char[source.length()];
		source.getChars(0,source.length(),buffer,0);
		FileWriter f1=new FileWriter("file1.txt");
		for(int i=0;i<buffer.length;i++)
		{	
			f1.write(buffer[i]);
			f1.close();
			FileWriter f2=new FileWriter("file2.txt");
			f2.write(buffer);
			f2.close();
		}
	}
}