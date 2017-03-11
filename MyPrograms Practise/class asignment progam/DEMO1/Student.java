import java.awt.*;
import java.awt.event.*;

class Student implements WindowListener,ActionListener
        {
        private Frame fra;
        Button btn1,btn2,btn3,btn4;
        private Panel pan1,pan2,pan3,pan4,pan5,pan6;
        private Label lbl1,lbl2,lbl3;
        private TextField txtf1,txtf2;
        
        public Student()
          {
          fra=new Frame("GUI Demo");
          btn1=new Button("Create");  btn2=new Button("Delete");
          btn3=new Button("Help");  btn4=new Button("Close"); 
          pan1=new Panel(); pan3=new Panel(); 
          pan2=new Panel(); pan4=new Panel();
          pan5=new Panel(); pan6=new Panel();   
          lbl1=new Label("STUDENT",Label.CENTER);
          lbl2=new Label("Name");
          lbl3=new Label("Roll#");
          txtf1=new TextField(20);
          txtf2=new TextField(20);
          }

        public void start1()
          {
          fra.setLayout(new BorderLayout());
          pan1.setLayout(new GridLayout(2,2,25,1));
          pan1.setSize(200,100);
          pan2.setLayout(new FlowLayout());
          fra.setSize(400,200);
          fra.setLocation(200,200);
          fra.add(pan1);
          fra.add(pan2,"South");
          lbl1.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,25));
          fra.add(lbl1,"North");
          pan1.add(pan3);
          pan3.add(lbl2);
          pan1.add(pan4);
          pan4.add(txtf1);
          pan1.add(pan5);
          pan5.add(lbl3);
          pan1.add(pan6);
          pan6.add(txtf2);
          pan2.add(btn1);
          pan2.add(btn2);
          pan2.add(btn3);
          pan2.add(btn4);
          fra.add(pan2,"South");
          fra.setVisible(true);
          btn4.addActionListener(this);  
          }
       /* public void actionPerformed(ActionEvent ae)
          {
          String str=ae.getActionCommand();
          if(str.equals("enter1"))
            l1.setText("Entered1");
          else if(str.equals("enter2"))
            l1.setText("Entered2");
          else if(str.equals("enter3"))
            l1.setText("Entered3");
          else if(str.equals("enter4"))
            l1.setText("Entered4");
          }     */
        public void actionPerformed(ActionEvent e)
          {
          System.exit(0);
          }

        public void windowActivated(WindowEvent e){}
        public void windowClosed(WindowEvent e){}
        public void windowClosing(WindowEvent e)
          {   System.exit(0);  }
        public void windowDeiconified(WindowEvent e){}
        public void windowIconified(WindowEvent e){}
        public void windowDeactivated(WindowEvent e){}
        public void windowOpened(WindowEvent e){}

        public static void main(String [] arg)
          {
          Student s=new Student();
          s.start1();
          }
        }
