import java.awt.*;
import java.awt.event.*;
//import java.awt.Frame;

public class MenuExample extends WindowAdapter implements  ActionListener
        {
        private Frame fra;
        //private Window wnd1;
        private MenuBar mnb;
        private Menu mn1,mn2,mn3;
        private MenuItem mni1,mni2,mni3,mni4,mni5,mni6,mni7,mni8;
        private TextArea txta1;
       // private Button btn1;
        public MenuExample()
          {
          fra=new Frame("Menu Example");
          //wnd1=new Window("Hello");
          mnb=new MenuBar();
          mn1=new Menu("File");
          mn2=new Menu("Edit");
          mn3=new Menu("Paste");
          mni1=new MenuItem("Open");
          mni2=new MenuItem("New");
          mni3=new MenuItem("Save");
          mni4=new MenuItem("Copy");
          mni5=new MenuItem("Paste");
          mni6=new MenuItem("Paste 1");
          mni7=new MenuItem("Paste 2");
          mni8=new MenuItem("Close");
          //btn1=new Button("Exit");
          txta1=new TextArea("Here u can write.....",20,20);
          }
        public void launch()
          {
          fra.setLayout(new GridLayout(1,1));
          fra.setSize(400,400);
          fra.setLocation(100,100);
          fra.setMenuBar(mnb);
          mnb.add(mn1);
          mnb.add(mn2);
          mn1.add(mni1);
          mn1.add(mni2);
          mn1.add(mni3);
          mn1.add(mni8);
          mn2.add(mni4);
          mn2.add(mn3);
          mn3.add(mni6);
          mn3.add(mni7);
          fra.add(txta1);
          txta1.setVisible(false);
          fra.setVisible(true);
          mni1.addActionListener(new ActionListener()
            {
            public void actionPerformed(ActionEvent e)
              {
              txta1.setVisible(true);
              }
            }
          );

          mni8.addActionListener(new ActionListener()
            {
            public void actionPerformed(ActionEvent e)
              {
              txta1.setVisible(false);
              }
            }
          );


          fra.addWindowListener(this);
          }
        public void windowClosing(WindowEvent e)
          {
          System.exit(0);
          }
       public void actionPerformed(ActionEvent e)
          {      } 

        public static void main(String [] arg)
          {
          MenuExample me=new MenuExample();
          me.launch();

          }
        }
/*class ActionAdapter implements ActionEvent
        {
        public void actionPerformed(ActionEvent e){}
        }  */
