package swing;

public class clsPersona 
{
	private String Nombre;
	private String Apellido1;
	private String Apellido2;
	private String Dni;
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido1() {
		return Apellido1;
	}
	public void setApellido1(String apellido1) {
		Apellido1 = apellido1;
	}
	public String getApellido2() {
		return Apellido2;
	}
	public void setApellido2(String apellido2) {
		Apellido2 = apellido2;
	}
	public String getDni() {
		return Dni;
	}
	public void setDni(String dni) {
		Dni = dni;
	}
	


	public String toString ()
	{
		return this.Nombre;
	}
public clsPersona(String nombre, String apellido1, String apellido2, String dni) {
	super();
	Nombre = nombre;
	Apellido1 = apellido1;
	Apellido2 = apellido2;
	Dni = dni;
}
	
	
}
