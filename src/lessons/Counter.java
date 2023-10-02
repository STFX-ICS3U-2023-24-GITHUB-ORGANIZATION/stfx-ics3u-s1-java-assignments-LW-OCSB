package lessons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Counter {

	// variables
	private JFrame frame;
	int increment = 0;
	int decrement = 0;
	private JTextField textField1;
	private JTextField textField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Counter window = new Counter();
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
	public Counter() {
		initialize();
		
		textField1.setText(Integer.toString(increment));
		textField2.setText(Integer.toString(decrement));
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Counter");
		lblNewLabel.setBounds(182, 53, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton button1 = new JButton("Increment");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// code for increment button
				increment = increment + 1;
				textField1.setText(Integer.toString(increment));
			}
		});
		button1.setBounds(83, 118, 115, 21);
		frame.getContentPane().add(button1);
		
		textField1 = new JTextField();
		textField1.setBounds(236, 119, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JButton button2 = new JButton("Decrement");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// code for decrement button
				decrement--;
				textField2.setText(Integer.toString(decrement));
			}
		});
		button2.setBounds(83, 183, 115, 21);
		frame.getContentPane().add(button2);
		
		textField2 = new JTextField();
		textField2.setBounds(236, 184, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
	}
}
