package COMUN;

import java.util.Observable;

import COMUN.clsConstantes.enFicDatos;
import LD.clsDatos;

public class clsContarDatos extends Observable implements Runnable 
{
	int asignaciones;
	int rutas;
	int camiones;
	boolean fin=false;
	
	@Override
	public void run() 
	{
		clsDatos objDatos=new clsDatos();
		camiones=objDatos.ContarGuardados(enFicDatos.FICHERO_DATOS_CAMION);
		rutas=objDatos.ContarGuardados(enFicDatos.FICHERO_DATOS_RUTA);
		asignaciones=objDatos.ContarGuardados(enFicDatos.FICHERO_DATOS_ASIGNACION);
		fin=true;
		setChanged();
		this.notifyObservers();
	}
	
	public int getAsignaciones()
	{
		return asignaciones;
	}
	
	public int getCamiones()
	{
		return camiones;
	}
	
	public int getRutas()
	{
		return rutas;
	}
	
	public boolean getFinalizado()
	{
		return fin;
	}
}
