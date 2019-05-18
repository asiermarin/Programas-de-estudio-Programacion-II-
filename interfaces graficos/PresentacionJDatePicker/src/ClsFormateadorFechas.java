import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFormattedTextField.AbstractFormatter;

/**
 * Clase para el formateo de las fechas
 *
 */
public class ClsFormateadorFechas extends AbstractFormatter{

	/**
	 * Esto no se para que sirve
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constante del patron de formateo de la Fecha
	 */
	private String Patron = "dd-MM-yyyy";
	
	/**
	 * Instanciamos y creamos nuestro objeto formateador
	 */
	private SimpleDateFormat ObjFormateador = new SimpleDateFormat(Patron);
	
	/**
	 * Parseamos la fecha
	 */
	@Override
	public Object stringToValue(String text) {
		/**
		 * Parsea la fecha que nos pasan en el formato predefinido
		 */
		 try {
			ObjFormateador.parseObject(text);
		} catch (ParseException e) {
			System.out.println(e);
		}
		return text;
	}

	@Override
	public String valueToString(Object value) throws ParseException {
		
		 if (value != null) {
	            Calendar calendario = (Calendar) value;
	            return ObjFormateador.format(calendario.getTime());
	        }
		return null;
	}

}
