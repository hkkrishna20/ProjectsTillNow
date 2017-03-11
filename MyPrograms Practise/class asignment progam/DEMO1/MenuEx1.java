import java.awt.*;
import java.awt.event.*;

public class MenuEx1 implements MouseListener,ActionListener,WindowListener{

	private Frame fra,frm;
	private MenuBar mnb;
	private Label l;
	private Menu mn1,mn2,mn3,mni1;
	private Button btn1,btn2,cr,del,hp,cl;
	private Panel pan1,pan2,pan3,p1,p2,p3;
	private MenuItem 	mni2,mni3,mni4,mni5,mni6,mni7,mni8,mni9,mni10,mni11,mni12,mni13,mni14,mnil;
	CardLayout myCard;
	public MenuEx1()
	{
		fra=new Frame("Menu Test");
		frm=new Frame("Student Menu");
		p1=new Panel();
		p2=new Panel();
		p3=new Panel();
		p4=new Panel();
		cr=new Button("Create");
		del=new Button("Delete");
		hp=new Button("Help");
		cl=new Button("Exit");
		l=new Label("Student");
		btn1=new Button("Next");
		btn2=new Button("Close");
		mnb=new MenuBar();
		mn1=new Menu("A");
		mn2=new Menu("B");
		mn3=new Menu("C");
		mni1=new Menu("New");
		mni2=new MenuItem("Open");
		mni3=new MenuItem("Save");
		mnil=new MenuItem("-");
		mni4=new MenuItem("Exit");		
		mni5=new MenuItem("Undo");	
		mni6=new MenuItem("cut");	
		mni7=new MenuItem("Copy");	
		mni8=new MenuItem("Paste");	
		mni9=new MenuItem("Find");	
		mni10=new MenuItem("FindNext");	
		mni11=new MenuItem(".class");
		mni12=new MenuItem(".c ");
		mni13=new MenuItem(".java");
		mni14=new MenuItem(".bin");
		pan1=new Panel();
		pan2=new Panel();
		pan3=new Panel();		
		myCard=new CardLayout();

	}
	public void launchFrame()
	{
		fra.setSize(300,300);
		fra.setLocation(200,200);
		fra.setLayout(myCard);
		fra.setMenuBar(mnb);
		
		pan1.setBackground(Color.red);
		pan1.add(btn1);
		pan1.add(new Label("This is First panel"));
		
		pan2.setBackground(Color.blue);
		pan2.add(new Label("This is Second Panel"));
		pan2.add(btn1);
		
		pan3.setBackground(Color.yellow);
		pan3.add(new Label("This is Third Panel"));
		pan3.add(btn2);
		
		mnb.add(mn1);
		mnb.add(mn2);
		mnb.add(mn3);
		mn1.add(mni1);
		mn1.add(mni2);
		mn1.add(mni3);
		mn1.add(mnil);
		mn1.add(mni4);
		mn2.add(mni5);
		mn2.add(mni6);
		mn2.add(mni7);
		mn2.add(mni8);
		mn3.add(mni9);		
		mn3.add(mni10);
		mni1.add(mni11);
		mni1.add(mni12);
		mni1.add(mni13);
		mni1.add(mni14);
		mni2.addActionListener(this);
		pan1.addMouseListener(this);
		pan2.addMouseListener(this);
		pan3.addMouseListener(this);
		fra.addWindowListener(this);
		btn2.addActionListener(this);
		mni3.addActionListener(this);


		frm.setSize(300,200);
		frm.setLocation(100,200);
		frm.setLayout(new FlowLayout());
		frm.setBackground(Color.yellow);
		frm.setLayout(new BorderLayout());
		
		p1.setLayout(new FlowLayout(FlowLayout.CENTER));
		p1.add(l);
		l.setFont(new Font("TimesRoman",Font.PLAIN,30));
		
		p2.setLayout(new FlowLayout());
		p2.add(new Label("Name"));
		p2.add(new Label("Roll#"));
		
		p3.setLayout(new GridLayout(2,1));
		p3.add(new TextField());
		p3.add(new TextField());
		
		p4.setLayout(new FlowLayout(FlowLayout.CENTER));
		p4.add(cr);
		p4.add(del);
		p4.add(hp);
		p4.add(cl);
		cl.addActionListener(this);
		frm.setVisible(true);
		fra.setVisible(true);

	}

	public void mousePressed(MouseEvent e) {
		
		
		myCard.next(fra);
	}		
	public void mouseReleased(MouseEvent e) {}
	public void mouseClicked(MouseEvent e)
 	{
	
		
	}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}

	public void windowClosing(WindowEvent w)
	{
		
		System.exit(0);
	}
	public void windowClosed(WindowEvent w)
	{

		

	}
	public void windowOpened(WindowEvent w) {   }
	public void windowIconified(WindowEvent w)  {   }
	public void windowDeiconified(WindowEvent w)  {   }
	public void windowActivated(WindowEvent w)  {   }
	public void windowDeactivated(WindowEvent w)  {   }


	public void actionPerformed(ActionEvent e)  
	{	if(e.getActionCommand().equals("Open"))
		{
			fra.add(pan1,"First");
			fra.add(pan2,"Second");
			fra.add(pan3,"Third");
			myCard.show(fra,"First");
		}
		else
		if(e.getActionCommand().equals("Close"))
		{
			fra.remove(pan1);
			fra.remove(pan2);
			fra.remove(pan3);
		}
		else
		if(e.getActionCommand().equals("Exit"))
			System.exit(0);
		else
		if(e.getActionCommand().equals("Save"))
		{
			frm.add(p1,BorderLayout.NORTH);
			frm.add(p2,BorderLayout.WEST);
			frm.add(p3,BorderLayout.CENTER);
			frm.add(p4,BorderLayout.SOUTH);
	    }
	public static void main(String args[])
	{
		MenuEx1 me=new MenuEx1();
		me.launchFrame();
	}
}
