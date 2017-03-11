import java.awt.*;
public class Student extends Frame
{	
	static TextField txt1,txt2;
	static Frame frm;
	static Label lbl1,lbl2,lbl3,lbl4;
	static Button btn1,btn2,btn3,btn4;
	
	public static void main(String arsg[])
	{
		new Student();
		
		launchFrame();
	}
	
	public Student()
	{	
		frm=new Frame();
		txt1=new TextField();
		txt2=new TextField();
		lbl1=new Label("STUDENT");
		lbl2=new Label("NAME");
		lbl3=new Label("ROLL#");
		btn1=new Button("Create");
		btn2=new Button("Delete");
		btn3=new Button("Help");
		btn4=new Button("Close");
	}
	
	static void launchFrame()
	{
		frm.setLayout(null);
		frm.setBackground(Color.yellow);
		frm.setTitle("GUI DEMO");
	
		lbl1.setFont(new Font("TimesRoman",Font.BOLD,24));
		lbl1.setBounds(100,60,200,20);
		frm.add(lbl1);

		lbl2.setFont(new Font("TimesRoman",Font.BOLD,16));
		lbl2.setBounds(50,110,100,24);
		frm.add(lbl2);
		txt1.setBounds(150,110,130,24);
		frm.add(txt1);
	
		lbl3.setFont(new Font("TimesRoman",Font.BOLD,16));
		lbl3.setBounds(50,140,100,24);
		frm.add(lbl3);
		txt2.setBounds(150,140,130,24);
		frm.add(txt2);
		
		btn1.setBounds(90,200,50,25);
		frm.add(btn1);
		btn2.setBounds(150,200,50,25);
		frm.add(btn2);
		btn3.setBounds(210,200,50,25);
		frm.add(btn3);
		btn4.setBounds(270,200,50,25);
		frm.add(btn4);


		frm.setSize(400,300);
		frm.setResizable(false);
		frm.setVisible(true);
	}
}