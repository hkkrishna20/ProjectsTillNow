import java.awt.*;

public class FlowExample
{
	private Frame frm;
	private Button b1;
	private Button b2;
	private Button b3;
		
	public FlowExample()
	{
		frm = new Frame("Flow Layout Example");
		b1 = new Button("OK");
		b2 = new Button("Open");		
		b3 = new Button("Close");
	}
	
	public void launchFrame()
	{
		frm.setLayout(new FlowLayout());
		frm.add(b1);
		frm.add(b2);
		frm.add(b3);
		frm.setSize(200,200);		
		frm.setVisible(true);
	}
	
	public static void main(String args[])
	{
		FlowExample guiWindow = new FlowExample();
		guiWindow.launchFrame();
	}
}