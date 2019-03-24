package com.company.LN;

public class clsIngeniero extends clsEscuderia{

    private String nombreIngeniero;

    public String getNombreIngeniero() {
        return nombreIngeniero;
    }

    public void setNombreIngeniero(String nombreIngeniero) {
        this.nombreIngeniero = nombreIngeniero;
    }

    public clsIngeniero(String nombre_E, int puntos_E, String nombre_I) {
        super(nombre_E, puntos_E);

        this.nombreIngeniero = nombre_I;
    }



}
