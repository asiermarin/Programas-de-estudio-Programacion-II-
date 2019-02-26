package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = 0;
        int y = 0;

        /**
         * Para poder apasar parámetros al objeto en la clase específica, tengo que crear
         * el constructor
         */

        // Declaro e instacia mi objeto que es un array
        clsRobot objRobot = new clsRobot(x, y);

        do {

            System.out.println();

            // Visualizar posición del robot
            System.out.println("Estan son las coordenadas de robbie: "+objRobot);
            System.out.println();

            clsRobot.visualizarTablero();

            System.out.println("Dame las coordenadas de desplazamiento;");
            System.out.print("x: ");
            x = Utilidades.leerEntero();

            System.out.print("y: ");
            y = Utilidades.leerEntero();

        } while ( true );

    }

}


