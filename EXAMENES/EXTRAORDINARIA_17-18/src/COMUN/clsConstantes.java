package COMUN;
/**
 * Clase para identificar las propiedades de todos los objetos y los ficheros.
 * @author ALUMNO
 *
 */
public class clsConstantes 
{
	/**
	 * Enumerado para identificar el fichero en el que leer y escribir.
	 * @author ALUMNO
	 *
	 */
	public enum enFicDatos
	{
		ficheroelectrodomesticos;		
	}
	
	/**
	 * Enumerado para identificar el tipo de electrodom�stico.
	 * @author ALUMNO
	 *
	 */
	public static enum enTipo
	{
		Refrigerador,
		Lavavajillas,
		Lavadoras,
		Secadoras,
		Lavadora_secadora,
		Fuentes_de_luz,
		Horno_el�ctrico,
		Aire_acondicionado
		
		
	}
	
	public static enum enEficiencia
	{
		A,
		B,
		C,
		D,
		E,
		F,
		G
	}
	
}
