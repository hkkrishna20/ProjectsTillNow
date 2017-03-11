import java.awt.*;
import java.awt.event.*;

public class MenuStud extends WindowAdapter implements MouseListener,KeyListener
        {
	private Frame frm;

        private Panel pan1;
        private Panel pan2;

        private Button btn1;
        private Button btn4;
        private Button btnYes;
        private Button btnNo;

        private Label lbl1;
        private Label lbl2;
        private Label lbl3;

        private TextField txtf1;
        private TextField txtf2;

        private Dialog dg;
        private Dialog dg1;

        public MenuStud()
          {
          frm = new Frame("Menu Student");

          pan1 = new Panel();
          pan2 = new Panel();

          btn1 = new Button("Add");
          btn4 = new Button("Close");
          btnYes = new Button("Yes");
          btnNo = new Button("No");

          lbl1 = new Label("Student",Label.CENTER);
          lbl2 = new Label("Name");
          lbl3 = new Label("Roll#");
                 
          txtf1 = new TextField("Name",25);
          txtf2 = new TextField("Roll",10);

          dg=new Dialog(frm,"Create Dialog Box",false);
          dg.add(new Label("Are You Sure to add this Informaiton into DataBase?"));
          dg.setLocation(150,150);
          dg.setSize(200,200);
          dg.setLayout(new FlowLayout());
          
          dg1=new Dialog(frm," Dialog Box",false);
          dg1.add(new Label("CONGRATULATION"));
          dg1.setLocation(150,150);
          dg1.setSize(200,200);
          dg1.setLayout(new FlowLayout());

          btnYes.addMouseListener(this);
          btnNo.addMouseListener(this);

          btn1.addMouseListener(this);
          btn1.addKeyListener(this);

          btn4.addMouseListener(this);
          btn4.addKeyListener(this);

          frm.addWindowListener(this);
          }

        public void createPan1()
          {
          pan1.setLayout(new GridLayout(2,2));
          pan1.add(lbl2);
          pan1.add(txtf1);
          pan1.add(lbl3);
          pan1.add(txtf2);
          }
        
        public void createPan2()
          {
          pan2.setLayout(new FlowLayout());
          pan2.add(btn1);
          pan2.add(btn4);
          }

        public void createFrame()
          {
          frm.setSize(250,150);
          frm.setLocation(200,150);
          frm.setResizable(false);

          lbl1.setFont(new Font("Serif",Font.BOLD|Font.PLAIN,25));

          frm.add("North",lbl1);
          frm.add(pan1);
          frm.add("South",pan2);
          frm.setVisible(true);
          }

        public void createAll()
          {
          createPan1();
          createPan2();
          createFrame();
          }

        public void close()
          {
          System.exit(0);
          }

        public void mouseClicked(MouseEvent me)
          {
          Button btn=(Button)me.getSource();
          String str=btn.getLabel();

          if(str.equals("Close"))
            {
            frm.setVisible(false);
            }
          
          if(str.equals("Add"))
            {
            frm.setVisible(false);
            dg.add(new Label("Name: "+ txtf1.getText()));
            dg.add(new Label("Name: "+ txtf2.getText()));
            dg.add(btnYes);
            dg.add(btnNo);


            dg.addWindowListener(new WindowAdapter()
              {
              public void windowClosing(WindowEvent e)
                {
                dg.setVisible(false);
                }
              });
                               
             dg.setVisible(true);
             }

             if(str.equals("Yes"))
               {
               
               dg.setVisible(false);
               dg1.setVisible(true);

               dg1.addWindowListener(new WindowAdapter()
                 {
                 public void windowClosing(WindowEvent e)
                   {
                   dg1.setVisible(false);
                   frm.setVisible(true);
                   }
                 });
               }
               if(str.equals("No"))
                 {
                 dg.setVisible(false);
                 frm.setVisible(false);
                 }
             }
        public void mousePressed(MouseEvent me){}
        public void mouseReleased(MouseEvent me){}
        public void mouseEntered(MouseEvent me){}
        public void mouseExited(MouseEvent me){}

	public void windowClosing(WindowEvent we)
          {
          System.exit(0);
          }

	public void keyPressed(KeyEvent ke)
          { 
          char ch = ke.getKeyChar();
          if(ch=='q' || ch=='Q')
            {
            System.out.println("Close");
            System.exit(0);
            }
          if(ch=='c' || ch=='C')
            {
            System.out.println("Create");
            }
          if(ch=='h' || ch=='H')
            {
            System.out.println("Help");
            }
          if(ch=='d' || ch=='D')
            {
            System.out.println("Delete");
            }
          }
         
        public void keyReleased(KeyEvent ke){}
        public void keyTyped(KeyEvent ke){}

	public static void main(String args[])
          {
          MenuStud gVar = new MenuStud();
          gVar.createAll();
          }
}
