package COMUN;

public class clsMiException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mensaje="";
	
	
	public clsMiException (clsAsignacion repetida)
	{
		mensaje="La asignaci�n del cami�n de matricula " + repetida.getMatricula() 
				 + "con la ruta de identificativo " + repetida.getIdentificativo()
				 + " ya ha sido guardada.";
	}
	
	
	public String getMessage()
	{
		return mensaje;
	}

}
