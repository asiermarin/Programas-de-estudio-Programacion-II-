package com.jaureguialzo;

public class Coche {

    private String marca;
    private String modelo;
    private int color;

    // Asociaciones
    Rueda[] ruedas = new Rueda[4];

    Motor[] motores = new Motor[10];

    Puerta[] puertas = new Puerta[5];

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    /* ¡Peligroso!
    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }
    */

    public Motor[] getMotores() {
        return motores;
    }

/*
public void setMotores(Motor[] motores) {
        this.motores = motores;
    }
    */

    public Puerta[] getPuertas() {
        return puertas;
    }
}
