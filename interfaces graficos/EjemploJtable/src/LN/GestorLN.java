package LN;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import static Comun.Constantes.PROPERTY_IDDEPARTAMENTO;
import static Comun.Constantes.PROPERTY_TIPO_DEPARTAMENTO;



import Comun.itfProperties;
import LD.Datos;

public class GestorLN {

	
	Datos objDatos=new Datos();
	
	
	
	private static ArrayList<itfProperties> Vehiculos;

	private static ArrayList<itfProperties>Departamentos;
	
	public GestorLN() {
		super();
		
		Departamentos=new ArrayList<itfProperties>();
		Vehiculos = new ArrayList<itfProperties>();

		
	}
	
	public Vehiculo creadorVehiculo(String idVehiculo, String tipo, String marca, String color, String Precio,
			String equipacion, String Modelo, String matricula, String garantia, java.util.Date miFecha,
			String idDepartamento) throws SQLException {
		
		int idVehiculo1= Integer.parseInt(idVehiculo);
		double Precio1 = Double.parseDouble(Precio);
		int idDepartamento1 = Integer.parseInt(idDepartamento);
		Vehiculo vehiculo = new Vehiculo();

		
		vehiculo.setIdVehiculo(idVehiculo1);
		vehiculo.setTipo(tipo);
		vehiculo.setMarca(marca);
		vehiculo.setColor(color);
		vehiculo.setPrecio(Precio1);
		vehiculo.setEquipacion(equipacion);
		vehiculo.setModelo(Modelo);
		vehiculo.setMatricula(matricula);
		vehiculo.setGarantia(garantia);
		vehiculo.setFechaDeFabricacion(miFecha);
		vehiculo.setDepartamento_idDepartamento(idDepartamento1);

		java.sql.Date Fecha = new java.sql.Date(miFecha.getTime());

		/**
		 * Este pequeño bucle se recorre el ArrayList de Vehiculos comparando la ID del
		 * objeto que se quiere introducir con los IDs de los Vehiculos que ya estan en
		 * la BBDD, si ya esta esa ID que se a introducido se lanza una excepcion y se
		 * vuelve a pedir todos los datos del objeto. Si la ID no esta registrada el
		 * Vehiculo se inserta en la BBDD y se añade al ArrayList
		 */

	
		
		
		if (!ExisteVehiculo(vehiculo)) {
			Datos.InsertarVehiculo(idVehiculo1, tipo, marca, color, Precio1, equipacion, Modelo, matricula, garantia,
					Fecha, idDepartamento1);
			Vehiculos.add(vehiculo);
			
		}else {
			System.out.println("REPETIDO");
		}


		return vehiculo;}
	
	
	
	
	public Departamento creadorDepartamento(String idDepartamento, String tipo, String njefe, String numEmpleados)throws SQLException {
		Departamento departamento= new Departamento();
		
		int idDepartamento1= Integer.parseInt(idDepartamento);
		int numEmpleados1= Integer.parseInt(numEmpleados);
		
		departamento.setidDepartamento(idDepartamento1);
		departamento.setTipoD(tipo);
		departamento.setJefe(njefe);
		departamento.setNumEmpleados(numEmpleados1);
		
		int b = 0;
		for (itfProperties a: Departamentos) {

			if (a.equals(idDepartamento)) {
				b=1;
			}else {
				
			}
		}
		
		if (b == 0 ) {
			objDatos.InsertarDepartamento(idDepartamento1,tipo,njefe,numEmpleados1);
			Departamentos.add(departamento);	
		}
		
		
		
		return departamento;
	}
	
	
	public void DameDatosVehiculo() throws SQLException {

		Connection objConn = objDatos.conectarBD();
		ResultSet vehiculosRecuperadoSet = objDatos.ConsultarVehiculos();

		while (vehiculosRecuperadoSet.next()) {

			int idVehiculo = vehiculosRecuperadoSet.getInt("idVehiculo");
			String Tipo = vehiculosRecuperadoSet.getString("Tipo");
			String Marca = vehiculosRecuperadoSet.getString("Marca");
			String Modelo = vehiculosRecuperadoSet.getString("Modelo");
			String Color = vehiculosRecuperadoSet.getString("color");
			Double Precio = vehiculosRecuperadoSet.getDouble("Precio");
			String Equipacion = vehiculosRecuperadoSet.getString("Equipamiento");
			String Matricula = vehiculosRecuperadoSet.getString("Matricula");
			String Garantia = vehiculosRecuperadoSet.getString("Garantia");
			Date fecha = vehiculosRecuperadoSet.getDate("fecha");
			int idDepartamento= vehiculosRecuperadoSet.getInt("Departamento_idDepartamento");

			Vehiculo vehiculo = new Vehiculo();

			vehiculo.setIdVehiculo(idVehiculo);
			vehiculo.setTipo(Tipo);
			vehiculo.setMarca(Marca);
			vehiculo.setModelo(Modelo);
			vehiculo.setColor(Color);
			vehiculo.setPrecio(Precio);
			vehiculo.setEquipacion(Equipacion);
			vehiculo.setMatricula(Matricula);
			vehiculo.setGarantia(Garantia);
			vehiculo.setFechaDeFabricacion(fecha);
			vehiculo.setDepartamento_idDepartamento(idDepartamento);

			Vehiculos.add(vehiculo);

		}

		objConn.close();

	}
	
	
	public void DameDatosDepartamento() throws SQLException {
		
		ResultSet Departamento=objDatos.ConsultarDepartamentos();
		Connection objConnection=objDatos.conectarBD();

		
		
			while(Departamento.next()) {
			int idD=Departamento.getInt("idDepartamento");
				String tipo=Departamento.getString("Tipo");
			String encargado=	Departamento.getString("Encargado");
			int numEmpleados=	Departamento.getInt("NumEmpleados");
				
				Departamento dep= new Departamento();
				dep.setidDepartamento(idD);
				dep.setTipoD(tipo);
				dep.setJefe(encargado);
				dep.setNumEmpleados(numEmpleados);
				
					Departamentos.add(dep);
				}
				
				

			
			
		objConnection.close();
	}
	
	public ArrayList<itfProperties> DameVehiculos() {

		return Vehiculos;
	}
	
	
public ArrayList<itfProperties> DameDepartamentos(){
	
	
		
		return Departamentos;
	}


public static boolean ExisteDepartamento(Departamento Dep)
{
	
	boolean retorno = false;
	
	for(itfProperties b:Departamentos)
	{
		if(b.equals(Dep)) return true;
		
	}
	
	return retorno;
	
}

public static boolean ExisteVehiculo(Vehiculo vehiculo) {

	boolean retorno = false;

	for (itfProperties b : Vehiculos) {
		if (b.equals(vehiculo))
			return true;

	}

	return retorno;

}


public void EliminarDepartamentos(int idDepartamento) throws SQLException {

	objDatos.eliminarDepartamento(idDepartamento);

}

public void EliminarDepartamentosArrayList(int idDepartamento) {

	Departamento departamento = new Departamento();

	departamento.setidDepartamento(idDepartamento);

	int b = 0;
	for (itfProperties a : Departamentos) {
		if (a.equals(departamento)) {
			b = Departamentos.indexOf(a);

		}
	}
	Departamentos.remove(b);
}


}


	
	
	

