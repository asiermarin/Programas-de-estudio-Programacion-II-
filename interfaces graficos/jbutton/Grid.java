import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;

public class Grid extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grid frame = new Grid();
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
	public Grid() {
		
		
		/*
		 * 
		 * Divide el contenedor en un determinado número de
celdas (de idéntico tamaño y dispuestas en forma de
filas y columnas) y sitúa cada elemento en una de esas
celdas
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		
		GridLayout gl = new GridLayout(4,3);
		 gl.setHgap(5); gl.setVgap(5);
		 contentPane.setLayout(gl);
		 
		 //contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		 for(int i = 1; i <= 9; i++) {
			 contentPane.add(new JButton(String.valueOf(i)));
			 }
			 contentPane.add(new JButton("*"));
			 contentPane.add(new JButton("0"));
			 contentPane.add(new JButton("#"));
			 contentPane.add(new JButton("#"));

	
		
		
	}

}
