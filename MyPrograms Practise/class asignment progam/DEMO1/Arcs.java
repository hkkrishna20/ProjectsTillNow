import java.awt.*;
import java.applet.*;

/*	<applet code="Arcs" width=300 height=200>
	</applet>
*/
public class Arcs extends Applet
{
	public void paint(Graphics g)
	{
		g.drawArc(10, 40, 60, 50, 0, 75);
		g.fillArc(100, 10, 60, 50, 75, 125);
		g.drawArc(190, 10, 60, 50, 0, 270);
		g.fillArc(70, 90, 140, 100, 120, 180);
	}
}