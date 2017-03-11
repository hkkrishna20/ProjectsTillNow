import java.awt.*;

public class BorderExample
{
	private Frame frm;
	private Button bn,bs,bw,be,bc;
	
	public BorderExample()
	{
		frm = new Frame("Border Layout Example");
		bn = new Button("B1");
		bs = new Button("B2");
		bw = new Button("B3");
		be = new Button("B4");
		bc = new Button("B5");
	}
	
	public void launchFrame()
	{
		frm.add(bn, BorderLayout.NORTH);
		frm.add(bs, BorderLayout.SOUTH);
		frm.add(bw, BorderLayout.WEST);
		frm.add(be, BorderLayout.EAST);
		frm.add(bc, BorderLayout.CENTER);
		frm.setSize(300,300);
		frm.setVisible(true);
	}
	
	public static void main(String args[])
	{
		BorderExample guiWindow = new BorderExample();
		guiWindow.launchFrame();
	}
}