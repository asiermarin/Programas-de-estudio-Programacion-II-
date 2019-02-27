package com.jaureguialzo;

public abstract class Motor {

    private int potencia;

    // Asociación
    private Coche coche;

    public void arrancar() {

    }

    public void parar() {

    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }
}
