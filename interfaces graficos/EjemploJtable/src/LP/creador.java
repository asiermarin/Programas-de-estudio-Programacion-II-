package LP;


/** Todos los imports necesarios para la creacion de la interfaz grafica */

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import Comun.itfProperties;
import LN.GestorLN;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;


/** Estos son los imports de las constantes del paquete Comun. */

import static Comun.Constantes.PROPERTY_IDDEPARTAMENTO;
import static Comun.Constantes.PROPERTY_TIPO_DEPARTAMENTO;
import static Comun.Constantes.PROPERTY_DEPARTAMENTO_NUMEMPLEADOS;
import static Comun.Constantes.PROPERTY_DEPARTAMENTO_JEFE;
import static Comun.Constantes.CMD_BTN_RECUPERAR;
import static Comun.Constantes.CMD_BTN_REGISTRAR;



/** Clase llamada creador que extiende de JFrame e implementa de ActionListener  */


public class creador extends JFrame implements ActionListener {
	
	
	
	
	
	
	/**  Todos los atributos de la clase Creador 
	 * los TextFlieds, ArrayList, Jtable, JScrollPane, JPanel.   */
	
	
	private ArrayList< itfProperties> Departamentos;
	
	JTable 				jtDepartamentos;
	JScrollPane 		jspDepartamentos;
	JPanel 				jpDepartamentos;
	private JTextField txtTipo;
	private JTextField txtidDepartamento;
	private JTextField txtNumEmpleados;
	private JTextField txtJefe;
	static GestorLN gestorLN = new GestorLN();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					creador frame = new creador();
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
	public creador() {
		
		

		try {
			gestorLN.DameDatosDepartamento();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
		/** Se llama a la clase CargarDatos que carga los datos recuperados de la Base de de Datos  */
		
		CargarDatos();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 475);
		getContentPane().setLayout(null);
		
		
		/** Aqui se crean los cuatro JLabels : idDepartamentos, Tipo, Jefe y Numero Empleados
		 * los JTextFields con los nombres de variables txtidDepartamento, txtTipo, txtJefe, y txtNumEmpleados.
		 * Tambien se crean los dos botones Registrar y Recuperar, los cuales se añaden al ActionListener con una variable FINAL */
		
			
			JPanel panel = new JPanel();
			panel.setBounds(140, 43, 170, 114);
			getContentPane().add(panel);
			
			txtidDepartamento = new JTextField();
			panel.add(txtidDepartamento);
			txtidDepartamento.setColumns(15);
			
			txtTipo = new JTextField();
			panel.add(txtTipo);
			txtTipo.setColumns(15);
			
			txtJefe = new JTextField();
			panel.add(txtJefe);
			txtJefe.setColumns(15);
			
			txtNumEmpleados = new JTextField();
			panel.add(txtNumEmpleados);
			txtNumEmpleados.setColumns(15);
			
			JLabel lblIddepartameto = new JLabel("idDepartamento");
			lblIddepartameto.setBounds(21, 43, 109, 22);
			getContentPane().add(lblIddepartameto);
			
			JLabel lblTipo = new JLabel("Tipo");
			lblTipo.setBounds(20, 65, 76, 32);
			getContentPane().add(lblTipo);
			
			JLabel lblJefe = new JLabel("Jefe");
			lblJefe.setBounds(23, 97, 73, 22);
			getContentPane().add(lblJefe);
			
			JLabel lblNumeroEmpleados = new JLabel("Numero Empleados");
			lblNumeroEmpleados.setBounds(20, 130, 130, 14);
			getContentPane().add(lblNumeroEmpleados);
			
			JButton btnRegistrar = new JButton("Registrar");
			btnRegistrar.setBounds(343, 43, 100, 32);
			getContentPane().add(btnRegistrar);
			btnRegistrar.setActionCommand(CMD_BTN_REGISTRAR);
			btnRegistrar.addActionListener(this);

			
			JButton btnRecuperar = new JButton("Recuperar");
			btnRecuperar.setBounds(343, 97, 101, 32);
			getContentPane().add(btnRecuperar);
			btnRecuperar.setActionCommand(CMD_BTN_RECUPERAR);
			btnRecuperar.addActionListener(this);


	}
	

		public void CrearTabla() {
			
jtDepartamentos=null;
			
			CargarDatos();

			TablaDepartamentosModel tcm=new TablaDepartamentosModel(Departamentos);
			
			
				jtDepartamentos = new JTable(tcm);
				jtDepartamentos.setPreferredScrollableViewportSize(new Dimension(500, 70));
				jtDepartamentos.setFillsViewportHeight(true);
				jtDepartamentos.setEnabled(true);
				jtDepartamentos.setRowSelectionAllowed(true);
				tcm.fireTableDataChanged();
				
				jspDepartamentos=new JScrollPane(jtDepartamentos);
				jspDepartamentos.setBounds(10, 236, 457, 164);
			getContentPane().add(jspDepartamentos);
			tcm.setData(Departamentos);
		}
	
	
		public void CargarDatos() {
			
			
			
			
			Departamentos= gestorLN.DameDepartamentos();
		}
		
		
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String command= e.getActionCommand();
			
			switch (command) {
			case CMD_BTN_REGISTRAR: try {
					gestorLN.creadorDepartamento(txtidDepartamento.getText(), txtTipo.getText(), txtJefe.getText(), txtNumEmpleados.getText());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			txtidDepartamento.setText("");
			txtTipo.setText("");
			txtJefe.setText("");
			txtNumEmpleados.setText("");
			
				break;
			case CMD_BTN_RECUPERAR: 
			CrearTabla();

			
				break;
			default:
				break;
			}
		}
		
		
		
		
		
		
		
		
		class TablaDepartamentosModel extends AbstractTableModel
	    {
	        private String[] columnNames = {"idDepartamento","Tipo","Jefe","Numero de Empleados"};
	        Object[][] data;
	        
	        public TablaDepartamentosModel(ArrayList<itfProperties>Departamentos)
	        {
	        	
	        	super();
	        	
	    		int filas = Departamentos.size();
	    		int cont;
	    		data=new Object[filas][];
	    		cont=0;
	    		
	    		
	    		//Nos recorremos el map para cargar la variable data[][]
	    		for (itfProperties b: Departamentos)
	    		{
	    			Object[]a={b.getIntegerProperty(PROPERTY_IDDEPARTAMENTO),
	    					   b.getStringProperty(PROPERTY_TIPO_DEPARTAMENTO),
	    					   b.getStringProperty(PROPERTY_DEPARTAMENTO_JEFE),
	    					   b.getIntegerProperty(PROPERTY_DEPARTAMENTO_NUMEMPLEADOS),};
	    			data[cont]=a;
	    			cont++;
	    		}
	    		
	        	
	        }
	        
	        public void setData(ArrayList<itfProperties> Departamentos) 
	        {
	        	int filas = Departamentos.size();
	    		int cont;
	    		data=new Object[filas][];
	    		cont=0;
	    		
	    		
	    		for (itfProperties b: Departamentos)
	    		{
	    			Object[]a={b.getIntegerProperty(PROPERTY_IDDEPARTAMENTO),
	    					   b.getStringProperty(PROPERTY_TIPO_DEPARTAMENTO),
	    					   b.getStringProperty(PROPERTY_DEPARTAMENTO_JEFE),
	    					   b.getIntegerProperty(PROPERTY_DEPARTAMENTO_NUMEMPLEADOS),};
	    			data[cont]=a;
	    			cont++;
	    		}
	        }
	        
	        
	        
	        
	        
	        public int getColumnCount() 
	        {
	            return columnNames.length;
	        }

	        public int getRowCount() {
	            return data.length;
	        }

	        public String getColumnName(int col) {
	            return columnNames[col];
	        }

	        public Object getValueAt(int row, int col) {
	            return data[row][col];
	        }

	        /*
	         * JTable uses this method to determine the default renderer/
	         * editor for each cell.  If we didn't implement this method,
	         * then the last column would contain text ("true"/"false"),
	         * rather than a check box.
	         */
	        public Class getColumnClass(int c) {
	            return getValueAt(0, c).getClass();
	        }

	        /*
	         * Don't need to implement this method unless your table's
	         * editable.
	         */
	        public boolean isCellEditable(int row, int col) {
	           
	                return false;
	           
	        }

	        /*
	         * Don't need to implement this method unless your table's
	         * data can change.
	         */
	        public void setValueAt(Object value, int row, int col) 
	        {
	            
	            data[row][col] = value;
	            fireTableCellUpdated(row, col);

	        }

		

}	
}



