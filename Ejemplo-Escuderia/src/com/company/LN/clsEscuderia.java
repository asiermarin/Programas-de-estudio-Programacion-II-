package com.company.LN;

public class clsEscuderia {


    public clsEscuderia(String nombre_e, int puntos_e) {

        this.nombreEscuderia = nombre_e;
        this.puntosEscuderia = puntos_e;
    }

    public clsEscuderia(){

    }

    public String getNombreEscuderia() {
        return nombreEscuderia;
    }

    public void setNombreEscuderia(String nombreEscuderia) {
        this.nombreEscuderia = nombreEscuderia;
    }

    public int getPuntosEscuderia() {
        return puntosEscuderia;
    }

    public void setPuntosEscuderia(int puntosEscuderia) {
        this.puntosEscuderia = puntosEscuderia;
    }

    private String nombreEscuderia;
    private int puntosEscuderia;



}
