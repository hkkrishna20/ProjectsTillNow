import java.applet.Applet;
import java.awt.Graphics;


public class Check extends Applet 
{

    StringBuffer buffer;

    public void init() 
	{
        	buffer = new StringBuffer();
	        addItem("initializing... ");
    	}

    public void start() 
	{
        	addItem("starting... ");
    	}

    public void stop() 
	{
        	addItem("stopping... ");
    	}

    public void destroy() 
	{
        	addItem("preparing for unloading...");
    	}

    private void addItem(String newWord) 
	{
        	System.out.println(newWord);
        	buffer.append(newWord);
        }

    public void paint(Graphics g) 
	{
        g.drawString(buffer.toString(), 5, 15);
    	}
}
