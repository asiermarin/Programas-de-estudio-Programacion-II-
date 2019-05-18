package LN;

import java.util.Collections;
import java.util.Date;

import Comun.itfProperties;

/** Aqui se importan todas las constantes finales necesarias de la clase */
import static Comun.Constantes.PROPERTY_IDVEHICULO;

import static Comun.Constantes.PROPERTY_TIPO_DE_VEHICULO;
import static Comun.Constantes.PROPERTY_VEHICULO_MARCA;
import static Comun.Constantes.PROPERTY_VEHICULO_COLOR;
import static Comun.Constantes.PROPERTY_PRECIO;
import static Comun.Constantes.PROPERTY_EQUIPACION;
import static Comun.Constantes.PROPERTY_MATRICULA;
import static Comun.Constantes.PROPERTY_GARANTIA;
import static Comun.Constantes.PROPERTY_FECHA_DE_FABRICACION;
import static Comun.Constantes.PROPERTY_MODELO;
import static Comun.Constantes.PROPERTY_COCHE_DEPARTAMENTO_IDDEPARTAMENTO;

/**
 * La clase Vehiculo implementa Comparable para poder utilizar la funcion
 * compareTo para poder ordenar los Vehiculos segun su precio.
 */

public class Vehiculo implements itfProperties, Comparable {

	/**
	 * Todos los Atributos de la clase, son privates para que solo se puedan
	 * modificar mediante los get y set.
	 */
	private int idVehiculo;
	private String Tipo;
	private String Marca;
	private String Color;
	private String Modelo;
	private double Precio;
	private String Equipacion;
	private String Matricula;
	private String Garantia;
	private Date FechaDeFabricacion;
	private int Departamento_idDepartamento;

	public Vehiculo() {
		super();
		idVehiculo = idVehiculo;
		Tipo = Tipo;
		Marca = Marca;
		Color = Color;
		Modelo = Modelo;
		Precio = Precio;
		Equipacion = Equipacion;
		Matricula = Matricula;
		Garantia = Garantia;
		FechaDeFabricacion = FechaDeFabricacion;
		Departamento_idDepartamento = Departamento_idDepartamento;

	}

	/**
	 * Se aplican los metodos de la interfaz itfProperties junto a las variables
	 * finales de la clase.
	 */

	public Integer getIntegerProperty(String propiedad) {
		// TODO Auto-generated method stub
		switch (propiedad) {
		case PROPERTY_IDVEHICULO:
			return this.getIdVehiculo();
		case PROPERTY_COCHE_DEPARTAMENTO_IDDEPARTAMENTO:
			return this.getDepartamento_idDepartamento();
		}

		return null;
	}

	/**
	 * Se aplican los metodos de la interfaz itfProperties junto a las variables
	 * finales de la clase.
	 */

	@Override
	public String getStringProperty(String propiedad) {
		// TODO Auto-generated method stub

		switch (propiedad) {
		case PROPERTY_TIPO_DE_VEHICULO:
			return this.getTipo();
		case PROPERTY_VEHICULO_MARCA:
			return this.getMarca();
		case PROPERTY_VEHICULO_COLOR:
			return this.getColor();
		case PROPERTY_EQUIPACION:
			return this.getEquipacion();
		case PROPERTY_MATRICULA:
			return this.getMatricula();
		case PROPERTY_GARANTIA:
			return this.getGarantia();
		case PROPERTY_MODELO:
			return this.getModelo();

		}
		return null;
	}

	/**
	 * Se aplican los metodos de la interfaz itfProperties junto a las variables
	 * finales de la clase.
	 */

	@Override
	public Double getDoubleProperty(String propiedad) {
		// TODO Auto-generated method stub
		switch (propiedad) {
		case PROPERTY_PRECIO:
			return this.getPrecio();
		}
		return null;
	}

	/**
	 * Se aplican los metodos de la interfaz itfProperties junto a las variables
	 * finales de la clase.
	 */

	@Override
	public Date getDateProperty(String propiedad) {
		// TODO Auto-generated method stub

		switch (propiedad) {

		case PROPERTY_FECHA_DE_FABRICACION:
			return this.getFechaDeFabricacion();

		}
		return this.getFechaDeFabricacion();
	}

	/**
	 * Creamos los get y set para poder modificar los atributos desde otra clase ya
	 * que son atributos private.
	 */

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	public String getEquipacion() {
		return Equipacion;
	}

	public void setEquipacion(String equipacion) {
		Equipacion = equipacion;
	}

	public String getMatricula() {
		return Matricula;
	}

	public void setMatricula(String matricula) {
		Matricula = matricula;
	}

	public String getGarantia() {
		return Garantia;
	}

	public void setGarantia(String garantia) {
		Garantia = garantia;
	}

	public Date getFechaDeFabricacion() {
		return FechaDeFabricacion;
	}

	public void setFechaDeFabricacion(Date fechaDeFabricacion) {
		FechaDeFabricacion = fechaDeFabricacion;
	}

	public int getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		this.Modelo = modelo;
	}

	public int getDepartamento_idDepartamento() {
		return Departamento_idDepartamento;
	}

	public void setDepartamento_idDepartamento(int departamento_idDepartamento) {
		Departamento_idDepartamento = departamento_idDepartamento;
	}

	/**
	 * Creamos el toString por si acaso hace falta visualizar todos sus atributos.
	 */

	@Override
	public String toString() {
		return "Vehiculo [idVehiculo=" + idVehiculo + ", Tipo=" + Tipo + ", Marca=" + Marca + ", Color=" + Color
				+ ", Modelo=" + Modelo + ", Precio=" + Precio + ", Equipacion=" + Equipacion + ", Matricula="
				+ Matricula + ", Garantia=" + Garantia + ", FechaDeFabricacion=" + FechaDeFabricacion
				+ ", Departamento_idDepartamento=" + Departamento_idDepartamento + "]";
	}

	@Override
	public Float getFloatProperty(String propiedad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char getCharProperty(String propiedad) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Implementacion de los metodos hasCode y equals para poder comparar los
	 * parametros de esta clase de dos objetos diferentes. Esto se utiliza para las
	 * excepciones que no te dejen meter en la BBDD dos objetos con la misma ID o
	 * numero de factura.
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idVehiculo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (idVehiculo != other.idVehiculo)
			return false;
		return true;
	}

	/** Metodo compareTo para poder ordenar los Vehiculos. */

	public int compareTo(Object arg0) {

		Integer pr;
		Vehiculo objCast;

		pr = (int) this.Precio;

		if (arg0 == null)
			throw new NullPointerException();
		if (arg0.getClass() != this.getClass())
			throw new ClassCastException();

		objCast = (Vehiculo) arg0;
		// TODO Auto-generated method stub
		return pr.compareTo((int) objCast.getPrecio());
	}

}
