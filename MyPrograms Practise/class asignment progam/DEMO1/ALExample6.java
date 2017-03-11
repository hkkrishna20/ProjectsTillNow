import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ALExample6 extends Canvas implements KeyListener
{
	private Frame frm;
	private int index;
	Color colors[] = {Color.red, Color.green, Color.blue};
	
	public ALExample6()
	{
		frm = new Frame("Summer 2004 Canvas");
		ALExample6 c = new ALExample6();
	}
	
	public void launchFrame()
	{
		frm.setSize(200,200);
		frm.setLayout(new BorderLayout());
		frm.add(c, BorderLayout.CENTER);
		frm.requestFocus();
		frm.addKeyListener();
		frm.pack();
		frm.setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		g.setColor(colors[index]);
		g.fillRect(0,0,getSize.width, getSize.height);
	}
	
	public void keyTyped(KeyEvent e)
	{
		index ++;
		if(index == colors.length)
		index = 0;
		repaint();		
	}
	
	public void keyPressed(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}
	
	public static void main(String args[])
	{
		ALExample6 ale = new ALExample6();
		ale.launchFrame();
	}
}	