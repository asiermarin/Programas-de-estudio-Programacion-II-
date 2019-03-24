package com.company.LN;

public class clsPiloto extends clsEscuderia {

    public clsPiloto(String nombre_e, int puntos_e, String nombre_p, int puntos_p) {
        super(nombre_e, puntos_e);
        this.nombrePiloto = nombre_p;
        this.puntosPiloto = puntos_p;
    }

    public String getNombrePiloto() {
        return nombrePiloto;
    }

    public void setNombrePiloto(String nombrePiloto) {
        this.nombrePiloto = nombrePiloto;
    }

    public int getPuntosPiloto() {
        return puntosPiloto;
    }

    public void setPuntosPiloto(int puntosPiloto) {
        this.puntosPiloto = puntosPiloto;
    }

    private String nombrePiloto;
    private int puntosPiloto;



}
