package LN;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import COMUN.clsAsignacion;
import COMUN.clsCamion;
import COMUN.clsConstantes.enFicDatos;
import COMUN.clsMiException;
import COMUN.clsRuta;
import LD.clsDatos;




/**
 * @author futpilari
 * Clase que gestiona las peticiones de la lógica de presentación y las canaliza hacia la lógica de datos.
 * Incluye las funcionalidades necesarias para obtener la información a presentar al usuario
 */
public class clsGestor 
{
	
	public void EliminarCamion(String mat)
	{
		ArrayList<Serializable>l;
		ArrayList<clsCamion>esc = null;
		clsDatos objDatos = new clsDatos();
		try {
			objDatos.ComenzarRead(enFicDatos.FICHERO_DATOS_CAMION);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		l=objDatos.Read();
		objDatos.TerminarRead();
		
		esc=new ArrayList<clsCamion>();
				
		for(Serializable s:l)
		{
			clsCamion c=(clsCamion)s;
			if(!c.getMatricula().equals(mat))
				esc.add(c);
		}
		objDatos.ResetFile(enFicDatos.FICHERO_DATOS_CAMION);
		objDatos.ComenzarSave(enFicDatos.FICHERO_DATOS_CAMION);
		for(clsCamion c:esc)
			objDatos.Save(c);
		objDatos.TerminarSave();
	}
	
	
	
	public Map<String,clsCamion> ConsultaCamiones()
	{
		ArrayList<Serializable>l;
		Map<String,clsCamion>retorno=null;
		
		clsDatos objDatos=new clsDatos();
		try {
			objDatos.ComenzarRead(enFicDatos.FICHERO_DATOS_CAMION);
			l=objDatos.Read();
			objDatos.TerminarRead();
			retorno = new HashMap<String,clsCamion>();
			for(int i=0;i<l.size();i++)
			{
				clsCamion c=(clsCamion)l.get(i);
				retorno.put(c.getMatricula(), c);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return retorno;
	}
	
	public Map<String,clsRuta> ConsultaRutas()
	{
		ArrayList<Serializable>l;
		Map<String,clsRuta>retorno=null;
		
		clsDatos objDatos=new clsDatos();
		try {
			objDatos.ComenzarRead(enFicDatos.FICHERO_DATOS_RUTA);
			l=objDatos.Read();
			objDatos.TerminarRead();
			retorno = new HashMap<String,clsRuta>();
			for(int i=0;i<l.size();i++)
			{
				clsRuta c=(clsRuta)l.get(i);
				retorno.put(c.getIdentificativo(), c);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return retorno;
	}

	public void GuardarAsignaciones(Set<clsAsignacion>asignacionSet) throws clsMiException
	{
		ArrayList<Serializable>l;
		clsDatos objDatos=new clsDatos();
		try {
			objDatos.ComenzarRead(enFicDatos.FICHERO_DATOS_ASIGNACION);
			l=objDatos.Read();
			objDatos.TerminarRead();
			
			for(Serializable s:l)
			{
				clsAsignacion a=(clsAsignacion)s;
				for(clsAsignacion b:asignacionSet)
				{
					if(a.equals(b))
					{
						throw new clsMiException(a);
					}
				}
			}
			objDatos.ComenzarSave(enFicDatos.FICHERO_DATOS_ASIGNACION);
			for(clsAsignacion b:asignacionSet)
			{
				objDatos.Save((Serializable)b);
			}
			objDatos.TerminarSave();
		} 
		catch (IOException e) {
			//Si no existe el fichero se escribe directamente 
			objDatos.ComenzarSave(enFicDatos.FICHERO_DATOS_ASIGNACION);
			for(clsAsignacion b:asignacionSet)
			{
				objDatos.Save((Serializable)b);
			}
			objDatos.TerminarSave();
		}
		
		
		
		
	}

	
	public ArrayList<clsAsignacion> ConsultarAsignaciones()
	{
		clsDatos objDatos = new clsDatos();
		ArrayList<Serializable>l;
		ArrayList<clsAsignacion>retorno=null;
		boolean Leer=true;
		
		try 
		{
			objDatos.ComenzarRead(enFicDatos.FICHERO_DATOS_ASIGNACION);
		} catch (IOException e) {
			//No existe el fichero.No se hace nada.Sin mas.
			Leer=false;
			objDatos.TerminarRead();
		}
		if(Leer)
		{
			l=objDatos.Read();
			objDatos.TerminarRead();
			retorno=new ArrayList<clsAsignacion>();
			for(Serializable s:l)
				retorno.add((clsAsignacion)s);
		}
		return retorno;
			
		
		
	}

}
