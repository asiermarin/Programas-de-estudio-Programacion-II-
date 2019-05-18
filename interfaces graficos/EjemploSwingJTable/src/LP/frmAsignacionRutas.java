package LP;

import static COMUN.clsConstantes.CMD_BTN_ANADIR;
import static COMUN.clsConstantes.CMD_BTN_ASIGNACIONES;
import static COMUN.clsConstantes.CMD_BTN_ELIMINAR_CAMION;
import static COMUN.clsConstantes.CMD_BTN_GUARDAR;
import static COMUN.clsConstantes.CMD_BTN_HILO;
import static COMUN.clsConstantes.COL_CAMIONES_MATRICULA;
import static COMUN.clsConstantes.MENU_LANZAR_PIZARRA;
import static COMUN.clsConstantes.ROW_NO_SELECTED;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import COMUN.clsCamion;
import LN.clsGestor;



public class frmAsignacionRutas extends JFrame implements ActionListener
{
	
	
	/**
	 * @author futpilari
	 * 
	 * Variables de clase para la gestión de la información.
	 */
	
	Map<String,clsCamion> camiones;	
	
	
	/**
	 * @author futpilari
	 * Elementos visuales de la interfaz de usuario
	 */
	
	
	JTable 				jtCamiones;		//Tabla con los datos de los camiones
	JScrollPane 		jspCamiones;

	
	JButton				jbEliminarCamion;
	JPanel 				jpBotones;
	JLabel 				jlAnadidos;
	
	JLabel 				jlCamiones;
	JLabel 				jlRutas;
	JPanel 				jpCamiones;
	JPanel 				jpRutas;
	
	
	
	
	
	/**
	 * @serialField Default Version UID
	 */
	private static final long serialVersionUID = 1L;
	
	public frmAsignacionRutas()
	{
		
		super("ASIGNACIONES");
		CargarDatos();
		CreateShowGUI();
		
	}
	
	private void CargarDatos()
	{
		
		clsGestor objGestor = new clsGestor();
		camiones=objGestor.ConsultaCamiones();
		
		
		
	}
	
	private void crearTablaCamiones()
	{
		
		
		jtCamiones=null;
		
		

		TablaCamionesModel tcm=new TablaCamionesModel(camiones);
	
		jtCamiones = new JTable(tcm);
		jtCamiones.setPreferredScrollableViewportSize(new Dimension(500, 70));
		jtCamiones.setFillsViewportHeight(true);
		jtCamiones.setEnabled(true);
		jtCamiones.setRowSelectionAllowed(true);
		tcm.fireTableDataChanged();
				
	}
	

	
	
	
	
		
		
	

	private void EliminarCamion()
	{
		String mat;
		int rowCamiones;
		rowCamiones=jtCamiones.getSelectedRow();
		if((rowCamiones!=ROW_NO_SELECTED) )
		{
			mat=(String)jtCamiones.getValueAt(rowCamiones, COL_CAMIONES_MATRICULA);
			clsGestor objGestor=new clsGestor();
			objGestor.EliminarCamion(mat);
			camiones=objGestor.ConsultaCamiones();
			TablaCamionesModel tcm=(TablaCamionesModel)jtCamiones.getModel();
			tcm.setData(camiones);
			tcm.fireTableDataChanged();
		}
	}
	
	
	
	
	
	
	
 	private void CreateShowGUI()
	{
		
		
		//creación de la parte correspondiente a las tablas de información.		
		crearTablaCamiones();
		
		jspCamiones=new JScrollPane(jtCamiones);
	
		
		jlCamiones=new JLabel("Camiones disponibles");
		
		jpCamiones=new JPanel(new BorderLayout());
		
		jpCamiones.add(jlCamiones,BorderLayout.NORTH);
		jpCamiones.add(jspCamiones,BorderLayout.CENTER);
		
		this.getContentPane().add(jpCamiones,BorderLayout.CENTER);
	
			
		
		//creación de los botones de la parte inferior de la pantalla.		
		jpBotones =new JPanel(new FlowLayout());
		
		
		jbEliminarCamion=new JButton("Eliminar Camion");
		jbEliminarCamion.setActionCommand(CMD_BTN_ELIMINAR_CAMION);
		jbEliminarCamion.addActionListener(this);


		
		jpBotones.add(jbEliminarCamion);
		
		this.getContentPane().add(jpBotones,BorderLayout.PAGE_END);
			
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1000,400);
		this.setVisible(true);
		
		
	}
 	

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		
		String command = arg0.getActionCommand();
		switch(command)
		{
	
				
			case CMD_BTN_ELIMINAR_CAMION:
				EliminarCamion();
				break;
			
		}
		
	}
	
	
	/**
	 *Clase interna para el manejo de la información del objeto JTable.
	 *https://docs.oracle.com/javase/7/docs/api/javax/swing/table/AbstractTableModel.html 
	 */
	
	class TablaCamionesModel extends AbstractTableModel
    {
        private String[] columnNames = {"Matrícula","Longitud","Altura","Tara","Número Ruedas"};
        Object[][] data;
        
        public TablaCamionesModel(Map<String,clsCamion> m)
        {
        	
        	super();
        	
    		int filas = m.size();
    		int cont;
    		data=new Object[filas][];
    		cont=0;
    		
    		
    		//Nos recorremos el map para cargar la variable data[][]
    		for (Map.Entry<String, clsCamion> entry : m.entrySet())
    		{
    		    //System.out.println(entry.getKey() + "/" + entry.getValue());
    			Object[]a={new String(entry.getKey()),
    					   new Integer(entry.getValue().getLongitud()),
    					   new Long(entry.getValue().getAltura()),
    					   new Long(entry.getValue().getTara()),
    					   new Integer(entry.getValue().getNumRuedas())};
    			data[cont]=a;
    			cont++;
    		}
    		
        	
        }
        
        public void setData(Map<String,clsCamion> m) 
        {
        	int filas = m.size();
    		int cont;
    		data=new Object[filas][];
    		cont=0;
    		
    		
    		
    		for (Map.Entry<String, clsCamion> entry : m.entrySet())
    		{
    		    //System.out.println(entry.getKey() + "/" + entry.getValue());
    			Object[]a={new String(entry.getKey()),
 					   new Integer(entry.getValue().getLongitud()),
 					   new Long(entry.getValue().getAltura()),
 					   new Long(entry.getValue().getTara()),
 					   new Integer(entry.getValue().getNumRuedas())};
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
