import java.awt.*;
import java.awt.event.*;

public class Adpterex
{
	private Button btn;
	private Window wnd;
	private Label status;
	
	public static void main(String args[])
	{
		new Adpterex();
	}
	
	public Adpterex()
	{
		wnd = new Frame("Help Messages on Button");
		wnd.setSize(200,200);
		status.setLocation(50,10);
		wnd.setLayout(new FlowLayout());
		btn = new Button("Who am I");
		wnd.add(btn);
		new ButtonHelp(btn, "I am Indraneel");
		wnd.setVisible(true);
	}

	public class ButtonHelp extends MouseAdapter 
	{
		String helpMsg;
		
		ButtonHelp(Button button, String str)
		{
			helpMsg = str;
			button.addMouseListener(this);
		}	
	
		public void mouseEntered(MouseEvent e)
		{
			status.setText(helpMsg);	
		}
	
		public void mouseExited(MouseEvent e)
		{
			status.setText("");	
		}
	}
}