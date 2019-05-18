import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
 


public class clsMAIN {

	public static void main(String[] args) 
	{
		
		// Primero, creamos el frame. Le ponemos un titulo y un tamaño
		JFrame f = new JFrame ();
	    f.setSize(450,450);
	    f.setBackground(Color.red);
	    f.setTitle("Curriculum Vitae");
	    f.setLocationRelativeTo(null); 
	    //Esta línea nos permite que el boton "X" cerrar funcione.
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Le ponemos un contentPane para poner todas las cosas
		f.setContentPane(new JPanel(new BorderLayout()));
		
		//Creación de todos los paneles, para colocarlo todo en su sitio.
		JPanel PanelNorte= new JPanel(new FlowLayout());
		JPanel PanelCentral= new JPanel(new GridLayout(1,2));
		JPanel PanelSur= new JPanel(new FlowLayout());
		JPanel PanelIzq= new JPanel(new FlowLayout());
		JPanel PanelDer= new JPanel(new GridLayout(2,1));
		JPanel PanelArriba= new JPanel(new FlowLayout());
		JPanel PanelAbajo= new JPanel(new FlowLayout());
		
		//Los 3 paneles mas grandes
		f.getContentPane().add(PanelNorte,BorderLayout.NORTH);
		f.getContentPane().add(PanelCentral,BorderLayout.CENTER);
		f.getContentPane().add(PanelSur,BorderLayout.SOUTH);
	
		//2 Paneles para el panel central
		PanelCentral.add(PanelIzq);
		PanelCentral.add(PanelDer);
		
		//2 Paneles para el panel derecho
		PanelDer.add(PanelArriba);
		PanelDer.add(PanelAbajo);

		
		JLabel Norte = new JLabel ("POR FAVOR, RELLENA LOS DATOS DE TU CURRICULUM");
		PanelNorte.add(Norte);
		
		
		JLabel i1 = new JLabel("Nombre");
		JLabel i2 = new JLabel("Dirección");
		JLabel i3 = new JLabel("Teléfono");
		JLabel i4 = new JLabel("Otros datos de interés");
		
		JTextField t1 = new JTextField(15);
		JTextField t2 = new JTextField(15);
		JTextField t3 = new JTextField(15);
		JTextArea t4 = new JTextArea(10,15);
		
		PanelIzq.add(i1);
		PanelIzq.add(t1);
		PanelIzq.add(i2);
		PanelIzq.add(t2);
		PanelIzq.add(i3);
		PanelIzq.add(t3);
		PanelIzq.add(i4);
		PanelIzq.add(t4);
		
		JLabel q1 = new JLabel ("Selecciona tus estudios ");
		PanelArriba.add(q1);
		
		String[] data = new String [6];
		data[0]="Ingeneniería Informática";
		data[1]="Filología Vasca";
		data[2]="Medicina";
		data[3]="Ingeniería Naval";
		data[4]="Filología Inglesa";
		data[5]="Pedagogía";
		
		JList lista = new JList(data);
		lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		lista.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		lista.setVisibleRowCount(-1);
		
		PanelArriba.add(lista);
		
		JCheckBox caja1 = new JCheckBox("Disponibilidad para viajar");
		JCheckBox caja2 = new JCheckBox("Posee coche propio");
		JCheckBox caja3 = new JCheckBox("Exento Servivio militar");
		JRadioButton caja4 = new JRadioButton("Hombre");
		caja4.setMnemonic(KeyEvent.VK_B);
		caja4.setActionCommand("Hombre");
		caja4.setSelected(true);

		
		JRadioButton caja5 = new JRadioButton("Mujer");
		caja5.setMnemonic(KeyEvent.VK_C);
		caja5.setActionCommand("Mujer");
		ButtonGroup a = new ButtonGroup();
		a.add(caja4);
		a.add(caja5);
		
		PanelAbajo.add(caja5);
		PanelAbajo.add(caja4);
		PanelAbajo.add(caja1);
		PanelAbajo.add(caja2);
		PanelAbajo.add(caja3);
		
		JButton b1 = new JButton("Insertar datos");
		JButton b2 = new JButton("Salir");
		
		PanelSur.add(b1);
		PanelSur.add(b2);
		
		//Lo ponemos todo visible
		f.setVisible(true);

	}

}
