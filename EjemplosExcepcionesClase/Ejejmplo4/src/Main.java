import java.io.EOFException;
import java.io.FileNotFoundException;
		
public class Main
{			
			public static void f1 (int accion) throws EOFException
			{
				try
				{
					if(accion == 1)
					{
						throw new FileNotFoundException();
					}
					else if(accion==2)
					{
						throw new EOFException();
					}
				}
				catch(FileNotFoundException e)
				{
					System.out.println( "Error corregido" );
				}
					System.out.println("Finalización normal de f1.");
			}
			
			public static void main(String[] args) 
			{
				int accion = 1;
				try
				{
					f1(accion);
				}
				catch(EOFException e)
				{
					System.out.println( "The problem has been solved." );
				}
					System.out.println("Finalización normal del main.");
			}
	}