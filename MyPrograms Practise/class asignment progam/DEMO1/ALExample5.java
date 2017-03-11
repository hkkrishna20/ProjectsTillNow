import java.awt.*;
import java.awt.event.*;

public class ALExample5 implements ItemListener
{
	private Frame frm;
	private Checkbox c1, c2, c3;
	private TextField t;
	
	public ALExample5()
	{
		frm = new Frame("Summer 2005");
		c1 = new Checkbox("Choice 1");
		c2 = new Checkbox("Choice 2");
		c3 = new Checkbox("Choice 3");
		t = new TextField(20);
	}
	
	public void launchFrame()
	{
		frm.setSize(200,200);
		frm.setLayout(new FlowLayout());
		frm.add(c1);
		frm.add(c2);
		frm.add(c3);
		frm.add(t);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		frm.setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		String str = getLabel();
		if(str.equals("Choice 1"))
		t.setText("Option 1 Selected");
		else
		if(str.equals("Choice 2"))
		t.setText("Option 2 Selected");
		else
		if(str.equals("Choice 3"))
		t.setText("Option 3 Selected");
	}
	
	public static void main(String args[])
	{
		ALExample5 ale = new ALExample5();
		ale.launchFrame();
	}
}	