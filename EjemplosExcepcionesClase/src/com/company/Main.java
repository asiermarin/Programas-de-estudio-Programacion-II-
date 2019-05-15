package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x ;
        int y ;

        /**
         * Para poder apasar parámetros al objeto en la clase específica, tengo que crear
         * el constructor. No tengo que instanciar en el propio bucle el objeto. Si lo hago
         * crearía un objeto constantemente.
         */

        // Declaro e instacia mi objeto que es un array
        clsRobot objRobot = new clsRobot();

        do {



            System.out.println();

            // Visualizar posición del robot
            System.out.println("Estan son las coordenadas de robbie: "+objRobot);
            System.out.println();

            /**
             * En vez de hacer una llamada ala clase, como estoy utilizando atributos llamaré
             * al propio objeto.
             */

            objRobot.visualizarTablero();
            System.out.println();

            System.out.println("Dame las coordenadas de desplazamiento;");
            System.out.print("x: ");
            x = Utilidades.leerEntero();

            System.out.print("y: ");
            y = Utilidades.leerEntero();

            objRobot.mover(x, y);

        } while ( true );
    }
}


