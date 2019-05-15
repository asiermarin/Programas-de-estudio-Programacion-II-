package com.company;

import javax.xml.crypto.dsig.SignatureMethod;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static com.sun.tools.javac.util.Constants.format;

public class Main {

    public static void main(String[] args) throws ParseException {
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /**
        //Incremento de una fecha
        String fechaAleatoria = "01/01/2008" ;//Start date
        DateFormat  miFormato2 = DateFormat.getDateInstance(DateFormat.SHORT);
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(miFormato2.parse(fechaAleatoria));
        calendario.add(Calendar.DATE, 35);  // number of days to add
        fechaAleatoria = miFormato2.format(calendario.getTime());  // dt is now the new date
        Date fechaDev = new SimpleDateFormat("dd/MM/yyyy").parse(fechaAleatoria);
         */

        Date fechaHoy = new Date();
        SimpleDateFormat miFormato3 = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendario2 = Calendar.getInstance();
        calendario2.setTime(fechaHoy);
        calendario2.add(Calendar.DATE, 2);  // number of days to add
        String fechaDevS = miFormato3.format(calendario2.getTime());
        Date fechaDev2 = new SimpleDateFormat("dd/MM/yyyy").parse(fechaDevS);


        //System.out.println(miFormato2.format(fechaDev));
        System.out.println(miFormato3.format(fechaDev2));

        Date fecha = new Date("1997/01/18");
        System.out.println(fecha);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /**
        String dt = "2008-01-01";  // Start date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.setTime(sdf.parse(dt));
        c.add(Calendar.DATE, 1);  // number of days to add
        dt = sdf.format(c.getTime());  // dt is now the new date
        //System.out.println(dt);



        //Obtengo la fecha de hoy
        Date miFecha = new Date();
        DateFormat miFormato;

        //http://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html

        miFormato = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(miFormato.format(miFecha));

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Obtengo una fecha de devolucuion
        String fechaDev1;

        System.out.println("Fecha de devolucion:(dd/MM/yyyy): ");
        fechaDev1 = com.company.LP.Utilidades.leerCadena();
        Date fecha = new SimpleDateFormat("dd/MM/yyyy").parse(fechaDev1);

        //Obtengo dos primeros numeros
        String diaDev = fechaDev1.substring(0,2);
        int fechaDevEnt = Integer.parseInt(diaDev);
        System.out.println(fechaDevEnt);
        */
    }
}