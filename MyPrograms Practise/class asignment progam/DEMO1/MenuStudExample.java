import java.awt.*;
import java.awt.event.*;
//import java.awt.Frame;

public class MenuStudExample extends WindowAdapter implements  ActionListener
        {
        private Frame fra;
        private MenuBar mnb;
        private Menu mn1;
        private MenuItem mni1,mni2;

        public MenuStudExample()
          {
          fra=new Frame("Menu Example");
          mnb=new MenuBar();
          mn1=new Menu("File");
          mni1=new MenuItem("Open");
          mni2=new MenuItem("Close");
          }

        public void launch()
          {
          fra.setLayout(new GridLayout(1,1));
          fra.setSize(400,400);
          fra.setLocation(200,200);
          fra.setMenuBar(mnb);
          mnb.add(mn1);
          mn1.add(mni1);
          mn1.add(mni2);

          fra.setVisible(true);
          mni1.addActionListener(new ActionListener()
            {
            public void actionPerformed(ActionEvent e)
              {
              MenuStud ms=new MenuStud();
              ms.createAll();
              }
            }
          );

          mni2.addActionListener(new ActionListener()
            {
            public void actionPerformed(ActionEvent e)
              {
              MenuStud ms=new MenuStud();
              ms.close();
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
          MenuStudExample me=new MenuStudExample();
          me.launch();

          }
        }
/*class ActionAdapter implements ActionEvent
        {
        public void actionPerformed(ActionEvent e){}
        }  */
