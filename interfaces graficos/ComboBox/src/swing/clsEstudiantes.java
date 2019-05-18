package swing;

public class clsEstudiantes extends clsPersona {
	int creditos;

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public clsEstudiantes(String  Nombre,String Apellido1, String Apellido2, String Dni) {
		super(Nombre, Apellido1, Apellido2, Dni);
		// TODO Auto-generated constructor stub
	}

	public clsEstudiantes(String nombre, String apellido1, String apellido2, String dni, int creditos) {
		super(nombre, apellido1, apellido2, dni);
		this.creditos = creditos;
	}

	@Override
	public String toString() {
		return this.getNombre();
	}
	

}
