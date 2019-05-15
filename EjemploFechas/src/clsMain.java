import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Clase que muestra un ejemplo para el manejo de las fechas.
 * @author javier.cerro
 *
 */
public class clsMain 
{

	public static void main(String[] args) 
	{
		
		
		Date miFecha = new Date();
		DateFormat miFormato;

		
		
		//http://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
		
		miFormato = DateFormat.getDateInstance();
		System.out.println(miFormato.format(miFecha));
		
		miFormato = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(miFormato.format(miFecha));
		
		miFormato = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(miFormato.format(miFecha));
		
		miFormato = DateFormat.getDateInstance(DateFormat.DEFAULT);
		System.out.println(miFormato.format(miFecha));
		
		miFormato = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(miFormato.format(miFecha));
		
		miFormato = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(miFormato.format(miFecha));
		
		
		miFormato = new SimpleDateFormat("dd/MM/YY hh:mm:ss");
		System.out.println(miFormato.format(miFecha));
		
		miFormato = new SimpleDateFormat("dd-MM-YYYY hh-mm-ss");
		System.out.println(miFormato.format(miFecha));
		
		
		/*
		 * ¿Como paso un string a fecha?
		 */
		String miFechTexto="24/07/2012";
		try 
		{
			miFecha=miFormato.parse(miFechTexto);
		} 
		catch (ParseException e) 
		{
			System.out.println("Error en el parseo.");
		}
		
		/*
		 * Ahora vamos a eliminar el ERROR de parseo por el FORMATO.
		 */
		miFormato = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		System.out.println(miFormato.format(miFecha));
		
		miFechTexto="12-11-2012 09-23-00";
		try 
		{
			miFecha=miFormato.parse(miFechTexto);
		} 
		catch (ParseException e) 
		{
			System.out.println("Error en el parseo.");
		}
		
		miFormato = new SimpleDateFormat("dd-MM-YYYY");
		System.out.println(miFormato.format(miFecha));
		
		
		
		/*
		 * Para jugar con la información de la fecha
		 */
		GregorianCalendar otraFecha=new GregorianCalendar();
		System.out.println(otraFecha.get(Calendar.DAY_OF_MONTH));
		System.out.println(otraFecha.get(Calendar.DAY_OF_WEEK));
		System.out.println(otraFecha.get(Calendar.MINUTE));
		System.out.println(otraFecha.get(Calendar.MONTH));
		System.out.println(otraFecha.get(Calendar.YEAR));
		
	

	}

}
