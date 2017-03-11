import java.awt.*;
import java.awt.event.*;

public class OneListener implements MouseListener
{
	private Frame frm;
	private TextField tf;
	
	public OneListener()
	{
		frm = new Frame("Listener Example");
		tf = new TextField(30);
	}
	
	public void launchFrame()
	{
		Label lb = new Label("Different Mouse Events Method! Enjoy");
		frm.add(lb, BorderLayout.NORTH);
		frm.add(tf, BorderLayout.SOUTH);
		
		frm.addMouseListener(this);
		
		frm.setSize(300,300);
		frm.setVisible(true);
	}
	
	public void mouseEntered(MouseEvent e)
	{
		String s = "Mouse entered";
		tf.setText(s);
	}
	
	public void mouseExited(MouseEvent e)
	{
		String s = "Mouse exited";
		tf.setText(s);
	}
	
	public void mousePressed(MouseEvent e)
	{
		String s = "Mouse Pressed";
		tf.setText(s);
	}
	
	
	public void mouseClicked(MouseEvent e)
	{
		String s = "Mouse Clicked";
		tf.setText(s);
	}
	
	public void mouseReleased(MouseEvent e)
	{
		String s = "Mouse Released";
		tf.setText(s);
	}
	
	public static void main(String args[])
	{
		OneListener tl = new OneListener();
		tl.launchFrame();
	}
}