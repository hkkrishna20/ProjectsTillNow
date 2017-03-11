import java.awt.*;
import java.applet.*;

/*	<applet code="Lines" width=300 height=200>
	</applet>
*/
public class Lines extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine(0,0,120,100);
		g.drawLine(40,10,20,10);
		g.drawLine(12,35,100,100);
		g.drawLine(100,0,12,100);
	}
}