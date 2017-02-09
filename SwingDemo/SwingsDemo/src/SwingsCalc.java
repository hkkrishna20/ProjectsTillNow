import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwingsCalc extends JFrame {

	private JPanel contentPane;
	private JTextField txtFirstNo;
	private JTextField txtSecondNo;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingsCalc frame = new SwingsCalc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SwingsCalc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFirstNo = new JLabel("First No : ");
		lblFirstNo.setBounds(53, 32, 87, 14);
		contentPane.add(lblFirstNo);
		
		JLabel lblSecondNo = new JLabel("Second No : ");
		lblSecondNo.setBounds(53, 90, 75, 14);
		contentPane.add(lblSecondNo);
		
		JLabel lblResult = new JLabel("Result : ");
		lblResult.setBounds(53, 141, 75, 14);
		contentPane.add(lblResult);
		
		txtFirstNo = new JTextField();
		txtFirstNo.setBounds(179, 29, 86, 20);
		contentPane.add(txtFirstNo);
		txtFirstNo.setColumns(10);
		
		txtSecondNo = new JTextField();
		txtSecondNo.setBounds(179, 87, 86, 20);
		contentPane.add(txtSecondNo);
		txtSecondNo.setColumns(10);
		
		txtResult = new JTextField();
		txtResult.setEditable(false);
		txtResult.setBounds(179, 138, 86, 20);
		contentPane.add(txtResult);
		txtResult.setColumns(10);
		
		JButton btnNewButton = new JButton("Sub");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				int a,b,c;
				a=Integer.parseInt(txtFirstNo.getText());
				b=Integer.parseInt(txtSecondNo.getText());
				c=a-b;
				String res="";
				res+=c;
				txtResult.setText(res);
				}
		});
		btnNewButton.setBounds(10, 194, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sum");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			int a,b,c;
			a=Integer.parseInt(txtFirstNo.getText());
			b=Integer.parseInt(txtSecondNo.getText());
			c=a+b;
			String res="";
			res+=c;
			txtResult.setText(res);
			}
		});
		btnNewButton_1.setBounds(139, 194, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Multi");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a,b,c;
				a=Integer.parseInt(txtFirstNo.getText());
				b=Integer.parseInt(txtSecondNo.getText());
				c=a*b;
				String res="";
				res+=c;
				txtResult.setText(res);
				}
			
		});
		btnNewButton_2.setBounds(270, 194, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}
