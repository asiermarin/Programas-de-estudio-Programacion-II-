package com.company;

public class clsMenu {

    public static void menu() {

        //Delcaro e instacio los objetos
        Cronometro[] objCrono = new Cronometro[10];
        int i = 0;
        int opcion = 0;

        // Instante inicial
        long startTime = System.nanoTime();

        do {

            System.out.println("Eligue una opción;\n" +
                    "1. Nuevo cronómetro\n" +
                    "2. Consultar cronómetro\n" +
                    "3. Salir");
            System.out.print("Opción: ");
            opcion = Utilidades.leerEntero();

            // Cálculo del tiempo transcurrido
            long estimatedTime = System.nanoTime() - startTime;

            objCrono[i] = new Cronometro();

            objCrono[0].setHorainicio(startTime);
            objCrono[0].setHorafinal(estimatedTime);
            objCrono[0].tiempreTranscurrido(opcion, i);
            System.out.println();

            i++;

        } while (i < 10 | opcion == 3 );
    }
}
