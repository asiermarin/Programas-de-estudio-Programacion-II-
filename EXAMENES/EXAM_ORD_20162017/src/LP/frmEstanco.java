package LP;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSeparator;



import static COMUN.clsConstantes.enForma;
import static COMUN.clsConstantes.enMateriales;
import static COMUN.clsConstantes.enTipo;



public class frmEstanco extends JFrame implements ActionListener
{

	private JPanel contentPane;
	private JTextField txtDenominacion;
	private JTextArea textArea;
	private JButton btnAtras;
	private JButton btnAdelante;
	private JTextField txtModelo;
	private JTextField txtRef;
	private JComboBox cmbForma;
	private JComboBox cmbMaterial;
	private JTextField txtMarca;
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JComboBox cmbTipo;
	private JButton btnGuardarPipa;
	private JButton btnGuardarTabaco; 
	private JButton btnRefresh;
	
	private final String ACTION_COMMAND_ATRAS = "ACTION_COMMAND_ATRAS";
	private final String ACTION_COMMAND_ADELANTE = "ACTION_COMMAND_ADELANTE";
	private final String ACTION_COMMAND_REFRESCAR = "ACTION_COMMAND_REFRESCAR";
	private final String ACTION_COMMAND_GUARDAR_TABACO = "ACTION_COMMAND_GUARDAR_TABACO";
	private final String ACTION_COMMAND_GUARDAR_PIPA = "ACTION_COMMAND_GUARDAR_PIPA";

	/**
	 * Create the frame.
	 */
	public frmEstanco() 
	{
		setTitle("ESTANCO");
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
		
		JLabel lblDenominacion = new JLabel("Denominacion");
		lblDenominacion.setBounds(10, 30, 227, 14);
		panelIzdo.add(lblDenominacion);
		
		txtDenominacion = new JTextField();
		txtDenominacion.setEditable(false);
		txtDenominacion.setBounds(10, 55, 350, 20);
		panelIzdo.add(txtDenominacion);
		txtDenominacion.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 156, 350, 281);
		panelIzdo.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		
		JLabel lblDescripcion = new JLabel("Descripci\u00F3n");
		lblDescripcion.setBounds(10, 129, 201, 14);
		panelIzdo.add(lblDescripcion);
		
		btnAtras = new JButton("<<");
		btnAtras.setActionCommand(ACTION_COMMAND_ATRAS);
		btnAtras.addActionListener(this);
		btnAtras.setBounds(10, 484, 89, 23);
		panelIzdo.add(btnAtras);
		
		btnAdelante = new JButton(">>");
		btnAdelante.setActionCommand(ACTION_COMMAND_ADELANTE);
		btnAdelante.addActionListener(this);
		btnAdelante.setBounds(271, 484, 89, 23);
		panelIzdo.add(btnAdelante);
		
		btnRefresh = new JButton("Refrescar");
		btnRefresh.setActionCommand(ACTION_COMMAND_REFRESCAR);
		btnRefresh.addActionListener(this);
		btnRefresh.setBounds(147, 484, 89, 23);
		panelIzdo.add(btnRefresh);
		
		JPanel panelDcho = new JPanel();
		splitPane.setRightComponent(panelDcho);
		panelDcho.setLayout(null);
		
		JLabel lblPipas = new JLabel("PIPAS");
		lblPipas.setBounds(10, 28, 46, 14);
		panelDcho.add(lblPipas);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 70, 46, 14);
		panelDcho.add(lblModelo);
		
		JLabel lblReferencia = new JLabel("Referencia");
		lblReferencia.setBounds(10, 163, 85, 14);
		panelDcho.add(lblReferencia);
		
		JLabel lblMaterial = new JLabel("Material");
		lblMaterial.setBounds(230, 70, 46, 14);
		panelDcho.add(lblMaterial);
		
		JLabel lblForma = new JLabel("Forma");
		lblForma.setBounds(230, 163, 46, 14);
		panelDcho.add(lblForma);
		
		txtModelo = new JTextField();
		txtModelo.setBounds(9, 95, 190, 20);
		panelDcho.add(txtModelo);
		txtModelo.setColumns(10);
		
		txtRef = new JTextField();
		txtRef.setBounds(10, 188, 189, 20);
		panelDcho.add(txtRef);
		txtRef.setColumns(10);
		
		cmbMaterial = new JComboBox();
		cmbMaterial.setBounds(230, 95, 143, 20);
		panelDcho.add(cmbMaterial);
		
		cmbForma = new JComboBox();
		cmbForma.setBounds(230, 188, 143, 20);
		panelDcho.add(cmbForma);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 278, 363, 2);
		panelDcho.add(separator);
		
		JLabel lblTabaco = new JLabel("TABACO");
		lblTabaco.setBounds(10, 305, 66, 14);
		panelDcho.add(lblTabaco);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(10, 348, 46, 14);
		panelDcho.add(lblMarca);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(10, 428, 46, 14);
		panelDcho.add(lblPrecio);
		
		JLabel lblCantidadgramos = new JLabel("Cantidad  (gramos)");
		lblCantidadgramos.setBounds(10, 508, 134, 14);
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
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(10, 533, 157, 20);
		panelDcho.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		cmbTipo = new JComboBox();
		cmbTipo.setBounds(214, 373, 159, 20);
		panelDcho.add(cmbTipo);
		
		btnGuardarPipa = new JButton("Guardar");
		btnGuardarPipa.setActionCommand(ACTION_COMMAND_GUARDAR_PIPA);
		btnGuardarPipa.addActionListener(this);
		btnGuardarPipa.setBounds(153, 244, 89, 23);
		panelDcho.add(btnGuardarPipa);
		
		btnGuardarTabaco = new JButton("Guardar");
		btnGuardarTabaco.setActionCommand(ACTION_COMMAND_GUARDAR_TABACO);
		btnGuardarTabaco.addActionListener(this);
		btnGuardarTabaco.setBounds(153, 579, 89, 23);
		panelDcho.add(btnGuardarTabaco);
		
		this.cargarComboFormas();
		this.cargarComboMateriales();
		this.cargarComboTipos();
		
		LanzarHilo();
		
		
	}
	
	private void cargarComboTipos()
	{
		for(enTipo s:enTipo.values())
		{
			cmbTipo.addItem(s.toString());
		}
		
		
	}
	private void cargarComboMateriales()
	{
		for(enMateriales s:enMateriales.values())
		{
			cmbMaterial.addItem(s.toString());
		}
		
	}
	
	private void cargarComboFormas()
	{
		for(enForma s:enForma.values())
		{
			cmbForma.addItem(s.toString());
		}
		
	}
	
	private String getTipoTabaco()
	{
		return (String) cmbTipo.getSelectedItem();
	}
	
	private String getMaterialPipa()
	{
		return (String) cmbMaterial.getSelectedItem();
	}
	
	private String getFormaPipa()
	{
		return (String) cmbForma.getSelectedItem();
	}
	
	private void LanzarHilo()
	{
		
		//Pon aquí el código de iniciación del hilo.
		
		
	}
	
	private void MostrarInformacionObjeto(String denominacion, String descripcion)
	{
		txtDenominacion.setText(denominacion);
		textArea.setText(descripcion);
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		switch(e.getActionCommand())
		{
		case ACTION_COMMAND_ATRAS:
			JOptionPane.showMessageDialog(this, "Pon aquí tu método para recorrer la lista de objetos hacia atrás");
			break;
		case ACTION_COMMAND_ADELANTE :
			JOptionPane.showMessageDialog(this, "Pon aquí tu método para recorrer la lista de objetos hacia adelante");
			break;
		case ACTION_COMMAND_REFRESCAR :
			JOptionPane.showMessageDialog(this, "Pon aquí tu método refrescar la lista de objetos");
			break;
		case ACTION_COMMAND_GUARDAR_TABACO:
			JOptionPane.showMessageDialog(this, "Pon aquí tu método para guardar el tabaco");
			break;
		case ACTION_COMMAND_GUARDAR_PIPA:
			JOptionPane.showMessageDialog(this, "Pon aquí tu método para guardar una pipa");
			break; 
		}
	}	
		
}
	
