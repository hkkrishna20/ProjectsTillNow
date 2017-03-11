import java.awt.*;
import java.awt.event.*;

public class GUIEvent extends Frame
{
	public TextField t1, t2;
	public Button create, close, help, delete;
	private Panel p1, p2, p3;
	private Label lb1;
	
	public GUIEvent()
	{
		setLayout(new BorderLayout());
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		lb1 = new Label("Student");
		t1 = new TextField("", 20);
		t2 = new TextField("", 20);
		
		setTitle("GUI Example");
		p1.setSize(new Dimension(500, 50));
		lb1.setFont(new Font("Arial", Font.PLAIN,24));
		add(p1,BorderLayout.NORTH);
		p1.add(lb1);
		
		p2.setSize(new Dimension(50, 50));
		p2.setLayout(new GridLayout(2,2,2,2));
		p2.add(new Label("    Name    "));
		p2.add(t1);
		p2.add(new Label("    Roll No   "));
		p2.add(t2);
		add(p2,BorderLayout.CENTER);
		
		create = new Button("Create");
		close = new Button("Close");
		help = new Button("Help");
		delete = new Button("Delete");
		p3.add(create);
		p3.add(close);
		p3.add(help);
		p3.add(delete);
		add(p3,BorderLayout.SOUTH);
		
		setResizable(false);
		addWindowListener(new WindowClose());
		close.addActionListener(new CloseClicked());
	}
	
	public void display()
	{
		setBounds(100, 100, 300, 150);
		setVisible(true);
	}
	
	public class CloseClicked implements ActionListener
	{
		public void actionPerformaed(ActionEvent e)
		{
			System.exit(0);
		}
	}
	
	public class WindowClose extends WindowAdapter
	{
		public class windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	}
	
	public static void main(String args[])
	{
		GUIEvent c = new GUIEvent();
		c.display();
	}
}