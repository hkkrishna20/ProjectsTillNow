import java.awt.*;
import java.applet.*;
public class Images extends Applet
{	
	Image img;
	public void init()
	{
		img=getImage(getCodeBase(),"images\\Sunset.jpg");
	}
	public void paint(Graphics g)
	{
		g.drawImage(img,10,10,this);
	}
}