import java.awt.*;
import java.awt.event.*;

public class CatchMe
{
	private Panel playPanel;
	private Button wildButton;
	private Point placement;
	
	public CatchMe()
	{
		Window window = new Frame("Try Pressing the Button");
		playPanel = new Panel();
		wildButton = new Button("Click Me");
		window.add(playPanel, BorderLayout.CENTER);
		playPanel.setLayout(null);
		playPanel.add(wildButton);
		window.setSize(400, 300);
		window.setVisible(true);
		
		Dimension buttonSize = wildButton.getPreferredSize();
		wildButton.setSize(buttonSize);
		placeButton();
		playPanel.addMouseMotionListener(new ButtonMover());
		wildButton.addActionListener(new CaughtListener());
		window.addWindowListener(
			new WindowAdapter()
			{
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			}
		);
	}
	
	public class ButtonMover extends MouseMotionAdapter
	{
		public void mouseMoved(MouseEvent me)
		{
			int xd = Math.abs(placement.x - me.getX());
			int yd = Math.abs(placement.y - me.getY());
			Dimension buttonSize = wildButton.getSize();
			if((xd < buttonSize.width) && (yd < buttonSize.height))
				placeButton();
		}
	}
	
	public class CaughtListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			wildButton.setLabel("Congratulations");
			wildButton.setSize(wildButton.getPreferredSize());
			placeButton();
		}
	}
	
	public void placeButton()
	{
		Dimension playRegion = playPanel.getSize();
		Dimension buttonSize = wildButton.getSize();
		int xSpan = playRegion.width - buttonSize.width;
		int ySpan = playRegion.height - buttonSize.height;
		
		int x = (int)(Math.random() * xSpan);
		int y = (int)(Math.random() * ySpan);
		wildButton.setLocation(x, y);
		
		placement = new Point(x + buttonSize.width/2, y + buttonSize.height/2);
		playPanel.validate();
	}
	
	public static void main(String args[])
	{
		new CatchMe();
	}
}	