
public class cliente 
{
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public cliente(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return nombre;
	}
}
