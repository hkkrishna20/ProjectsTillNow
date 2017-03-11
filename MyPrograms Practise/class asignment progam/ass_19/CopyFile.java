import java.io.*;
class CopyFile
{
	public static void main(String args[])throws IOException
	{
		int i;
		FileInputStream fin=null;
		FileOutputStream fout=null;
		try{
				try{
						fin=new FileInputStream(args[0]);
						}catch(FileNotFoundException e)
							{
								System.out.println("File not found");
							}
				try{
						fout=new FileOutputStream(args[1]);
						}catch(FileNotFoundException e)
							{
								System.out.println("Error Opening output File");
							}
			}catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println("Usage:CopyFile From TO");
				}
			
			
		try{
				do
					{
						i=fin.read();
						if(i!=-1)
								fout.write(i);
					}while(i!=-1);
			}catch(IOException e)
				{
					System.out.println("File Error");
				}
		fin.close();
		fout.close();
	}
}