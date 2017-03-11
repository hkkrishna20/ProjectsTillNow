import java.awt.*;

public class FrameWithPanel
{
	private Frame frm;
	private Panel pan;
	
	public FrameWithPanel(String title)
	{
		frm = new Frame(title);
		pan = new Panel();
	}
	
	public void launchFrame()
	{
		frm.setSize(300,300);
		frm.setBackground(Color.blue);
		frm.setLayout(null);
		
		pan.setSize(100,100);
		pan.setBackground(Color.yellow);
		
		frm.add(pan);
		frm.setVisible(true);
	}
	
	public static void main(String args[])
	{
		FrameWithPanel guiWindow = new FrameWithPanel("Frame with Panel");
		guiWindow.launchFrame();
	}
}