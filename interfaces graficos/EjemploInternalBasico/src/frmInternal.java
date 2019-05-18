import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicToggleButtonUI;


public class frmInternal extends JInternalFrame implements ActionListener 
{

	/**
	 * Create the frame.
	 */
	
	JTextField txtalgo;
	JLabel lblalgo;
	JButton btnalgo;
	JPanel jpContent;
	
	private final String BTN_ACTION_COMMAND_ALGO="BTN_ACTION_COMMAND_ALGO";
	
	public frmInternal() 
	{
		setBounds(100, 100, 450, 300);
		txtalgo = new JTextField("Hola, esto es un internal");
		btnalgo=new JButton("Pulsa aquí");
		btnalgo.setActionCommand(BTN_ACTION_COMMAND_ALGO);
		btnalgo.addActionListener(this);
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

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		switch(arg0.getActionCommand())
		{
			case BTN_ACTION_COMMAND_ALGO:
				JOptionPane.showMessageDialog(this, "HOla algo !!!!");
				break;
		}
		
	}

}
