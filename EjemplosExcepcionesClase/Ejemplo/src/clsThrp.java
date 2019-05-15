public class clsThrp
{
	public static double division(double num, double den) throws Apoyo
	{
		if(den==0)
		{
			throw new Apoyo();
		}
		
		return num/den;
	}	
}