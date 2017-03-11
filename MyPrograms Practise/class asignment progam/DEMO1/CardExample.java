import java.awt.*;
import java.awt.event.*;

public class CardExample implements MouseListener
{
	private Panel p1,p2,p3,p4,p5;
	private Label lb1,lb2,lb3,lb4,lb5;
	private CardLayout myCard;
	private Frame frm;
		
	public CardExample()
	{
		frm = new Frame("Card Layout Example");
		myCard = new CardLayout();
		
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		p4 = new Panel();
		p5 = new Panel();
		
		lb1 = new Label("This is First Panel");
		lb2 = new Label("This is Second Panel");
		lb3 = new Label("This is Third Panel");
		lb4 = new Label("This is Fourth Panel");
		lb5 = new Label("This is Fifth Panel");
	}
	
	public void launchFrame()
	{
		frm.setLayout(myCard);
		
		p1.setBackground(Color.yellow);
		p1.add(lb1);
		p2.setBackground(Color.green);
		p2.add(lb2);
		p3.setBackground(Color.magenta);
		p3.add(lb3);
		p4.setBackground(Color.white);
		p4.add(lb4);
		p5.setBackground(Color.cyan);
		p5.add(lb5);
		
		p1.addMouseListener(this);
		p2.addMouseListener(this);
		p3.addMouseListener(this);
		p4.addMouseListener(this);
		p5.addMouseListener(this);
		
		frm.add(p1, "First");
		frm.add(p2, "Second");
		frm.add(p3, "Third");
		frm.add(p4, "Fourth");
		frm.add(p5, "Fifth");
		
		myCard.show(frm, "First");
		
		frm.setSize(300,300);
		frm.setVisible(true);
	}
	
	public void mousePressed(MouseEvent e)
	{
		myCard.next(frm);
	}
	
	public void mouseReleased(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	
	public static void main(String args[])
	{
		CardExample guiWindow = new CardExample();
		guiWindow.launchFrame();
	}
}