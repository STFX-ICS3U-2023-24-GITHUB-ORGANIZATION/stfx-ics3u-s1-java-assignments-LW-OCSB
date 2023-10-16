package lessons;

// IMPORT FOR PICTURES
import javax.swing.ImageIcon;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JavaPictures {

	// variables
	private JFrame frame;
	ImageIcon myPicture1 = new ImageIcon(getClass().getResource("/resources/pic1.jpg"));
	ImageIcon myPicture2 = new ImageIcon(getClass().getResource("/resources/pic2.jpg"));
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaPictures window = new JavaPictures();
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
	public JavaPictures() {
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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(96, 24, 228, 115);
		frame.getContentPane().add(lblNewLabel);
		// load image on label when application launches
		lblNewLabel.setIcon(myPicture1);
		
		
		JButton btnNewButton = new JButton("Change Picture");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// change image on label when button is clicked
				lblNewLabel.setIcon(myPicture2);
			}
		});
		btnNewButton.setBounds(130, 183, 156, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
