import java.awt.*;
import java.applet.*;

/*<applet code="Ellipses" width=300 height=200>
  </applet>
*/
public class Ellipses extends Applet
{
	
	public void paint(Graphics g)
	{
		g.drawOval(10, 10, 60, 50);
		g.fillOval(100, 10, 60, 50);
		g.drawOval(190, 10, 60, 50);
		g.fillOval(70, 90, 140, 100);
	}
}