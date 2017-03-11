package appletsPrograms;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
 
/** An AWT counter applet */
@SuppressWarnings("serial")
public class AWTCounterApplet extends Applet {
   private TextField tfCount; // for displaying the counter value
   private int count = 0;     // counter's value
 
   /** init() runs when the Applet is loaded */
   @Override
   public void init() {
      setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
      setBackground(new Color(204, 238, 241));  // light blue
      add(new Label("Counter: "));      // Label
      tfCount = new TextField("0", 10); // TextField
      tfCount.setEditable(false);
      add(tfCount);
      Button btnCount = new Button("Count");  // Button
      add(btnCount);
 
      // Handling the button-click
      btnCount.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            ++count;
            tfCount.setText(count + "");
         }
      });
   }
}