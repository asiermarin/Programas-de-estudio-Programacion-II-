package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Coche micoche = new Coche();

        for (int i = 0; i < 4; i++) {
            micoche.getRuedas()[i] = new Rueda();       // Ida
            micoche.getRuedas()[i].setCoche(micoche);   // Vuelta
        }

        System.out.print("Número de motores: ");
        int numMotores = Integer.parseInt(br.readLine());

        for (int i = 0; i < numMotores; i++) {

            System.out.print("Cilindrada: ");
            int cilindrada = Integer.parseInt(br.readLine());
            System.out.print("Combustible: ");
            String combustible = br.readLine();
            System.out.print("Potencia: ");
            int potencia = Integer.parseInt(br.readLine());

            micoche.getMotores()[i] = new Motor(cilindrada, combustible, potencia, micoche);

        }

        int numPuertas;
        do {

            System.out.print("Número de puertas (2-5): ");
            numPuertas = Integer.parseInt(br.readLine());

        } while (!(numPuertas >= 2 && numPuertas <= 5));

        for (int i = 0; i < numPuertas; i++) {
            micoche.getPuertas()[i] = new Puerta(true);
            micoche.getPuertas()[i].setCoche(micoche);
        }

    }
}
