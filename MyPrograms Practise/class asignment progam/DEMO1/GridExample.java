import java.awt.*;

public class GridExample
{
	private Frame frm;
	private Button b1, b2, b3, b4, b5;
			
	public GridExample()
	{
		frm = new Frame("Grid Layout Example");
		b1 = new Button("1");
		b2 = new Button("2");		
		b3 = new Button("3");
		b4 = new Button("4");		
		b5 = new Button("5");
	}
	
	public void launchFrame()
	{
		frm.setLayout(new GridLayout(3,2));
		
		frm.add(b1);
		frm.add(b2);
		frm.add(b3);
		frm.add(b4);
		frm.add(b5);
		frm.pack();		
		frm.setVisible(true);
	}
	
	public static void main(String args[])
	{
		GridExample guiWindow = new GridExample();
		guiWindow.launchFrame();
	}
}