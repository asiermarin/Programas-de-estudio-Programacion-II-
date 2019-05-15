
public class Main
{
	public static void main(String[] args) 
	{
		try 
		{
            System.out.println("Intentamos ejecutar el bloque de instrucciones:");
            System.out.println("Instrucci�n 1.");
            int n = Integer.parseInt("M"); //error forzado en tiempo de ejecuci�n, se espera un n�mero no una letra.
            System.out.println("Instrucci�n 2.");
            System.out.println("Instrucci�n 3, etc.");
        }
        catch (Exception e)
		{
            System.out.println("Instrucciones a ejecutar cuando se produce un error");
    //        System.out.println("Se ha producido un error " + e );
        }
        finally 
        {
            System.out.println("Instrucciones a ejecutar finalmente tanto si se producen errores como si no.");
        }
	}
}