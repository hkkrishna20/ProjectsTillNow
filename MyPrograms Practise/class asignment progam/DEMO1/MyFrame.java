import java.awt.Frame;

public class MyFrame extends Frame 
{
	public static void main(String args[]) 	{
	new MyFrame();
	}
	
	public MyFrame() 
	{
	setTitle("NIST Frame");
	setSize(200, 200);
	//setResizable(false);
	setVisible(true);
	}
}