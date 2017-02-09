import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ComboBox extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboBox frame = new ComboBox();
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
	public ComboBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox cmbNames = new JComboBox();
		cmbNames.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
			String name=cmbNames.getSelectedItem().toString();
			JOptionPane.showMessageDialog(null, "Name is "+name);
			}
		});
		cmbNames.setBounds(158, 45, 170, 20);
		contentPane.add(cmbNames);
		cmbNames.addItem("Hari");
		cmbNames.addItem("Hi");
		cmbNames.addItem("ri");	
		cmbNames.addItem("Hai");	
		cmbNames.addItem("i");	
		cmbNames.addItem("H");	
		JLabel lblNames = new JLabel("Names");
		lblNames.setBounds(26, 48, 46, 14);
		contentPane.add(lblNames);
	}
}
