package com.company.LP;

import com.company.COMUN.ViviendaRepetidaException;
import com.company.LN.clsGestor;


import javax.swing.*;
import java.util.ArrayList;

import static com.company.COMUN.clsConstantes.TIPO_MOVIL;
import static com.company.COMUN.clsConstantes.TIPO_TRADICIONAL;

public class inmobiliaria {

    private clsGestor objGestor = new clsGestor();
   // private ArrayList<itfProperty> viviendas;

    public void inicio(){

        cargar();
        //sumarVivienda();
        //quitarVivienda();

    }

    /**
     * Aqui se definen los datos que habrá en la base de datos en caso de ser movil o tradicional
     */
    public void sumarVivienda(){

        try {
            objGestor.altaVivienda(TIPO_MOVIL, "2", 12, "Una mierda", 3, 34, 18);
            objGestor.altaVivienda(TIPO_TRADICIONAL, "9", 0, "sin descripcion", 3, 34, -1);
        } catch (ViviendaRepetidaException ex) {
            //JOptionPane.showMessageDialog(this, ex.getMessage());
            ex.printStackTrace();
        }

    }

    private void cargar(){

        try {
            objGestor.cargarViviendas();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void quitarVivienda(){
        int id = 1;
        objGestor.eliminarVivienda(id);
    }

}
