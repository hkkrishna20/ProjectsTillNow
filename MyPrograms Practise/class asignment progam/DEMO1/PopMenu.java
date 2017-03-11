import java.awt.*;
import java.awt.event.*;

class MenuSystem implements WindowListener, MouseListener
{
	private PopupMenu pm;
	private Menu One, Two;
	private MenuItem mi1, mi2, mi3, mi4;
	private CheckboxMenuItem cmi;
	private Frame frm;
		
	public void launchFrame()
	{
		frm = new Frame("Popup Menu System");
		frm.setSize(400,400);
		pm = new PopupMenu();
		One = new Menu("Menu 1");
		One.add(mi1 = new MenuItem("MI-1"));
		One.add(mi2 = new MenuItem("MI-2"));
		One.add(mi3 = new MenuItem("MI-3"));
		pm.add(One);
		Two = new Menu("Menu 2");
		Two.add(mi4 = new MenuItem("MI-4"));
		Two.add(cmi = new CheckboxMenuItem("CMI-1"));
		pm.add(Two);
		frm.add(pm);
		frm.addMouseListener(this);
		frm.addWindowListener(this);
		frm.setVisible(true);
	}
	
	public void mousePressed(MouseEvent e)
	{
		pm.show(frm,e.getX(),e.getY());
	}
   	
   	public void mouseClicked(MouseEvent e) {}
   	public void mouseEntered(MouseEvent e) {}
   	public void mouseExited(MouseEvent e) {}
   	public void mouseReleased(MouseEvent e) {}
   	
	public void windowClosing(WindowEvent e)
    {
    	System.exit(0);
    }
    
    public void windowClosed(WindowEvent e)  {}   
    public void windowOpened(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    
    public static void main(String args[])
    {
    	MenuSystem ms = new MenuSystem();
    	ms.launchFrame();
    }
}
    