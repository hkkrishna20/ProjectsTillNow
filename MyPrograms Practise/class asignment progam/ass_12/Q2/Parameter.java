import java.awt.*;
import java.applet.*;
public class Parameter extends Applet
{	
	String name,roll;
	
	public void init()
	{
		name=this.getParameter("Name");
		roll=this.getParameter("Roll Number");
	}
	public void paint(Graphics g)
	{
		g.drawString("Name="+name+"\n"+"Roll Number="+roll,20,20);
	}
}