import java.awt.*;

public class PanelTest extends Frame {
    public static void main(String args[]) {
	  new PanelTest();
    }

    public PanelTest() {
	  setTitle("Panel Test");
	  setLayout(new FlowLayout());

	  Panel borderPanel = new Panel();
	  borderPanel.setLayout(new BorderLayout());
	  borderPanel.setBackground(Color.blue);
	  
	  borderPanel.add("North", new Button("north"));
	  borderPanel.add("South", new Button("south"));
	  borderPanel.add("East", new Button("east"));
	  borderPanel.add("West", new Button("west"));
	  borderPanel.add("Center", new Button("center"));

	  add(new Label("BorderLayout"));
	  add(borderPanel);

	  Panel flowPanel = new Panel();
	  flowPanel.setLayout(new FlowLayout());
	  flowPanel.setBackground(Color.red);

	  flowPanel.add(new Checkbox("First"));
	  flowPanel.add(new Checkbox("Second"));
	  flowPanel.add(new Checkbox("Third"));

	  add(new Label("FlowLayout"));
	  add(flowPanel);

	  Panel gridPanel = new Panel();
	  gridPanel.setLayout(new GridLayout(2, 2));
	  gridPanel.setBackground(Color.green);

	  gridPanel.add(new TextField("First"));
	  gridPanel.add(new TextField("Second"));
	  gridPanel.add(new TextField("Third"));
	  gridPanel.add(new TextField("Fourth"));

	  add(new Label("GridLayout"));
	  add(gridPanel);

	  setSize(200, 300);
	  show();
    }
}
