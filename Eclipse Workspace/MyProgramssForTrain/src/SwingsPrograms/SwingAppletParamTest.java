package SwingsPrograms;

import java.awt.*;
import javax.swing.*;
 
/** A Swing Counter Applet */
@SuppressWarnings("serial")
public class SwingAppletParamTest extends JApplet {
   String msg;
 
   /** init() runs when the applet is loaded */
   @Override
   public void init () {
      // Get the parameter from the HMTL file
      msg = getParameter("message");
      if (msg == null) msg = "Hi";
 
      try {
         // Run GUI codes in the Event-Dispatcher thread for thread safety
         // Use invokeAndWait() so that init() does not exit before GUI constructed
         SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {
               createGUI();
            }
         });
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
 
   /** Setup the GUI components */
   private void createGUI() {
      Container cp = getContentPane();  // "this" JApplet gets content-pane
      cp.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
      cp.setBackground(new Color(204, 238, 241));
      cp.add(new JLabel(msg, JLabel.CENTER));
   }
}