import java.awt.*;

public class TestButton
{
	private Frame frm;
	private Button b;
	
	public TestButton()
	{
		Frame frm = new Frame("Test");
		Button b = new Button("Press Me");
		b.setActionCommand("ButtonPressed");
	}
	
	public void launchFrame()
	{
		b.addActionListener(new ButtonHandler());
		frm.add(b, BorderLayout.CENTER);
		frm.pack();
		frm.setVisible(true);
	}
	
	public static void main(String args[])
	{
		TestButton guiApp = new TestButton();
		guiApp.launchFrame();
	}
}