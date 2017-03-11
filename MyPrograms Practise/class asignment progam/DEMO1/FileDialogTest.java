import java.awt.*;
import java.awt.event.*;

class FileDialogTest implements ActionListener, WindowListener
{
	private Frame frm;
	private FileDialog fdlg;
	private Button btn;
	
	public void launchFrame()
	{
		frm = new Frame("File Dialog Box Test");
		frm.setSize(200,200);
		frm.setLayout(new FlowLayout());
		fdlg = new FileDialog(frm, "File Dialog");
		btn = new Button("File Dialog Box Test");
		frm.add(btn);
		btn.addActionListener(this);
		frm.addWindowListener(this);
		frm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
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
    	FileDialogTest fdlgTest = new FileDialogTest();
    	fdlgTest.launchFrame();
    }
}
    