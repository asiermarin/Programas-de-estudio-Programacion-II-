
public class clsCalculos 
{
	
	public static int dividir (int d, int c) throws clsDivPorCero
	{
		
		if(c==0)
				throw new clsDivPorCero();
		
		
		return (int)d/c;
		
	}

}
