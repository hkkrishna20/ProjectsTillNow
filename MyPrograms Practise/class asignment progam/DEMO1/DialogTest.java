import java.awt.*;
import java.awt.event.*;

class DialogTest implements ActionListener, WindowListener
{
	private Frame frm;
	private Dialog dlg;
	private Label lbl;
	private Button btn, btn1;
	
	public void launchFrame()
	{
		frm = new Frame("Dialog Box Test");
		frm.setSize(200,200);
		dlg = new Dialog(frm, "Dialog", true);
		dlg.setLayout(new GridLayout(2,1));
		lbl = new Label("Hello ! This is a Dialog Test");
		btn = new Button("OK");
		btn1 = new Button("Dialog Box Test");
		frm.add(btn1);
		dlg.add(lbl);
		dlg.add(btn);
		dlg.pack();
		btn.addActionListener(this);
		btn1.addActionListener(this);
		frm.addWindowListener(this);
		frm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String str = e.getActionCommand();
		if(str.equals("Dialog Box Test"))
		dlg.setVisible(true);
		else if(str.equals("OK"))
		dlg.setVisible(false);
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
    	DialogTest dlgTest = new DialogTest();
    	dlgTest.launchFrame();
    }
}
    