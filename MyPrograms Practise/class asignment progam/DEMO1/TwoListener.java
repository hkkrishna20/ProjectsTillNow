import java.awt.*;
import java.awt.event.*;

public class TwoListener implements MouseMotionListener, MouseListener
{
	private Frame frm;
	private TextField tf;
	
	public TwoListener()
	{
		frm = new Frame("Two Listener Example");
		tf = new TextField(30);
	}
	
	public void launchFrame()
	{
		Label lb = new Label("Click and Drag the mouse");
		frm.add(lb, BorderLayout.NORTH);
		frm.add(tf, BorderLayout.SOUTH);
		
		frm.addMouseMotionListener(this);
		frm.addMouseListener(this);
		
		frm.setSize(300,300);
		frm.setVisible(true);
	}
	
	public void mouseDragged(MouseEvent e)
	{
		String s = "Mouse dragging: X = " + e.getX() + " Y = " + e.getY();
		tf.setText(s);
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
	
	public void mouseMoved(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	
	public static void main(String args[])
	{
		TwoListener tl = new TwoListener();
		tl.launchFrame();
	}
}