import java.awt.*;

public class GridTest extends Frame {

  TextArea t = new TextArea(5, 30);
  TextArea ti = new TextArea(2, 20);

  Button send = new  Button("Send");
  Button clear = new Button("Clear");
  GridBagConstraints c = new GridBagConstraints();

  GridBagLayout l = new GridBagLayout();

  public GridTest() 
  {
    setTitle("GridBagLayout Demo");
    setLocation(200, 300);
    setLayout(l);
    c.weightx = 75;
    c.weighty = 50;

    c.fill = GridBagConstraints.NONE;
    c.anchor = GridBagConstraints.CENTER;

    c.gridx = 1;
    c.gridy = 1;
    c.gridwidth = 10;
    c.gridheight = 10;     
    c.fill = GridBagConstraints.BOTH;
    c.anchor = GridBagConstraints.WEST;

    l.setConstraints(t, c);
    t.setEditable(false);
    add(t);    

    c.gridx = 1;
    c.gridy = 11;
    c.gridwidth = 7;
    c.gridheight = 4;
    c.fill = GridBagConstraints.BOTH;
    c.anchor = GridBagConstraints.WEST;

    l.setConstraints(ti, c);
    add(ti);

    c.gridx = 8;
    c.gridy = 11;
    c.gridwidth = 3;
    c.gridheight = 2;
    c.fill =  GridBagConstraints.BOTH;
    c.anchor = GridBagConstraints.EAST;

    l.setConstraints(send, c);
    add(send);

    c.gridx = 8;
    c.gridy = 13;     
    c.gridwidth = 3;
    c.gridheight = 2;
    c.fill =  GridBagConstraints.BOTH;
    c.anchor = GridBagConstraints.EAST;

    l.setConstraints(clear, c);
    add(clear);    

    setSize(300, 200);
    setVisible(true);
  }

  public static void main(String args[])
  {
     new GridTest();
  }
}

