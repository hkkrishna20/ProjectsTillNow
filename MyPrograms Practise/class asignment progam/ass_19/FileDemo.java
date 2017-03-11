import java.io.*;
class FileDemo
{
	static void show(String s)
	{
		System.out.println(s);
	}
	
	public static void main(String args[])
	{
		File f1=new File("/hiten/hello");
		show("File Name:"+f1.getName());
		show("Path:"+f1.getPath());
		show("AbsolutePath:"+f1.getAbsolutePath());
		show("Parent:"+f1.getParent());
		show(f1.exists()?"Writable":"NotWritable");
		show(f1.canRead()?"Readable":"NotReadable");
		show(f1.isDirectory()?"is a directory":"is not a directory");
		show(f1.isFile()?"is normal file":"might be a named pipe");
		show("file last modified"+f1.lastModified());
		show("File Size"+f1.length()+"Bytes");
	}
}