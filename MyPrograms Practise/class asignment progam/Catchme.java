/**
 * @(#)Catchme.java
 *
 *
 * @author 
 * @version 1.00 2008/6/12
 */

import java.lang.Math;
import java.awt.*;
import java.awt.event.*;
public class Catchme  extends Frame implements WindowListener,MouseListener,MouseMotionListener 
{
    Frame frm;
	Button b;
	int l,br;
	public void windowOpened(WindowEvent e){}
	public void windowClosing(WindowEvent e)
		{
		System.exit(0);
		}
	public void windowClosed(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowActivated(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	
	public void mouseClicked(MouseEvent e){}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	
	public void mouseDragged(MouseEvent e)
		{
			set(e);
			
		}
	public void mouseMoved(MouseEvent e)
		{
			set(e);
		}
	public void set(MouseEvent e)
	{
		int x,y;
			int x1=0,y1=0;
			boolean bo1=false,bo2=false,bo3=false,bo4=false;
			x=e.getX();
			y=e.getY();
			bo1=(x>=(b.getX()-50));
			bo2=(x<=(b.getX()+50+l));
			bo3=(y>=(b.getY()-50));
			bo4=(y<=(b.getY()+50+br));
			
			
			
			if((bo1&&bo2)&&(bo3&&bo4))
			{
				b.setVisible(false);
				x1=(int)(Math.random()*300);
				y1=(int)(Math.random()*300);
				
				b.setBounds(x1,y1,l,br);
				b.setVisible(true);
			}
	}
    public Catchme()
    {
    	frm=new Frame("catch me");
    	b=new Button("Catchme");
    	l=80;
    	br=30;
    }
    void launch()
    {
    	   	
    	frm.setLayout(null);
    	frm.setBackground(Color.green);
    	frm.setSize(400,400);
    	b.setSize(l,br);
    	b.setBounds(20,20,l,br);
    //	b.addMouseMotionListener(this);
    	frm.add(b);
    	
    	frm.addWindowListener(this);
    	frm.addMouseMotionListener(this);
    	frm.setResizable(false);
		frm.setVisible(true);
    }
    public static void main (String[] args) 
    {
    	Catchme c=new Catchme();
    	c.launch();
    }
    
    
    
}