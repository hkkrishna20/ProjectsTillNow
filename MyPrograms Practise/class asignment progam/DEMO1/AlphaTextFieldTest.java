import java.awt.*;
import java.awt.event.*;

class AlphaTextField extends TextField implements KeyListener 
{
	private String currentValue = "";
	private Frame fra;
	private TextField txtf;
	
	public void launchFrame()
	{
		fra.setLayout(new FlowLayout());
		txtf = new TextField(30);
		//fra.add(atf);
		fra.add(txtf);
		fra.addKeyListener(this);
		fra.setVisible(true);
	}
	
	public void keyPressed(KeyEvent event) {}
	public void keyReleased(KeyEvent event) {}
	
	public void keyTyped(KeyEvent event) 
	{
		if (event.getKeyChar() >= '0' && event.getKeyChar() <=	'9') 
		{
			txtf.setText(currentValue);
		} else {
			currentValue = txtf.getText();
		}
	}
	
	public static void main(String args[])
	{
		AlphaTextField atf = new AlphaTextField();
		atf.launchFrame();
	}
}