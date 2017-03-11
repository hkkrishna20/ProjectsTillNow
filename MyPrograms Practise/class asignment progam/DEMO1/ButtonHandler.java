import java.awt.event.*;

public class ButtonHandler implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("Action Performed");
		System.out.println("Buttons command is: " + e.getActionCommand());
	}
}