package com.company.LN;

import java.util.ArrayList;

public class clsGestor {

    public clsGestor() {
    }

    private ArrayList<clsEscuderia> miListaPersonas = new ArrayList<clsEscuderia>();

    public void anadirPiloto(String nombre_E, int puntos_E, String nombre_P ,int puntos_P){

        clsPiloto objPiloto = new clsPiloto(nombre_E, puntos_E, nombre_P, puntos_P);
        miListaPersonas.add(objPiloto);
    }

    public void anadirIngeniero(String nombre_E, int puntos_E,  String nombre_I){

        clsIngeniero objIngeniero = new clsIngeniero(nombre_E, puntos_E, nombre_I);
        miListaPersonas.add(objIngeniero);
    }

}


