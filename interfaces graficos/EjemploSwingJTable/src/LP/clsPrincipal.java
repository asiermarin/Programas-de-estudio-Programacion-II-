package LP;

import COMUN.clsCamion;
import COMUN.clsConstantes.enFicDatos;
import LD.clsDatos;

public class clsPrincipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//Creación de camiones
		clsCamion c = new clsCamion("1111JFK",12,(long)2.02,1830,10);
		clsCamion d = new clsCamion("2222CHG",5,(long)4.02,4788,10);
		clsCamion e = new clsCamion("3333LFD",24,(long)3.02,10000,10);
		clsCamion f = new clsCamion("4444WSK",9,(long)2.92,700,10);
		
		clsDatos objDatos = new clsDatos();
		objDatos.ResetFile(enFicDatos.FICHERO_DATOS_CAMION);
		objDatos.ComenzarSave(enFicDatos.FICHERO_DATOS_CAMION);
		objDatos.Save(c);
		objDatos.Save(d);
		objDatos.Save(e);
		objDatos.Save(f);
		objDatos.TerminarSave();
		
		c=null;
		d=null;
		e=null;
		f=null;
		
		frmAsignacionRutas ar=new frmAsignacionRutas();
		
		

	}

}
