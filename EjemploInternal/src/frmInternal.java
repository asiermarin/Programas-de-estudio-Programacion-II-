import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class frmInternal extends JInternalFrame 
{

	/**
	 * Create the frame.
	 */
	
	JTextField txtalgo;
	JLabel lblalgo;
	JButton btnalgo;
	JPanel jpContent;
	
	public frmInternal() 
	{
		setBounds(100, 100, 450, 300);
		txtalgo = new JTextField("Hola, esto es un internal");
		btnalgo=new JButton("Pulsa aquí");
		lblalgo=new JLabel("Etiqueta");
		jpContent=new JPanel();
		// Por defecto el JInternalFrame no es redimensionable ni
				// tiene el botón de cerrar, así que se lo ponemos.
		this.setResizable(true);
		this.setClosable(true);
		this.setIconifiable(true);
	
		
		jpContent.setLayout(new BorderLayout());
		jpContent.setBackground(Color.DARK_GRAY);
		jpContent.repaint();
		jpContent.add(txtalgo,BorderLayout.PAGE_START);
		jpContent.add(btnalgo,BorderLayout.PAGE_END);
		jpContent.add(lblalgo,BorderLayout.CENTER);
		
		
		this.setContentPane(jpContent);
		
				
	}

}
