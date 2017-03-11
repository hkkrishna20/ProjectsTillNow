import java.awt.*;
import java.awt.event.*;

public class ALExample3 implements MouseMotionListener, WindowListener
{
	private Frame frm;
    private TextField t;

    public ALExample3()
    {
    	t=new TextField(30);
    	frm=new Frame("Change Color");
    }
    
    public void launchFrame()
    {
    	frm.setLayout(new FlowLayout());
        frm.setSize(300,300);
        frm.setLocation(200,200);
        frm.setBackground(Color.yellow);
        frm.add(t);
        frm.addMouseMotionListener(this);
        frm.addWindowListener(this);
        t.setEditable(false);
        frm.setVisible(true);
    }

    public void mouseDragged(MouseEvent e)
    {
    	frm.setBackground(Color.green);
        t.setText("Dragging mouse at : X = " + e.getX() + ", Y = "+ e.getY());
    }

    public void mouseMoved(MouseEvent e)
    {
    	frm.setBackground(Color.yellow);
    	t.setText("Moving mouse at : X = " + e.getX() + ", Y = "+ e.getY());
    }

    public void windowClosing(WindowEvent e)
    {
    	System.exit(0);
    }
    
    public void windowClosed(WindowEvent e){}    
    public void windowOpened(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    	  
    public static void main(String args[])
    {
    	ALExample3 ale2=new ALExample3();
        ale2.launchFrame();
    }
}