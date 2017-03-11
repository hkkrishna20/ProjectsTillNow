import java.awt.*;
import java.awt.event.*;

public class ALExample1 extends Frame implements ActionListener
{
	private Frame frm;
	private Button b1;
	
	public ALExample1()
	{
		frm = new Frame("Summer 2004");
		b1 = new Button("Exit");
	}
	
	public void launchFrame()
	{
		frm.setSize(200,200);
		frm.setLayout(new FlowLayout());
		b1.addActionListener(this);
		frm.add(b1);
		frm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		System.exit(0);
	}
	
	public static void main(String args[])
	{
		ALExample1 ale = new ALExample1();
		ale.launchFrame();
	}
}	