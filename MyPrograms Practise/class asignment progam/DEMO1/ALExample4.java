import java.awt.*;
import java.awt.event.*;

public class ALExample4 implements KeyListener
{
    private Frame frm;
    private Button b,b1,b2;
    private TextField t;

    public ALExample4()
    {
    	b = new Button("Quit");
        b1 = new Button("Output a Message");
        b2 = new Button("Key has been Released");
        t = new TextField("Message : ", 30);
    	frm = new Frame("Key Listener Example");
    }
    
    public void launchFrame()
    {
    	frm.setLayout(new FlowLayout());
        frm.setSize(300,300);
        frm.add(b);
        frm.add(b1);
        frm.add(b2);
        frm.add(t);
        b.addKeyListener(this);
        b1.addKeyListener(this);
        b2.addKeyListener(this);
        t.setEditable(false);
        frm.setVisible(true);
    }

    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyChar() == 'o' || e.getKeyChar() == 'O')
        t.setText("Message is OK...........");
    }

    public void keyReleased(KeyEvent e)
    {
        if(e.getKeyChar() == 'o' || e.getKeyChar() == 'O')
        t.setText("Key has been Released...........");
    }

    public void keyTyped(KeyEvent e)
    {
     /* if(e.getID() == KeyEvent.KEY_TYPED && (e.getKeyChar() == 'q' || e.getKeyChar() == 'Q'))
        if(e.getKeyChar() == 'q' || e.getKeyChar() == 'Q')
        System.out.println("Quitting application.........");
        System.exit(0); */
    }
    
    public static void main(String args[])
    {
    	ALExample4 ale3=new ALExample4();
        ale3.launchFrame();
    }
}
