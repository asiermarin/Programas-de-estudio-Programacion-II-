import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;

public class flow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					flow frame = new flow();
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
	public flow() {

		 /*
		  * 
		  *  Sitúa los elementos uno detrás de otro, de izquierda a
			derecha y de arriba a abajo.
• 			Es el layout por defecto de los paneles
		  */
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		FlowLayout gl = new FlowLayout();
		 gl.setHgap(2); gl.setVgap(2); gl.setAlignment (1);
		 contentPane.setLayout(gl);
		 /*
		 Align default	Entero largo	1
		Align left	Entero largo	2
		Center	Entero largo	3
		Align right	Entero largo	4
		 */
		
		//contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
			 		 
		
		 JButton btnNewButton = new JButton("FlowLayout");
		 
		 contentPane.add(btnNewButton);
		 
		 JButton btnNewButton_1 = new JButton("GridLayout");
		 contentPane.add(btnNewButton_1);
		 
		 JButton btnNewButton_2 = new JButton("BorderLayout");
		 contentPane.add(btnNewButton_2);
		 
		 JButton btnNewButton_3 = new JButton("GridBagLayout");
		 contentPane.add(btnNewButton_3);
		 
	}

}
