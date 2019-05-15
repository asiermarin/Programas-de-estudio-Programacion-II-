
public class clsDivPorCero extends Exception 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final String MENSAJE= "El denominador de una división no puede ser cero";

	@Override
	public String getMessage() 
	{
		// TODO Auto-generated method stub
		return MENSAJE;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return MENSAJE;
	}
	
	
	
	

}
