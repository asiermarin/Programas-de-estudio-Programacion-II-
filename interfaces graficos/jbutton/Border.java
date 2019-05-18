import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class Border extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Border frame = new Border();
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
	public Border() {
		
		/*
		 * 
		 * Sitúa los elementos en una de estas 5 orientaciones:
Norte, Sur, Este, Oeste y Centro
• Es el layout por defecto de los Frames
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		
		BorderLayout gl = new BorderLayout();
		 gl.setHgap(5); gl.setVgap(5);
		 contentPane.setLayout(gl);
		
		//contentPane.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("Norte");
		contentPane.add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("Oeste");
		contentPane.add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("Sur");
		contentPane.add(btnNewButton_2, BorderLayout.SOUTH);
		
		JButton btnNewButton_3 = new JButton("Centro");
		contentPane.add(btnNewButton_3, BorderLayout.CENTER);
		
		JButton btnNewButton_4 = new JButton("Este");
		contentPane.add(btnNewButton_4, BorderLayout.EAST);
		
		
		
		
		
		
		
		
	}

}
