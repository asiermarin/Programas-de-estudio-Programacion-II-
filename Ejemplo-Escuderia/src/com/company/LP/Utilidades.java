package com.company.LP;
import java.io.*;

/**
 Esta clase permite hacer uso de los dispositivos de entrada de forma muy sencilla.
 Posee distintos m�todos p�blicos y est�ticos (por lo tanto no se necesita un
 objeto como tal para acceder a ellos) para la lectura de los tipos de datos b�sicos
 en Java. Adem�s, todos los m�todos tienen un control de errores mediante petici�n
 sucesiva de introducci�n de dato hasta que estos sean correctos.
 */
public class Utilidades
{
    /**
     Permite introducir por teclado en la consola un n�mero entero (32 bits = -2147483648 <-> 2147483648)
     realizando las comprobaciones pertienentes.
     @return Devuelve el n�mero entero que se haya introducido por teclado.
     */
    public static int leerEntero()
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        Integer entero = null;
        boolean error = true;
        do
        {
            try
            {
                String cadena = br.readLine();
                entero = new Integer(cadena);
                error = false;
            }
            catch(NumberFormatException nfe)
            {
                System.out.println("No tecle� un n�mero entero-Repetir");
            }
            catch (Exception e)
            {
                System.out.println("Error de entrada-Repetir ");
            }
        }
        while(error);
        return entero.intValue();
    }

    /**
     Permite introducir por teclado en la consola un n�mero real realizando
     las comprobaciones pertienentes.
     @return Devuelve el n�mero real que se haya introducido por teclado.
     */
    public static double leerReal()
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        Double real = null;
        boolean error = true;
        do
        {
            try
            {
                String cadena = br.readLine();
                real = new Double(cadena);
                error = false;
            }
            catch(NumberFormatException nfe)
            {
                System.out.println("No tecle� un n�mero real-Repetir ");
            }
            catch (Exception e)
            {
                System.out.println("Error de entrada-Repetir ");
            }
        }
        while(error);
        return real.doubleValue();
    }

    /**
     Permite introducir por teclado en la consola un caracter (8 bits = -128 <-> 127)
     realizando las comprobaciones pertienentes.
     @return Devuelve el caracter que se haya introducido por teclado.
     */
    public static char leerCaracter()
    {
        char caracter = 0;
        boolean error = true;
        do
        {
            try
            {
                caracter = (char)System.in.read();
                System.in.skip(System.in.available());
                error = false;
            }
            catch (Exception e)
            {
                System.out.println("Error de entrada-Repetir ");
            }
        }
        while(error);
        return caracter;
    }

    /**
     Permite introducir por teclado en la consola una cadena de caracteres (String)
     realizando las comprobaciones pertienentes.
     @return Devuelve la cadena de caracteres que se haya introducido por teclado.
     */
    public static String leerCadena()
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String cadena = null;
        boolean error = true;
        do
        {
            try
            {
                cadena = br.readLine();
                error = false;
            }
            catch (Exception e)
            {
                System.out.println("Error de entrada-Repetir ");
            }
        }
        while(error);
        return cadena;
    }


}