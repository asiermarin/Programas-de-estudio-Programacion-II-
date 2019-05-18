package swing;

import java.awt.BorderLayout;
import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;



public class frmLista extends JFrame implements ListSelectionListener
{
	//Objeto visual
	private JList <clsPersona> jlista;
	//Modelo de la vista
	protected ModeloLista modelo;
	
	//Lista auxiliar de personas
	private LinkedList <clsPersona> personas;
	
	
	/**
	 * Create the application.
	 */
	public frmLista()
	{
		setTitle("JList");
		
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		personas = new LinkedList <clsPersona> ();
		
		modelo = new ModeloLista (personas);
		jlista = new JList <clsPersona> (modelo);
		//jlista.setCellRenderer(new ListRenderer());
		jlista.addListSelectionListener(this);
		JScrollPane scroll = new JScrollPane(jlista);
		
		this.getContentPane().add(scroll,BorderLayout.CENTER);
		
		setVisible(true);
	}
	

	
	public void setItem(clsPersona persona)
	{
		modelo.addElement(persona);
		
	
		//jlista.setModel(modelo);
		
	
	}

	@Override
	public void valueChanged(ListSelectionEvent arg0) 
	{
	
		//Se controla si se están realizando cambios todavía en la lista.
		//Si no se controla esto, los eventos se lanzan varias veces.
		if (arg0.getValueIsAdjusting()==false)
		{
			String dni = ((clsPersona) jlista.getSelectedValue()).getDni();
			System.out.println("El DNI de esta persona es " + dni);
		}
		
	}

}
