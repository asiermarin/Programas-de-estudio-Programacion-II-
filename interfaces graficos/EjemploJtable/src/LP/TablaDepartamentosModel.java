package LP;

import static Comun.Constantes.PROPERTY_DEPARTAMENTO_JEFE;
import static Comun.Constantes.PROPERTY_DEPARTAMENTO_NUMEMPLEADOS;
import static Comun.Constantes.PROPERTY_IDDEPARTAMENTO;
import static Comun.Constantes.PROPERTY_TIPO_DEPARTAMENTO;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import Comun.itfProperties;




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



