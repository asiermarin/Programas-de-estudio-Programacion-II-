package COMUN;

/**
 * Es una clase para contener constantes comunes que puedan afectar a más de un módulo.
 * @author futpilari
 * @since	15/11/2013
 * */
public class clsConstantes 
{
	
	
	/**
	 * @author futpilari
	 * Enumerado para identificar los ficheros en los que leer y escribir.
	 */
	public static enum enFicDatos
	{
		FICHERO_DATOS_CAMION,
		FICHERO_DATOS_RUTA,
		FICHERO_DATOS_ASIGNACION
	}
	
	
	/**
	 * @author futpilari
	 * Constantes para los ActionCommand de los elementos del interfaz de usuario
	 */
	public final static String CMD_BTN_ANADIR = "CMD_BTN_ANADIR";
	public final static String CMD_BTN_GUARDAR = "CMD_BTN_GUARDAR";
	public final static String CMD_BTN_HILO	="CMD_BTN_HILO";
	public final static String CMD_BTN_ASIGNACIONES	="CMD_BTN_ASIGNACIONES";
	public final static String CMD_BTN_ELIMINAR_CAMION	="CMD_BTN_ELIMINAR_CAMION";
	public final static String MENU_LANZAR_PIZARRA="MENU_LANZAR_PIZARRA";
	
	
	/**
	 * @author futpilari
	 * Constantes con las columnas de la tabla de camiones
	 */
	public final static int COL_CAMIONES_MATRICULA=0;
	public final static int COL_CAMIONES_ALTURA=1;
	public final static int COL_CAMIONES_TARA=2;
	public final static int COL_CAMIONES_NUMRUEDAS=3;
	
	
	/**
	 * @author futpilari
	 * Constantes con las columnas de la tabla de Rutas
	 */
	public final static int COL_RUTAS_IDENTIFICATIVO=0;
	public final static int COL_RUTAS_DENOMINACION=1;
	public final static int COL_RUTAS_HORAS=2;
	public final static int COL_RUTAS_DIFICULTAD=3;
	
	/**
	 * Constante que indica que no hay selección de fila en la tabla.
	 */
	public final static int ROW_NO_SELECTED=-1; 
}

