package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {

        //Obtengo la fecha de hoy
        Date miFecha = new Date();
        DateFormat miFormato;



        //http://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html

        miFormato = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(miFormato.format(miFecha));

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Obtengo una fecha de devolucuion
        String fechaDev1;

        System.out.println("Fecha de devolucion:(dd/MM/yyyy)");
        fechaDev1 = Utilidades.leerCadena();
        Date fecha = new SimpleDateFormat("dd/MM/yyyy").parse(fechaDev1);

        //Obtengo dos primeros numeros
        String diaDev = fechaDev1.substring(0,2);
        int fechaDevEnt = Integer.parseInt(diaDev);
        System.out.println(fechaDevEnt);


        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Incremento de una fecha
        String fechaAleatoria = "01/01/2008" ;//Start date
        DateFormat  miFormato2 = DateFormat.getDateInstance(DateFormat.SHORT);
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(miFormato2.parse(fechaAleatoria));
        calendario.add(Calendar.DATE, 15);  // number of days to add
        fechaAleatoria = miFormato2.format(calendario.getTime());  // dt is now the new date
        System.out.println(miFormato2.format(fechaAleatoria));


        String dt = "2008-01-01";  // Start date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.setTime(sdf.parse(dt));
        c.add(Calendar.DATE, 1);  // number of days to add
        dt = sdf.format(c.getTime());  // dt is now the new date
        System.out.println(dt);
        System.out.println("hola");
    }
}
