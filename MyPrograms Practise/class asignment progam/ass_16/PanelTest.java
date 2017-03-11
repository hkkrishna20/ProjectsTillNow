import java.awt.*;
class PanelTest extends Frame
{
	public static void main(String s[])
	{
		new PanelTest();
	}
	
	public PanelTest()
	{	
		
		
		setTitle("Panel Test");
		setLayout(new FlowLayout());
		setBackground(Color.green);
		setForeground(Color.black);
		
		Panel borderPanel=new Panel();	
		borderPanel.setLayout(new BorderLayout());
		add(new Label("Border Layout"));
		add(borderPanel);
		borderPanel.add(new Button("North"), BorderLayout.NORTH);
     		borderPanel.add(new Button("South"), BorderLayout.SOUTH);
     		borderPanel.add(new Button("East"), BorderLayout.EAST);
    		borderPanel.add(new Button("West"), BorderLayout.WEST);
    		borderPanel.add(new Button("Center"), BorderLayout.CENTER);
		
		
		
		Panel flowPanel=new Panel();
		flowPanel.setLayout(new FlowLayout());
		add(new Label("Flow Layout"));
		add(flowPanel);
		flowPanel.add(new Checkbox("First"));
		flowPanel.add(new Checkbox("Second"));
		flowPanel.add(new Checkbox("Third"));
		flowPanel.setBackground(Color.RED);		

		Panel gridPanel=new Panel();
		gridPanel.setLayout(new GridLayout(2,2));
		add(new Label("Grid Layout"));
		add(gridPanel);
		gridPanel.add(new TextField("First"));
         	gridPanel.add(new TextField("Second"));
         	gridPanel.add(new TextField("Third"));
         	gridPanel.add(new TextField("Fourth"));
		
		setStatus("NIST");
		
		setSize(200,400);
		setVisible(true);
	
	}
}