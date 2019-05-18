package LP;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;

	/**
	 * Launch the application.
	 */
	
	
	JTextArea textArea = new JTextArea();
	
	public void IngresarNombre() {
		
		textArea.setText("Su nombre es: " + txtNombre.getText());
	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
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
	public Ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOneTouchExpandable(true);
		splitPane.setResizeWeight(0.5);
		contentPane.add(splitPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		splitPane.setLeftComponent(panel);
		panel.setLayout(null);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				IngresarNombre();
			}
		});
		btnMostrar.setBounds(10, 103, 89, 23);
		panel.add(btnMostrar);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(99, 43, 86, 20);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblSuNombre = new JLabel("Su Nombre");
		lblSuNombre.setBounds(10, 43, 79, 23);
		panel.add(lblSuNombre);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/**
				 * Se podria poner en este sitio la funcion para guardar en MySql
				 */
				
				
			}
		});
		btnGuardar.setBounds(108, 103, 89, 23);
		panel.add(btnGuardar);
		
		
		splitPane.setRightComponent(textArea);
	}
}
