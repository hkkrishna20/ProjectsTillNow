import java.awt.*;
import java.applet.*;

/*	<applet code="Hglass" width=300 height=200>
	</applet>
*/
public class Hglass extends Applet
{
	public void paint(Graphics g)
	{
		int xpoints[] = {30, 200, 30, 200, 30};
		int ypoints[] = {30, 30, 200, 200, 30};
		int num = 5;
		
		g.drawPolygon(xpoints, ypoints, num);
	}
}