package LP;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import COMUN.clsConstantes.enEficiencia;

import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSeparator;

import static COMUN.clsConstantes.enTipo;

import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;





/**
 * Ventana del programa
 * @author ALUMNO
 *
 */
public class frmElectrodomesticos extends JFrame implements ActionListener, ListSelectionListener
{

	private JPanel 			contentPane;
	private JTextArea 		textArea;
	private JTextField 		txtMarca;
	private JTextField 		txtPrecio;
	private JTextField		txtDescCorta;
	private JComboBox 		cmbTipo;
	private JComboBox 		cmbEficiencia;
	private JButton 		btnAnadir;
	private JButton 		btnRefresh;
	private JButton 		btnAnadirEficiente; 
	private JCheckBox 		chckbxOrdenar;
	private DefaultListModel listModel;
	private JList lstCodigos;
	private JButton btnGuardar;
	private JTextField textField;
	
	private final String ACTION_COMMAND_REFRESCAR 					= "ACTION_COMMAND_REFRESCAR";
	private final String ACTION_COMMAND_ANADIR_ELECTRODOMESTICO 	= "ACTION_COMMAND_ANADIR_ELECTRODOMESTICO";
	private final String ACTION_COMMAND_ANADIR_EFICIENTE 			= "ACTION_COMMAND_ANADIR_EFICIENTE";
	private final String ACTION_COMMAND_GUARDAR_FICHERO				= "ACTION_COMMAND_GUARDAR_FICHERO";
	
	
	

	/**
	 * Create the frame.
	 */
	public frmElectrodomesticos() 
	{
		
		setTitle("TIENDA ELECTRODOMÉSTICOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 818, 682);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setDividerLocation(0.50);
		splitPane.setResizeWeight(0.5);
		contentPane.add(splitPane, BorderLayout.CENTER);
		
		JPanel panelIzdo = new JPanel();
		splitPane.setLeftComponent(panelIzdo);
		panelIzdo.setLayout(null);
		
		JLabel lblElectrodomestico = new JLabel("Codigo Electrodomestico");
		lblElectrodomestico.setBounds(10, 11, 227, 14);
		panelIzdo.add(lblElectrodomestico);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 156, 350, 281);
		panelIzdo.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		
		JLabel lblDescripcion = new JLabel("Descripci\u00F3n");
		lblDescripcion.setBounds(10, 129, 201, 14);
		panelIzdo.add(lblDescripcion);
		
		btnRefresh = new JButton("Refrescar");
		btnRefresh.setActionCommand(ACTION_COMMAND_REFRESCAR);
		btnRefresh.addActionListener(this);
		btnRefresh.setBounds(75, 484, 102, 23);
		panelIzdo.add(btnRefresh);
		
		btnGuardar = new JButton("Guardar Fichero");
		btnGuardar.setBounds(206, 484, 154, 23);
		btnGuardar.setActionCommand(ACTION_COMMAND_GUARDAR_FICHERO);
		btnGuardar.addActionListener(this);
		
		panelIzdo.add(btnGuardar);
		
		 
	     
	     JScrollPane scrollPane_1 = new JScrollPane();
	     scrollPane_1.setBounds(20, 55, 293, 66);
	     panelIzdo.add(scrollPane_1);
	     
	     lstCodigos = new JList();
	     scrollPane_1.setViewportView(lstCodigos);
	     lstCodigos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	     lstCodigos.addListSelectionListener(this);
	     
	     chckbxOrdenar = new JCheckBox("Ordenar c\u00F3digos alfanum\u00E9ricamente");
	     chckbxOrdenar.setBounds(55, 25, 258, 23);
	     panelIzdo.add(chckbxOrdenar);
		
		JPanel panelDcho = new JPanel();
		splitPane.setRightComponent(panelDcho);
		panelDcho.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 278, 363, 2);
		panelDcho.add(separator);
		
		JLabel lblElectro = new JLabel("ELECTRODOMESTICO");
		lblElectro.setBounds(10, 305, 150, 14);
		panelDcho.add(lblElectro);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(10, 348, 46, 14);
		panelDcho.add(lblMarca);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(10, 428, 46, 14);
		panelDcho.add(lblPrecio);
		
		JLabel lblCantidadgramos = new JLabel("Descripción corta");
		lblCantidadgramos.setBounds(10, 508, 157, 14);
		panelDcho.add(lblCantidadgramos);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(214, 348, 46, 14);
		panelDcho.add(lblTipo);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(10, 373, 157, 20);
		panelDcho.add(txtMarca);
		txtMarca.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(9, 450, 158, 20);
		panelDcho.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtDescCorta = new JTextField();
		txtDescCorta.setBounds(10, 533, 157, 20);
		panelDcho.add(txtDescCorta);
		txtDescCorta.setColumns(10);
		
		cmbTipo = new JComboBox();
		cmbTipo.setBounds(214, 373, 159, 20);
		panelDcho.add(cmbTipo);
		
		btnAnadir = new JButton("A\u00F1adir Normal");
		btnAnadir.setActionCommand(ACTION_COMMAND_ANADIR_ELECTRODOMESTICO);
		btnAnadir.addActionListener(this);
		btnAnadir.setBounds(59, 580, 129, 23);
		panelDcho.add(btnAnadir);
		
		cmbEficiencia = new JComboBox();
		cmbEficiencia.setBounds(214, 450, 159, 20);
		panelDcho.add(cmbEficiencia);
		
		JLabel lblEficiencia = new JLabel("Eficiencia");
		lblEficiencia.setBounds(214, 428, 159, 14);
		panelDcho.add(lblEficiencia);
		
		JLabel lblCodigoElectrodomstico = new JLabel("Codigo Electrodom\u00E9stico");
		lblCodigoElectrodomstico.setBounds(214, 508, 159, 14);
		panelDcho.add(lblCodigoElectrodomstico);
		
		textField = new JTextField();
		textField.setBounds(214, 533, 96, 20);
		panelDcho.add(textField);
		textField.setColumns(10);
		
		btnAnadirEficiente = new JButton("A\u00F1adir Eficiente");
		btnAnadirEficiente.setBounds(221, 580, 129, 23);
		btnAnadirEficiente.setActionCommand(ACTION_COMMAND_ANADIR_EFICIENTE);
		btnAnadirEficiente.addActionListener(this);
		panelDcho.add(btnAnadirEficiente );
		
		
		ImageIcon icon = clsUtilidadesLP.createImageIcon("images\\electrodomesticos.JPG", "algo");
		JLabel lblImagen = new JLabel("",icon,JLabel.CENTER);
		lblImagen.setBounds(10, 11, 373, 256);
		panelDcho.add(lblImagen);
	
		this.cargarComboTipos();	
		this.cargarComboEficiencia();
		
		
		
	}
	
	private void cargarComboTipos()
	{
		for(enTipo s:enTipo.values())
		{
			cmbTipo.addItem(s.toString());
		}
		
		
	}
	
	private void cargarComboEficiencia()
	{
		for(enEficiencia s:enEficiencia.values())
		{
			cmbEficiencia.addItem(s.toString());
		}
		
		
	}
	
	
	/**
	 * Método que devuelve directamente el valor del tipo de electrodoméstico.
	 */
	private String getTipo()
	{
		return (String) cmbTipo.getSelectedItem();
	}
	
	/**
	 * Método que devuelve directamente el valor de la eficiencia enrgética del electrodoméstico.
	 * @return
	 */
	private String getEficiencia()
	{
		return (String) cmbEficiencia.getSelectedItem();
	}
	
	/**
	 * Método que devuelve true si el checkbox está marcado y false de lo contrario.
	 * @return
	 */
	private boolean getEstadoCheck()
	{
		return chckbxOrdenar.isSelected();
	}
	
	/**
	 * Método para cargar la lista de códigos de electrodomésticos en la pantalla
	 */
	private void CargarListaCodigos(String [] codigos)
	{
		//String[]s={"a","c","v","f","d","d","ss","a","c","v","f","d","d","ss"};
		
		listModel = new DefaultListModel();
		for(String a: codigos)
			listModel.addElement(a);
        
        
        lstCodigos.setModel(listModel);
		
	}
	
	
	
	
/**
 * Conjunto de comandos a realizar al pulsar cada botón.
 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		switch(e.getActionCommand())
		{
		
			
		case ACTION_COMMAND_REFRESCAR :
			JOptionPane.showMessageDialog(this, "Funcion de refrescar \n El checkbox seleccionado: " + this.getEstadoCheck());
			break;
	
		case ACTION_COMMAND_ANADIR_ELECTRODOMESTICO:
			JOptionPane.showMessageDialog(this, "Añadir electrodomestico");
			
			break;
			
		case ACTION_COMMAND_GUARDAR_FICHERO:
			JOptionPane.showMessageDialog(this, "Guardar en fichero");
			break; 
		
		case ACTION_COMMAND_ANADIR_EFICIENTE:
			JOptionPane.showMessageDialog(this, "Añadir electrodomestico eficiente");
			break;
			
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) 
	{
        if (e.getValueIsAdjusting() == false) 
        {
            if (lstCodigos.getSelectedIndex() == -1) 
            {
            //No se hace nada
 
            } 
            else 
            {
            //Se ha seleccionado un código y hay que cargar su información en la Descripción.
            	ElectrodomesticoSeleccionado((String)lstCodigos.getSelectedValue());
            }
        }
	}
	
	
	
	
	
	/**
	 * Método para cambiar el electrodoméstico mostrado en pantalla.
	 * @param cod
	 */
	private void ElectrodomesticoSeleccionado(String cod)
	{
		JOptionPane.showMessageDialog(this, "Codigo: " + cod);
	}
}

	
