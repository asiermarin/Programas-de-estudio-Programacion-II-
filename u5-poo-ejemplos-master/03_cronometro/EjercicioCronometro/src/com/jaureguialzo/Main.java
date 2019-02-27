package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        Cronometro[] cronometros = new Cronometro[10];
        int recuento = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int opcion;
        do {
            System.out.println("1. Nuevo cronómetro\n" +
                    "2. Consultar cronómetro\n" +
                    "3. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 1:
                    if (recuento < 10) {
                        cronometros[recuento] = new Cronometro();
                        recuento += 1;
                    } else {
                        System.out.println("ERROR: No caben más cronos");
                    }
                    break;
                case 2:
                    System.out.print("Número de crono: ");
                    int n = Integer.parseInt(br.readLine());

                    if (n >= 0 && n < 10) {
                        if (cronometros[n] != null) {
                            cronometros[n].tiempoTranscurrido();
                        } else {
                            System.out.println("ERROR: No hay cronómetro");
                        }
                    } else {
                        System.out.println("ERROR: Posición errónea");
                    }
                    break;
                case 3:
                    break;
            }

        } while (opcion != 3);

    }
}
