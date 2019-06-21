package com.company.COMUN;

public class PropiedadInexistente extends RuntimeException {
    private String propiedad;

    public PropiedadInexistente(String propiedad) {
        this.propiedad = propiedad;
    }

    @Override
    public String getMessage() {
        return this.propiedad;
    }
}
