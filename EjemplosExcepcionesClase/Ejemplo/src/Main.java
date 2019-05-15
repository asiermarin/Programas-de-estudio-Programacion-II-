public class Main 
{
	public static void main(String[] args)
	{
		double num;
		double den;
		
		System.out.println("Dame numerador");
		num=Utilidades.leerReal();
		System.out.println("Dame denominador");
		den=Utilidades.leerReal();
		
		double resultado;
		
		try
		{
			resultado=clsThrp.division(num, den);
			System.out.println(resultado);
		}
		
		catch (Apoyo ap)
		{
			System.out.println(ap.getMessage());
		}
		
		finally 
		{
			System.out.println("Lo que haya dentro de finally se hará siempre, por ejemplo este syso.");
		}
		
		
// EJEMPLO DE RELANZAMIENTO		
		
//		try
//		{
//			Relanzamiento.relanzar(num,den);
//		}
//		catch(Apoyo apoyo)
//		{
//			System.out.println("Dame numerador");
//			num=Utilidades.leerReal();
//			System.out.println("Dame denominador");
//			den=Utilidades.leerReal();
//			System.out.println(apoyo.getMessage());
//		}
//		finally 
//		{
//			System.out.println("Lo que haya dentro de finally se hará siempre, por ejemplo este syso.");
//		}
	}
}
