import java.awt.*;
import java.awt.event.*;

class MenuExtra 
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
		One = new Menu("Menu 1");
		One.add(mi1 = new MenuItem("MI-1"));
		One.add(mi2 = new MenuItem("MI-2"));
		One.add(mi3 = new MenuItem("MI-3"));
		mb.add(One);
		Two = new Menu("Menu 2");
		Two.add(mi4 = new MenuItem("MI-4"));
		Two.add(cmi = new CheckboxMenuItem("CMI-1"));
		mb.add(Two);
		frm.setMenuBar(mb);
		frm.setVisible(true);
    }

 public static void main(String args[])
    {
    	MenuExtra ms = new MenuExtra();
    	ms.launchFrame();
    }
}
