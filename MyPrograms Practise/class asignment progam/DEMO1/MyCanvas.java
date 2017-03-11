import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MyCanvas extends Canvas implements KeyListener
{
	private int index;
	Color colors[] = {Color.red, Color.green, Color.blue};
	
	public void paint(Graphics g)
	{
		g.setColor(colors[index]);
		g.fillRect(0,0,getSize().width, getSize().height);
	}
	
	public void keyTyped(KeyEvent e)
	{
		index ++;
		if(index == colors.length)
		 { index = 0; }
		repaint();		
	}
	
	public void keyPressed(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}
	
	public static void main(String args[])
	{
		Frame frm = new Frame("Summer 2004 Canvas");
		MyCanvas c = new MyCanvas();
		c.setSize(300,200);
		frm.setLayout(new BorderLayout());
		frm.add(c, BorderLayout.CENTER);
		c.requestFocus();
		c.addKeyListener(c);
		frm.pack();
		frm.setVisible(true);
	}
}	