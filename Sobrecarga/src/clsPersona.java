
public abstract class clsPersona 
{
	
	private int edad;
	private String nombre;
	
	public clsPersona ()
	{
		edad=0;
		nombre="";
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public clsPersona (int e, String n)
	{
		edad= e;
		nombre = n;
		
	}
	
	public abstract void Informacion ();
	

}
