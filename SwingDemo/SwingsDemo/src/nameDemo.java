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

public class nameDemo extends JFrame {

	private JPanel contentPane;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtFullName;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nameDemo frame = new nameDemo();
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
	public nameDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name : ");
		lblNewLabel.setBounds(75, 66, 66, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name : ");
		lblNewLabel_1.setBounds(75, 122, 66, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Full Name");
		lblNewLabel_2.setBounds(75, 188, 66, 14);
		contentPane.add(lblNewLabel_2);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(166, 63, 86, 20);
		contentPane.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setBounds(166, 119, 86, 20);
		contentPane.add(txtLastName);
		txtLastName.setColumns(10);
		
		txtFullName = new JTextField();
		txtFullName.setBounds(166, 185, 86, 20);
		contentPane.add(txtFullName);
		txtFullName.setColumns(10);
		
		btnNewButton = new JButton("Show");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String a=txtFirstName.getText();
		    String b=txtLastName.getText();
		    String c=a+"  "+b;
		    txtFullName.setText(c);
			}
		});
		btnNewButton.setBounds(141, 228, 89, 23);
		contentPane.add(btnNewButton);
	}

}
