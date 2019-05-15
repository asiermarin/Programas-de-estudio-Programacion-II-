class PrinterException extends Exception{}
class Ejemplo
{
		static void imprimirClientes (cliente[] listaclientes) throws PrinterException
	    { 
	        for (int i=0;i<3;i++)  //ir cambiando el 3 para enseñar los diferentes casos
	        {
	        	 if(i>=listaclientes.length)
	        	 {
	 	         throw new PrinterException();
	        	 }
	        	System.out.println(listaclientes[i]);   
	        }
	    }
	 
		public static void main( String[] args )
		{
			cliente listaclientes[]=new cliente[3];

	        listaclientes[0]=new cliente("Juanmi");
	        listaclientes[1]=new cliente("Willy");
	        listaclientes[2]=new cliente("Charly");
			
			try
			{
				imprimirClientes(listaclientes);
			}
			catch(PrinterException e)
			{
				System.out.println("¡No hay mas clientes melón!");
			}
		}
		
}