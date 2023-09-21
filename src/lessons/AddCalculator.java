package lessons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddCalculator {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCalculator window = new AddCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField1 = new JTextField();
		textField1.setBounds(222, 89, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(222, 167, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		JButton button1 = new JButton("Add");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button1 code goes here!!!!!!
				int myInteger1 = 0;
				int myInteger2 = 0;
				int answer = 0;
				
				myInteger1 = Integer.parseInt(textField1.getText());
				myInteger2 = Integer.parseInt(textField2.getText());
				
				answer = myInteger1 + myInteger2;
				
				textField3.setText(Integer.toString(answer));
				
			}
		});
		button1.setBounds(51, 114, 89, 23);
		frame.getContentPane().add(button1);
		
		JLabel lblNewLabel = new JLabel("Number 1");
		lblNewLabel.setBounds(222, 63, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Number 2");
		lblNewLabel_1.setBounds(222, 142, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Answer");
		lblNewLabel_2.setBounds(222, 214, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField3 = new JTextField();
		textField3.setBounds(222, 239, 86, 20);
		frame.getContentPane().add(textField3);
		textField3.setColumns(10);
	}
}
