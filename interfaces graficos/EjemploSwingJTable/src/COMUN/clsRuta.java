package COMUN;

import java.io.Serializable;

public class clsRuta implements Serializable 

{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	String identificativo;
	String denominacion;
	int horasEstimadas;
	int dificultad;
	
	
	public clsRuta()
	{}
	
	public clsRuta(String identificativo, String denominacion,int horasEstimadas, int dificultad)
	{
		this.identificativo=identificativo;
		this.denominacion=denominacion;
		this.horasEstimadas=horasEstimadas;
		this.dificultad=dificultad;
	}
	
	public String getIdentificativo()
	{
		return this.identificativo;
	}
	public void setIdentificativo(String identificativo)
	{
		this.identificativo=identificativo;
	}
	
	public String getDenominacion()
	{
		return this.denominacion;
	}
	
	public void setDenominacion(String denominacion)
	{
		this.denominacion=denominacion;
	}

	
	public int getHorasEstimadas()
	{
		
		return  this.horasEstimadas;
	}
	
	public void setHorasEstimadas(int horasEstimadas)
	{
		this.horasEstimadas=horasEstimadas;
	}

	public int getDificultad()
	{
		return this.dificultad;
	}
	public void setDificultad(int dificultad)
	{
		this.dificultad=dificultad;
	}
	
}
