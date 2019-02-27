package com.jaureguialzo;

public class Grupo {

    // Propiedades
    private String codigo;

    // Asociación
    private Alumno[] alumnos = new Alumno[5];

    public Grupo() {
        for (int i = 0; i < 5; i++) {
            alumnos[i] = new Alumno();
            alumnos[i].setGrupo(this);
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
