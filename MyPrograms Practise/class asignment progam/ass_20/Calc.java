import java.awt.*;
import java.awt.event.*;
class Calculator extends Frame
{	
	
	public String val;
	public String res;
	int sumcount=0;
	public TextField t;
	public Button off,clear,sinx,cosx,tanx,sqrtx,inversex,power,
		mod,one,two,three,four,five,six,seven,eight,nine,plus,
		minus,mul,div,equal,dot,zero;
	
	Panel p0,p1;	
	
	public Calculator()
	{	
		val=new String("");
		res=new String("");
		setLayout(new BorderLayout());
		setTitle("My Calculator");
		p0=new Panel();
		p1=new Panel();
		
		t=new TextField("",20);
		t.setEditable(false);
		
		off=new Button("OFF");
		clear=new Button("CLEAR");
		sinx=new Button("sin(x)");
		cosx=new Button("cos(x)");
		tanx=new Button("tan(x)");
		sqrtx=new Button("sqrt(x)");
		inversex=new Button("1/x");
		power=new Button("x^y");
		mod=new Button("%");
		one=new Button("1");
		two=new Button("2");
		three=new Button("3");
		four=new Button("4");
		five=new Button("5");
		six=new Button("6");
		seven=new Button("7");
		eight=new Button("8");
		nine=new Button("9");
		zero=new Button("0");
		plus=new Button("+");
		minus=new Button("-");
		mul=new Button("*");
		div=new Button("/");
		dot=new Button(".");
		equal=new Button("=");
		
		add(p0,BorderLayout.NORTH);
		p0.setLayout(new GridLayout(1,2,80,0));
		p0.add(off);
		p0.add(t);
	
		add(p1,BorderLayout.CENTER);
		p1.setLayout(new GridLayout(4,6,0,0));
		p1.add(clear);
		p1.add(sinx);
		p1.add(one);
		p1.add(two);
		p1.add(three);
		p1.add(plus);
		p1.add(inversex);
		p1.add(cosx);
		p1.add(four);
		p1.add(five);
		p1.add(six);
		p1.add(minus);
		p1.add(power);
		p1.add(tanx);
		p1.add(seven);
		p1.add(eight);
		p1.add(nine);
		p1.add(mul);
		p1.add(mod);
		p1.add(sqrtx);
		p1.add(dot);
		p1.add(zero);
		p1.add(equal);
		p1.add(div);
	
		setResizable(false);
	
		addWindowListener(new WindowClose());
		
		off.addActionListener(new OffClicked());
		clear.addActionListener(new ClearClicked());
		sinx.addActionListener(new SinxClicked());
		cosx.addActionListener(new CosxClicked());
		tanx.addActionListener(new TanxClicked());
		sqrtx.addActionListener(new SqrtxClicked());
		inversex.addActionListener(new InversexClicked());
		one.addActionListener(new OneClicked());
		two.addActionListener(new TwoClicked());
		three.addActionListener(new ThreeClicked());
		four.addActionListener(new FourClicked());
		five.addActionListener(new FiveClicked());
		six.addActionListener(new SixClicked());
		seven.addActionListener(new SevenClicked());
		eight.addActionListener(new EightClicked());
		nine.addActionListener(new NineClicked());
		zero.addActionListener(new ZeroClicked());


		plus.addActionListener(new PlusClicked());
		minus.addActionListener(new MinusClicked());
		mul.addActionListener(new MulClicked());
		div.addActionListener(new DivClicked());
		mod.addActionListener(new ModClicked());
		
	}
	
	public void display()
	{	
		setSize(300,200);
		setVisible(true);
	}
	
	public class WindowClose extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	}
	
	public class OffClicked implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);	
		}
	}
	
	public class ClearClicked implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			sumcount=0;
			res=null;res=new String("0");
			val=null;val=new String("0");
			t.setText("0");	
		}
	}
	public class SinxClicked implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double x=Double.parseDouble(t.getText());
			String s=String.valueOf(Math.sin(x));
			t.setText(s);	
		}
	}
	public class CosxClicked implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double x=Double.parseDouble(t.getText());
			String s=String.valueOf(Math.cos(x));
			t.setText(s);	
		}
	}
	
	public class TanxClicked implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double x=Double.parseDouble(t.getText());
			String s=String.valueOf(Math.tan(x));
			t.setText(s);	
		}
	}
	public class SqrtxClicked implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double x=Double.parseDouble(t.getText());
			String s=String.valueOf(Math.sqrt(x));
			t.setText(s);	
		}
	}
	public class InversexClicked implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double x=Double.parseDouble(t.getText());
			String s=String.valueOf(1/x);
			t.setText(s);
			val=t.getText();	
		}
	}
	public class OneClicked implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{	
			if(sumcount>0 && val==null)
				t.setText("");
			value();
			val=val+"1";
			t.setText(val);
		}
	}
	public class TwoClicked implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{	
				if(sumcount>0 && val==null)
				t.setText("");
			value();
			val=val+"2";
			t.setText(val);
		}
	}
	public class ThreeClicked implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{	
				if(sumcount>0 && val==null)
				t.setText("");
			value();
			val=val+"3";
			t.setText(val);
		}
	}
	public class FourClicked implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{	
				if(sumcount>0 && val==null)
				t.setText("");
			value();
			val=val+"4";
			t.setText(val);
		}
	}
	public class FiveClicked implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{	
				if(sumcount>0 && val==null)
				t.setText("");
			value();
			val=val+"5";
			t.setText(val);
		}
	}
	public class SixClicked implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{	
				if(sumcount>0 && val==null)
				t.setText("");
			value();
			val=val+"6";
			t.setText(val);
		}
	}
	public class SevenClicked implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{	
				if(sumcount>0 && val==null)
				t.setText("");
			value();
			val=val+"7";
			t.setText(val);
		}
	}
	public class EightClicked implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{	
				if(sumcount>0 && val==null)
				t.setText("");
			value();
			val=val+"8";
			t.setText(val);
		}
	}
	public class NineClicked implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{	
				if(sumcount>0 && val==null)
				t.setText("");
			value();
			val=val+"9";
			t.setText(val);
		}
	}
	public class ZeroClicked implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{	
				if(sumcount>0 && val==null)
				t.setText("");
			value();
			val=val+"0";
			t.setText(val);
		}
	}
	
	public class PlusClicked implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{	
			if(sumcount==0)
				res=String.valueOf(Double.parseDouble(val));
			else	
			res=String.valueOf(Double.parseDouble(res)+Double.parseDouble(val));
			t.setText(res);
			val=null;
			sumcount++;

			}
	}
	public class MinusClicked implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{	
			if(sumcount==0)
				res=String.valueOf(Double.parseDouble(val));
			else	
			res=String.valueOf(Double.parseDouble(res)-Double.parseDouble(val));
			t.setText(res);
			val=null;
			sumcount++;

			}
	}
	public class MulClicked implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{	
			if(sumcount==0)
				res=String.valueOf(Double.parseDouble(val));
			else	
			res=String.valueOf(Double.parseDouble(res)*Double.parseDouble(val));
			t.setText(res);
			val=null;
			sumcount++;

			}
	}
	public class DivClicked implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{	
			if(sumcount==0)
				res=String.valueOf(Double.parseDouble(val));
			else	
			res=String.valueOf(Double.parseDouble(res)/Double.parseDouble(val));
			t.setText(res);
			val=null;
			sumcount++;

			}
	}
	public class ModClicked implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{	
			if(sumcount==0)
				res=String.valueOf(Double.parseDouble(val));
			else	
			res=String.valueOf(Double.parseDouble(res)%Double.parseDouble(val));
			t.setText(res);
			val=null;
			sumcount++;

			}
	}
	public class EqualClicked implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{	
				plus.addActionListener(new PlusClicked());
			t.setText(res);
		}
	}
	
	public void value()
	{	
		val=t.getText();
		System.out.println(val+"h");
	}
}
public class Calc
{	public static void main(String s[])
	{
		Calculator c=new Calculator();
		c.display();
	}
}