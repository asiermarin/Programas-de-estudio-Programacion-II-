package LD;
import java.sql.*;

public class Datos {
	
	

	/**Nombre de la base de datos*/	
	public String database="mydb";
	
	/** Host */
	public String hostname="localhost";
	
	/** Puerto */
	public String port="3306";

	/** Ruta de la base de datos (jdbc:mysql://localhost:3306/Concesionario?useTimezone=true&serverTimezone=GMT&useSSL=false) */
	public String url="jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useTimezone=true&serverTimezone=GMT&useSSL=false";

	/** Nombre de usuario */
	public String user="root";
	
	/** Password */
	public String password="";
	
	public Connection conectarBD() throws SQLException {
		
        Connection objConn = null;

        
        	
        	objConn = DriverManager.getConnection (url, user, password);
        
        

        return objConn;

	}	
	
	public void desconectarBD() throws SQLException {
		Connection conexion = null;
        	
        	conexion.close();
        	
	}
	public static void InsertarVehiculo(int idVehiculo, String tipo, String marca, String color, double precio,
			String equipacion, String Modelo, String matricula, String garantia, java.sql.Date miFecha,
			int Departamento_idDepartamento) throws SQLException {

		// Instancias la clase que hemos creado anteriormente
		Datos objDatos = new Datos();

		// Llamas al método que tiene la clase y te devuelve una conexión
		Connection objConn = objDatos.conectarBD();

		if (objConn != null) {
			// Preparamos la insert
			String query = "insert into Vehiculo (idVehiculo, Tipo, Marca, Modelo, Color, Precio, Equipamiento, Matricula, Garantia, Fecha, Departamento_idDepartamento) values (?, ?, ?, ?,?,?,?,?,?,?, ?)";

			// Creamos las preparedstaments
			PreparedStatement objSt = objConn.prepareStatement(query);
			objSt.setInt(1, idVehiculo);
			objSt.setString(2, tipo);
			objSt.setString(3, marca);
			objSt.setString(4, Modelo);
			objSt.setString(5, color);
			objSt.setDouble(6, precio);
			objSt.setString(7, equipacion);
			objSt.setString(8, matricula);
			objSt.setString(9, garantia);
			objSt.setDate(10, (java.sql.Date) miFecha);
			objSt.setInt(11, Departamento_idDepartamento);

			// Ejecutamos la query que hemos preparado
			objSt.execute();

			// Cerramos el preparedStatement
			objSt.close();

			// Cerramos la conexión
			objConn.close();

		}

	}
	
public static void InsertarDepartamento(int idDepartamento, String tipo, String njefe, int numEmpleados) throws SQLException {
		
		
		// Instancias la clase que hemos creado anteriormente
		Datos objDatos=new Datos();
	    
		// Llamas al método que tiene la clase y te devuelve una conexión
	    Connection objConn = objDatos.conectarBD();
	     
		    if ( objConn != null ) {
		    	// Preparamos la insert 
		    	String query = "insert into Departamento (idDepartamento, Tipo, Encargado, NumEmpleados) values (?, ?, ?, ?)";
		    	
		    	//Creamos las preparedstaments
		    	PreparedStatement objSt = objConn.prepareStatement(query);
		    	objSt.setInt(1, idDepartamento);
		    	objSt.setString(2, tipo);
		    	objSt.setString(3, njefe);
		    	objSt.setInt(4, numEmpleados);
		    	
		    	
		    	//Ejecutamos la query que hemos preparado
		  		objSt.execute();
		    			    	
		    	//Cerramos el preparedStatement
		    	objSt.close();
		    	
		    	//Cerramos la conexión
		    	objConn.close();
		    	
		    } 
	    
	}

public  ResultSet ConsultarDepartamentos() throws SQLException {


	// Instancias la clase que hemos creado anteriormente
		Datos objDatos=new Datos();

	// Llamas al método que tiene la clase y te devuelve una conexión
	Connection objConn = objDatos.conectarBD();
	ResultSet rs = null;

	    if ( objConn != null ) {
	    	// Preparamos la consulta 
	    	Statement st = objConn.createStatement(); 
	    	 rs = st.executeQuery ("select * from Departamento");
	    
	    	
	    }
	return rs;

	}

public ResultSet ConsultarVehiculos() throws SQLException {

	ResultSet rs = null;
	// Instancias la clase que hemos creado anteriormente
	Datos objDatos = new Datos();

	// Llamas al método que tiene la clase y te devuelve una conexión
	Connection objConn = objDatos.conectarBD();

	if (objConn != null) {
		// Preparamos la consulta
		Statement st = objConn.createStatement();
		rs = st.executeQuery("select * from Vehiculo");

	}
	return rs;
}


public void eliminarDepartamento(int idDepartamento) throws SQLException {

	// Instancias la clase que hemos creado anteriormente
	Datos objDatos = new Datos();

	// Llamas al método que tiene la clase y te devuelve una conexión
	Connection objConn = objDatos.conectarBD();

	if (objConn != null) {
		// Preparamos el delete
		String query = "delete from Departamento where idDepartamento = ?";

		// Creamos las preparedstaments
		PreparedStatement objSt = objConn.prepareStatement(query);
		objSt.setInt(1, idDepartamento);

		// Ejecutamos la query que hemos preparado
		objSt.execute();

		// Cerramos el preparedStatement
		objSt.close();

		// Cerramos la conexión
		objConn.close();

	}
}

	

}
