
public class clsAlumno extends clsPersona 
{
	
	private int num_asig;
	
	public clsAlumno ()
	{
		super();
		num_asig=0;
		
		
	}
	
	public clsAlumno (int e, String n, int asigs)
	{
		super (e,n);
		this.num_asig=asigs;
	}
	
	public void Informacion ()
	{
		StringBuffer info = new StringBuffer();
		
		
		info.append("\n--PERSONA--\n");
		info.append("Mi nombre de persona es " + this.getNombre()+ "\n");
		info.append("y mi edad es " + this.getEdad() + " años.\n");
		System.out.println(info);
		
		info.append ("Y como alumno estoy matriculado de "  + this.num_asig + "asignaturas" );
		System.out.println(info);
		
		info=null;
	}
	
	public void Informacion (String q)
	{
		StringBuffer s = new StringBuffer ();
		
		s.append("Esta información no tiene interés: " + q + "\n");
		System.out.println(s);
		
		
		s=null;
	
		
	}

	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	


}
