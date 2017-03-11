import java.awt.*;
import java.awt.event.*;
	
class CreateAccount extends Frame
{
	public TextField t1,t2,t3,t4;
	public Button create,close;
	Panel p0,p1,p2,p3,p4;
	Label heading;
	
	public CreateAccount()
	{
		setLayout(new BorderLayout());
		p0=new Panel();
		p1=new Panel();
		p2=new Panel();
		
		heading=new Label("Heading");
		
		t1=new TextField("",20);
		t2=new TextField("",20);
		t3=new TextField("",20);
		t4=new TextField("",20);
	
		t2.setEditable(false);
		t3.setEditable(false);
		
		setTitle("Action Listener Demo");
		p0.setSize(new Dimension(500,500));
		heading.setFont(new Font("Arial",Font.PLAIN,24));
		add(p0,BorderLayout.NORTH);
		p0.add(heading);
		
		p1.setSize(new Dimension(50,50));
		p1.setLayout(new GridLayout(2,4,2,2));
		
		p1.add(new Label("	Enter Name Here:"));
		p1.add(t1);
		p1.add(new Label("	Display Name Here:"));
		p1.add(t2);
		p1.add(new Label("	Mouse Position:"));
		p1.add(t3);
		p1.add(new Label("	Mouse Up/Down:"));
		p1.add(t4);
		add(p1,BorderLayout.CENTER);
		
		create=new Button("Create");
		close=new Button("Close");
		p2.add(create);
		p2.add(close);
		add(p2,BorderLayout.SOUTH);
		
		setResizable(false);
		
		addWindowListener(new WindowClose());
		create.addActionListener(new CreateClicked());
		close.addActionListener(new CloseClicked());
		t1.addKeyListener(new KeyInput());
		
		p0.addMouseMotionListener(new MoveMouse());
		p1.addMouseMotionListener(new MoveMouse());
		p2.addMouseMotionListener(new MoveMouse());
		t1.addMouseMotionListener(new MoveMouse());
		t2.addMouseMotionListener(new MoveMouse());
		t3.addMouseMotionListener(new MoveMouse());
		t4.addMouseMotionListener(new MoveMouse());
		
		p0.addMouseListener(new ClickMouse());
		p1.addMouseListener(new ClickMouse());
		p2.addMouseListener(new ClickMouse());
		t1.addMouseListener(new ClickMouse());
		t2.addMouseListener(new ClickMouse());
		t3.addMouseListener(new ClickMouse());
		t4.addMouseListener(new ClickMouse());
	}
	
	public void displayAccount()
	{
		setBounds(100,100,600,150);
		setVisible(true);
	}
	

	
	class MoveMouse implements MouseMotionListener
	{
		public void mouseMoved(MouseEvent e)
		{
			t3.setText(e.getX()+","+e.getY());
		}
		
		public void mouseDragged(MouseEvent e)
		{
			t3.setText(e.getX()+","+e.getY());
		}
	}
	
	
	public class ClickMouse extends MouseAdapter
	{
		public void mousePressed(MouseEvent e)
		{
			t4.setText("Down");
		}
		public void mouseReleased(MouseEvent e)
		{
			t4.setText("Up");
		}
	}
		
	public class KeyInput extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{
			if(e.getSource()==t1)
				t2.setText(t1.getText());
		}
	}
	
	public class CloseClicked implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}
	
	public class WindowClose extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	}
		
	public class CreateClicked implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			CreateAccountData er=new CreateAccountData("Name="+t1.getText().trim()+
						"  Mouse Position(X,Y)="+t3.getText().trim());
			
			er.displayAccountData();
		}
}
}



class CreateAccountData extends Frame
{
	Button ok;
	Label l1;
	Panel p0,p1;
	
	CreateAccountData(String s)
	{
		ok=new Button("OK");
		l1=new Label(s);
		this.setLayout(new BorderLayout());
		p0=new Panel();
		p1=new Panel();
		p0.add(l1);
		p1.add(ok);
		add(p0,BorderLayout.NORTH);
		add(p1,BorderLayout.CENTER);
	}
	
	public void displayAccountData()
	{
		setVisible(true);
		String s=l1.getText();
		s=s.concat("Name=,Mouse position(X,Y)=");
		pack();
		setLocation(200,200);
		setResizable(false);
		addWindowListener(new WindowClose());
		ok.addActionListener(new CloseClicked());
	}
	
	public class CloseClicked implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			dispose();
		}
	}
		
	public class WindowClose extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			dispose();
		}
	}

}


public class Demo
{
	public static void main(String s[])
	{
		CreateAccount c=new CreateAccount();
		c.displayAccount();
	}
}



































	

