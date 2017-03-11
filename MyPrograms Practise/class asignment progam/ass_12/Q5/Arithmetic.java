import java.awt.*;
import java.applet.*;
public class Arithmetic extends Applet
{	
	String num1,num2;
	public void init()
	{
		num1=this.getParameter("num2");
		num2=this.getParameter("num1");
	}
	public void paint(Graphics g)
	{	
		int sum=Integer.parseInt(num1)+Integer.parseInt(num2);
		int diff=Integer.parseInt(num1)-Integer.parseInt(num2);
		int pro=Integer.parseInt(num1)*Integer.parseInt(num2);
		int div=Integer.parseInt(num1)/Integer.parseInt(num2);
		g.drawString("sum="+sum+" \ndiff="+diff+"\n product="+pro+"\n division="+div,20,20);
	}
}