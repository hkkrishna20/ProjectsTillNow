import java.awt.*;
import java.awt.event.*;

public class LayoutExample
{
	private Frame frm;
	private Button b1;
	private Button b2;
		
	public LayoutExample()
	{
		frm = new Frame("GUI Example");
		b1 = new Button("Press Me");
		b2 = new Button("Don't Press Me");		
	}
	
	public void launchFrame()
	{
		frm.setLayout(new FlowLayout());
		frm.add(b1);
		frm.add(b2);
		frm.pack();		
		frm.setVisible(true);
	}
	
	public static void main(String args[])
	{
		LayoutExample guiWindow = new LayoutExample();
		guiWindow.launchFrame();
	}
}