
public class clsOperaciones 
{
	
	public static int hacerDivision(int x, int c) //throws clsDivPorCero-->relanzamiento
	{
		int resultado=0;
		
		try 
		{
			resultado=clsCalculos.dividir(x, c);
		} 
		catch (clsDivPorCero e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			//throw e; -->relanzamiento
		}
		
		return resultado;
	}

}
