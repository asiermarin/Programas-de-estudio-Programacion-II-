package COMUN;

import java.io.Serializable;

public class clsCamion implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String matricula;
	int longitud;
	long altura;
	long tara;
	int numRuedas;
	
	public clsCamion()
	{}
	
	public clsCamion(String matricula, int longitud, long altura,long tara,int numRuedas)
	{
		this.matricula=matricula;
		this.longitud=longitud;
		this.altura=altura;
		this.tara=tara;
		this.numRuedas=numRuedas;
		
	}
	
	
	public String getMatricula()
	{
		return this.matricula;
	}
	public void setMatricula(String matricula)
	{
		this.matricula=matricula;
	}
	
	
	public int getLongitud()
	{
		return this.longitud;
	}
	
	public void setLongitud(int longitud)
	{
		this.longitud=longitud;
	}

	
	public long getAltura()
	{
		return (long) this.altura;
	}
	
	public void setAltura(long altura)
	{
		this.altura=altura;
	}

	public long getTara()
	{
		return (long) this.tara;
	}
	public void setTara(long tara)
	{
		this.tara=tara;
	}
	public int getNumRuedas()
	{
		
		return this.numRuedas;
	}
	public void setNumRuedas(int numRuedas)
	{
		this.numRuedas=numRuedas;
	}

	

}
