package com.company.LP;

import com.company.LN.clsGestor;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class clsMenu {

    public clsMenu(){

    }

    public void menuPrincipal(){

        int opcion=0;
        int op = 0;

        clsGestor objGestor = new clsGestor();

        do {
            System.out.println("Selecciona el tipo de una opción:");
            System.out.println("----> 1. Introducir datos ");
            System.out.println("----> 2. Visualizar datos");
            System.out.println("----> 3. Salir");
            System.out.print("Opción:");
            opcion = Utilidades.leerEntero();

            switch (opcion){

                case 1:
                    System.out.println("Escoge opción, ingeniero o piloto?:");
                    System.out.println("----> 1. Introducir datos PILOTO ");
                    System.out.println("----> 2. Visualizar datos INGENIERO");
                    op = Utilidades.leerEntero();

                    if (op == 1){
                        altaDPiloto(objGestor);
                    }else {
                        altaDPIngeniero(objGestor);
                    }


            }

        } while (opcion != 3);

    }

    public static void altaDPiloto(clsGestor objG){

         String nombreE = null;
         int puntosE = 0;
         String nombreP = null;
         int puntosP = 0;

        System.out.println("Introduce los datos:");
        System.out.print("Nombre Escuderia:");
        nombreE = Utilidades.leerCadena();
        System.out.print("Puntos Escuderia:");
        puntosE = Utilidades.leerEntero();
        System.out.print("Nombre Escuderia:");
        nombreP = Utilidades.leerCadena();
        System.out.print("Puntos Piloto:");
        puntosP = Utilidades.leerEntero();

        objG.anadirPiloto(nombreE, puntosE, nombreP, puntosP);

    }

    public static void altaDPIngeniero(clsGestor objG){

        String nombreE = null;
        int puntosE = 0;
        String nombreI = null;

        System.out.println("Introduce los datos:");
        System.out.print("Nombre Escuderia:");
        nombreE = Utilidades.leerCadena();
        System.out.print("Puntos Escuderia:");
        puntosE = Utilidades.leerEntero();
        System.out.print("Nombre Ingeniero:");
        nombreI = Utilidades.leerCadena();

        objG.anadirIngeniero(nombreE, puntosE, nombreI);


    }

    public static void visulizarDatos(){


    }



}
