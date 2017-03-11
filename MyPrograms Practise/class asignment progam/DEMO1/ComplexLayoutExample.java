import java.awt.*;

public class ComplexLayoutExample
{
	private Frame frm;
	private Panel pan;
	private Button bw, bc;
	private Button bfile, bhelp;
		
	public ComplexLayoutExample()
	{
		frm = new Frame("GUI Example");
		bw = new Button("Menu");
		bc = new Button("Work Space Region");
		bfile = new Button("File");
		bhelp = new Button("Help");
	}
	
	public void launchFrame()
	{
		// Add bw and bc buttons in the frame border
		frm.add(bw, BorderLayout.WEST);
		frm.add(bc, BorderLayout.CENTER);
		
		// Create panel for the buttons in the north border
		pan = new Panel();
		pan.add(bfile);
		pan.add(bhelp);
		frm.add(pan, BorderLayout.NORTH);
		
		// Pack the frame and make it visible
		frm.setLocation(200,200);
		frm.setSize(500,400);
		//frm.pack();
		frm.setVisible(true);
	}
	
	public static void main(String args[])
	{
		ComplexLayoutExample gui = new ComplexLayoutExample();
		gui.launchFrame();
	}
}