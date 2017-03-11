import java.awt.*;

public class FrameExample
{
	private Frame frm;
	
	public FrameExample()
	{
		frm = new Frame("Summer 2004");
	}
	
	public void launchFrame()
	{
		frm.setSize(300,300);
		frm.setBackground(Color.blue);
		frm.setResizable(false);
		frm.setVisible(true);
	}
	
	public static void main(String args[])
	{
		FrameExample guiWindow = new FrameExample();
		guiWindow.launchFrame();
	}
}