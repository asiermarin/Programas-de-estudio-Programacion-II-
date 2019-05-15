
public class clsMain 
{

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		
		int dividendo = 8;
		int divisor = 0;
		
		int resultado=0;
		
		
		try {
			resultado=clsOperaciones.hacerDivision(dividendo, divisor);
		} catch (clsDivPorCero e) {
			System.out.println( e.getMessage());
		}
		

		System.out.println(resultado);

	}

}
