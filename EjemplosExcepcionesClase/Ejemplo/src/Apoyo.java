
/**
 *
 * Clase en la que cremos la excepci�n "Apoyo".
 * @author ALUMNO
 *
 */
import java.lang.Throwable.*;

public class Apoyo extends RuntimeException //si hereda de exception da error. Ense�arlo en clase.
{
	public String getMessage()
	{
		return "No puedes dividir entre 0, mel�n.";
	}	
}