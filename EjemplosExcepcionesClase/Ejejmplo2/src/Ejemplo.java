
class MesInvalidoException extends RuntimeException
{}
		class Fecha
		{
			void setMes( int mes )
			{
			if( mes < 1 || mes > 12 )
			throw new MesInvalidoException();
			}
		
			public static void main( String[] args )
			{
			Fecha fecha = new Fecha();
			fecha.setMes(14);
			}
		}
		
		
		
	


