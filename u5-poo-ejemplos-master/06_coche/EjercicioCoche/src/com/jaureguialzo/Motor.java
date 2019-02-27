package com.jaureguialzo;

public class Motor {

    private int cilindrada;
    private String combustible;
    private int potencia;

    // Asociación
    private Coche coche;

    public Motor(int cilindrada, String combustible, int potencia, Coche coche) {
        this.cilindrada = cilindrada;
        this.combustible = combustible;
        this.potencia = potencia;
        this.coche = coche;
    }

}
