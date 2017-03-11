import java.awt.*;
import java.awt.event.*;

public class ALExample2 extends Frame implements ActionListener
{
	private Frame frm;
	private Button b1, b2;
	
	public ALExample2()
	{
		frm = new Frame("Summer 2005");
		b1 = new Button("Exit");
		b2 = new Button("Print");
	}
	
	public void launchFrame()
	{
		frm.setSize(200,200);
		frm.setLayout(new FlowLayout());
		frm.add(b1);
		frm.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);		
		frm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
			if(e.getActionCommand().equals("Exit"))
				System.exit(0);
			else
				System.out.println("Printing ...........");
	}
	
	public static void main(String args[])
	{
		ALExample2 ale1 = new ALExample2();
		ale1.launchFrame();
	}
}				