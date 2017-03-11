import java.awt.*;
import java.awt.event.*;

public class MyFrameWithExit 
{
	public static void main(String args[]) 
	{
		Frame fra = new Frame();
		fra.setLayout(new FlowLayout());
		fra.setTitle("Advance AWT");
		fra.setSize(200, 100);
		Button btn1 = new Button("Exit");
		Button btn2 = new Button("Do Nothing");
		fra.add(btn1);
		fra.add(btn2);
		ActionListener al = new MyListener();
		btn1.addActionListener(al);
		btn2.addActionListener(al);
		fra.addWindowListener(new WindowAdapter() 
			{
				public void windowClosing(WindowEvent we) 
				{
					System.exit(0);
				}
			});
		fra.setVisible(true);
	}
}

class MyListener implements ActionListener 
{
	public void actionPerformed(ActionEvent event) 
	{
		if (event.getActionCommand().equals("Exit"))
		System.exit(0);
		else
		System.out.println("Doing nothing");
	}
}

