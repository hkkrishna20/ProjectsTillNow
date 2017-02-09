import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginFramee extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserField;
	private JPasswordField txtpasswordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFramee frame = new LoginFramee();
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
	public LoginFramee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name : ");
		lblNewLabel.setBounds(57, 73, 76, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password : ");
		lblNewLabel_1.setBounds(57, 111, 76, 14);
		contentPane.add(lblNewLabel_1);
		
		txtUserField = new JTextField();
		txtUserField.setBounds(167, 70, 86, 20);
		contentPane.add(txtUserField);
		txtUserField.setColumns(10);
		
		JButton Login = new JButton("Sign Up");
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String usrname=txtUserField.getText();
			String passwd=txtpasswordField.getText();
			if(usrname.equals("HariKrishna")&&passwd.equals("Rajhari")){
			JOptionPane.showMessageDialog(null, "Successful");
			}
			else{
				JOptionPane.showMessageDialog(null, "UNsuccessful");
				
			}
			}
		});
		Login.setBounds(148, 161, 89, 23);
		contentPane.add(Login);
		
		txtpasswordField = new JPasswordField();
		txtpasswordField.setBounds(167, 108, 86, 20);
		contentPane.add(txtpasswordField);
	}
}
