package com.jaureguialzo;

public class Cronometro {

    private long horaInicio;

    public Cronometro() {
        horaInicio = System.nanoTime();
    }

    public void tiempoTranscurrido() {
        long tiempoTranscurrido = System.nanoTime() - horaInicio;

        System.out.printf("%f\n", tiempoTranscurrido / 1000000000.0);
    }

}
