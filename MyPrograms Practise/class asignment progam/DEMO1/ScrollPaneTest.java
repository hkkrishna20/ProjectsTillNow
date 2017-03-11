import java.awt.*;
import java.awt.event.*;

class ScrollPaneTest implements WindowListener //ActionListener, 
{
	private MenuBar mb;
	private Menu One, Two;
	private MenuItem mi1, mi2, mi3, mi4;
	private CheckboxMenuItem cmi;
	private Frame frm;
		
	public void launchFrame()
	{
		frm = new Frame("Menu System");
		frm.setSize(400,400);
		mb = new MenuBar();
		One = new Menu();
		One.add(mi1 = new MenuItem("MI-1"));
		One.add(mi2 = new MenuItem("MI-2"));
		One.add(mi3 = new MenuItem("MI-3"));
		mb.add(One);
		Two = new Menu();
		Two.add(mi4 = new MenuItem("MI-4"));
		Two.add(cmi = new CheckboxMenuItem("CMI-1"));
		mb.add(Two);
		frm.add(mb);
		frm.addWindowListener(this);
		frm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {}
	{
		String str = e.getActionCommand();
		if(str.equals("File Dialog Box Test"))
		fdlg.setVisible(true);
   	}
   	
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
    	ScrollPaneTest span = new ScrollPaneTest();
    	span.launchFrame();
    }
}
    