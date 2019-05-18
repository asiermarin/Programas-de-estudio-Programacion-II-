package swing;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class frmCombo extends JFrame implements ActionListener
{
	private JComboBox <clsPersona> comboBox;

	/**
	 * Create the application.
	 */
	public frmCombo()
	{
		this.setTitle("JComboBox");
		this.setBounds(100, 100, 450, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		
		comboBox = new JComboBox <clsPersona> ();
		comboBox.setSize(225, 25);
		comboBox.setMaximumSize(new Dimension(225, 25));
		comboBox.setLocation(100, 100);
		comboBox.addActionListener(this);
		this.getContentPane().add(comboBox);
		
	}
	
	public void setItem(clsPersona persona)
	{
		this.comboBox.addItem(persona);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		//Cogemos el objeto seleccionado en el JComboBox, lo casteamos a la clase correspondiente y obtenemos el DNI
		String dni = ((clsPersona) comboBox.getSelectedItem()).getDni();
		System.out.println("El DNI de esta persona es " + dni);
		
	}
}
