


/**
 * Clase para guardar la información de un objeto barco.
 * Dos barcos serán iguales cuando tengan el mismo armador y la misma denominación.
 * @author JAVIER
 *
 */
public class clsBarco 
{
	
	/**
	 * Longitud del barco
	 */
	private double eslora;
	
	
	/**
	 * Ancho del barco
	 */
	private double manga;
	
	/**
	 * Peso del agua desalojada en toneladas.
	 */
	private double desplazamiento;
	
	
	/**
	 * Nombre del barco
	 */
	private String denominacion;
	
	/**
	 * Nombre del armador propietario.
	 */
	private String armador;
	
	
	
	
	
	
	

	public clsBarco(double eslora, double manga, double desplazamiento,String denominacion, String armador) 
	{
		super();
		this.eslora = eslora;
		this.manga = manga;
		this.desplazamiento = desplazamiento;
		this.denominacion = denominacion;
		this.armador = armador;
	}


	public double getEslora() {
		return eslora;
	}


	public void setEslora(double eslora) 
	{
	
		this.eslora = eslora;
	
	}

	public double getManga() {
		return manga;
	}

	public void setManga(double manga) {
	
		this.manga = manga;
	
	}

	public double getDesplazamiento() {
		return desplazamiento;
	}

	public void setDesplazamiento(double desplazamiento) 
	{
			this.desplazamiento = desplazamiento;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) 
	{
		this.denominacion = denominacion;

	}

	public String getArmador() {
		return armador;
	}

	public void setArmador(String armador) 
	{
		this.armador = armador;
	}


	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((armador == null) ? 0 : armador.hashCode());
		result = prime * result
				+ ((denominacion == null) ? 0 : denominacion.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj) return true;
		
		if (obj == null) return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		clsBarco other = (clsBarco) obj;
		if (armador == null) 
		{
			if (other.armador != null)
				return false;
		} 
		else if (!armador.equals(other.armador))
			return false;
		
		if (denominacion == null) 
		{
			if (other.denominacion != null)
				return false;
		} 
		else if (!denominacion.equals(other.denominacion))
			return false;
		
		return true;
	}
	
	
	
	
	
	
	

}
