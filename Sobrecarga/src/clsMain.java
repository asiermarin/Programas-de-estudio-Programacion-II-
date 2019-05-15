
public class clsMain 
{

	public static void main(String[] args) 
	{
	
//		clsPersona a = new clsPersona (45,"Pepe");
//		a.Informacion();
		
		clsAlumno b= new clsAlumno (22,"Juan",3);
		b.Informacion();
		
//		a=b;
//		a.Informacion();
//		
		clsAlumno c;
		c=b;
		
		c.Informacion();
		c.Informacion("chorradas");
		
//		a=c;
		
		
		//¿qué pasa si llamamos a un alumno c como un persona?
		//¿qué metodos se nos muestran y se permiten lanzar?
		//a.
		
		//¿qué pasa si asignamos una referencia de tipo persona a otra de tipo alumno?
		//c=a;
		

	}

}
