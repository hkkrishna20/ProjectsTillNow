import java.awt.*;
import java.awt.event.*;

public class GUIDemo implements ActionListener{

	private Frame frm;
	private Panel pan1,pan2,pan3,pan4;
	private Button cr,del,hp,cl;
	private Label l;

	public GUIDemo(){
	
	frm=new Frame("GUIDemo");
	p1=new Panel();
	p2=new Panel();
	p3=new Panel();
	p4=new Panel();
	cr=new Button("Create");
	del=new Button("Delete");
	hp=new Button("Help");
	cl=new Button("Close");
	l=new Label("Student");
	}

	public void launchFrame(){
		frm.setSize(300,200);
		frm.setLocation(100,200);
		frm.setLayout(new FlowLayout());
		frm.setBackground(Color.yellow);
		frm.setLayout(new BorderLayout());
		frm.add(p1,BorderLayout.NORTH);
		p1.setLayout(new FlowLayout(FlowLayout.CENTER));
		p1.add(l);
		l.setFont(new Font("TimesRoman",Font.PLAIN,30));
		frm.add(p2,BorderLayout.WEST);
		p2.setLayout(new FlowLayout());
		p2.add(new Label("Name"));
		p2.add(new Label("Roll#"));
		frm.add(p3,BorderLayout.CENTER);
		p3.setLayout(new GridLayout(2,1));
		p3.add(new TextField());
		p3.add(new TextField());
		frm.add(p4,BorderLayout.SOUTH);
		p4.setLayout(new FlowLayout(FlowLayout.CENTER));
		p4.add(cr);
		p4.add(del);
		p4.add(hp);
		p4.add(cl);
		cl.addActionListener(this);
		frm.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		System.exit(0);
	}
	public static void main(String args[])
	{
		GUIDemo pt=new GUIDemo();
		pt.launchFrame();
	}
}
		
