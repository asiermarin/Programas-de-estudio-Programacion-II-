
/**
 *
 * Clase en la que cremos la excepción "Apoyo".
 * @author ALUMNO
 *
 */
import java.lang.Throwable.*;

public class Apoyo extends RuntimeException //si hereda de exception da error. Enseñarlo en clase.
{
	public String getMessage()
	{
		return "No puedes dividir entre 0, melón.";
	}	
}