package Comparator;

public class clsPersonas {

	private String nombre;
	private String apellido;
	private int edad;
	private double altura;


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}


	@Override
	public String toString() {
		return nombre +" "+apellido + " tiene " + edad + " años y mide: " + altura
				+ "\n";
	}

	public clsPersonas(String nombre, String apellido, int edad, double altura) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.altura = altura;

	}
}
