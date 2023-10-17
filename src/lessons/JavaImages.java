package lessons;

// IMPORT FOR IMAGES:
import javax.swing.ImageIcon;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JavaImages {

	// variables
	ImageIcon dog1 = new ImageIcon(getClass().getResource("/resources/pic1.jpg"));
	ImageIcon dog2 = new ImageIcon(getClass().getResource("/resources/pic2.jpg"));
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaImages window = new JavaImages();
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
	public JavaImages() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		// frame code
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// label code
		JLabel label1 = new JLabel("New label");
		label1.setBounds(113, 11, 188, 176);
		frame.getContentPane().add(label1);
		// display picture upon launch
		label1.setIcon(dog1);
		
		// button code
		JButton button1 = new JButton("Change Picture");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// change picture in JLabel when clicked
				label1.setIcon(dog2);
			}
		});
		button1.setBounds(129, 214, 157, 23);
		frame.getContentPane().add(button1);
	}
}
