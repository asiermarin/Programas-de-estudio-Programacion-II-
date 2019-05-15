import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class clsMain 
{
	private static ArrayList<clsBarco>misBarcos;
	
	public static void main (String args[])
	{
		
		misBarcos = new ArrayList<clsBarco>();
		
		//clsBarco(double eslora, double manga, double desplazamiento,String denominacion, String armador)
		clsBarco objA=new clsBarco(11.5, 4.3, 2.5,"barco1", "armador1");
		
		if(!Existe(objA))
		{
			misBarcos.add(objA);
		}
		else
		{
			System.out.println("Ya existe el barco");
		}
		
		clsBarco objB=new clsBarco(6.3, 2.0, 0.8,"barco2", "armador2");
		
		if(!Existe(objB))
		{
			misBarcos.add(objB);
		}
		else
		{
			System.out.println("Ya existe el barco");
		}
		
		clsBarco objC=new clsBarco(14.0, 5.0, 4.9,"barco3", "armador3");
		
		if(!Existe(objC))
		{
			misBarcos.add(objC);
		}
		else
		{
			System.out.println("Ya existe el barco");
		}
		
		clsBarco objD=new clsBarco(11.5, 4.3, 2.5,"barco1", "armador1");
		if(!Existe(objD))
		{
			misBarcos.add(objD);
		}
		else
		{
			System.out.println("Ya existe el barco");
		}
		
		
		//Probemos con un dato tipo set.
		HashSet<clsBarco> misBarcosDistintos = new HashSet<clsBarco>();
		if (misBarcosDistintos.add(objA)) 	System.out.println("Dentro" + objA);
		if(misBarcosDistintos.add(objB)) 	System.out.println("Dentro" + objB);
		if(misBarcosDistintos.add(objC)) 	System.out.println("Dentro" + objC);
		if(misBarcosDistintos.add(objD))	System.out.println("Dentro" + objD);
		
		 for (clsBarco a: misBarcosDistintos)
		 {
			 System.out.println(a);
		 }
		
		
	}
	
	public static boolean Existe(clsBarco _barco)
	{
		
		boolean retorno = false;
		
		for(clsBarco b:misBarcos)
		{
			if(b.equals(_barco)) return true;
			
		}
		
		return retorno;
		
	}

	


}
