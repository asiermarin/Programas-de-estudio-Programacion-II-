public class Relanzamiento
{
	public static void relanzar(double num, double den)
	{
		try
		{
			double resultado;
			resultado=clsThrp.division(num, den);
			System.out.println(resultado);
		}
		
		catch (Apoyo ap)
		{
			System.out.println(ap.getMessage());
			throw ap;
		}
		
		finally 
		{
			System.out.println("Piribiribí.");
		}
	}
}
