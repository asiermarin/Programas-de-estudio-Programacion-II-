package com.company.LN;

import com.company.COMUN.ViviendaRepetidaException;
import com.company.LD.clsDatos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;

import static com.company.COMUN.clsConstantes.*;

public class clsGestor {


    private clsDatos objDatos = new clsDatos();
    private ArrayList<clsViviendaTradicional> listaViviendasIntroducir = new ArrayList<>();
    private HashSet<clsViviendaTradicional> viviendasDistintos = new HashSet<>(); //ArrayList de BD para comprobar los objetos existentes
    private ResultSet viviendasBD;

    public void altaVivienda(int tipo, String _codigo_vivienda, int _precio, String _descripcion,
                             int _habitaciones, int _metros, int _metrosTerreno) throws ViviendaRepetidaException {

        clsViviendaTradicional objViviendaT = null;
        clsViviendaMovil objViviendaM = null;

        if (tipo == TIPO_MOVIL) {

            objViviendaM = new clsViviendaMovil(_codigo_vivienda, _precio,
                    _descripcion, _habitaciones, _metros, _metrosTerreno);

            if (viviendasDistintos.add(objViviendaM)) {
                listaViviendasIntroducir.add(objViviendaM);
                try {
                    objDatos.conectarBD();
                    objViviendaM.setId(objDatos.insertarVivienda(_codigo_vivienda, _precio,
                            _descripcion, _habitaciones, _metros, _metrosTerreno));
                    objDatos.desconectarBD();
                } catch (SQLException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            } else {
                throw new ViviendaRepetidaException(_codigo_vivienda);
            }

        } else {

            objViviendaT = new clsViviendaTradicional(_codigo_vivienda
                    , _habitaciones, _metros);

            if (viviendasDistintos.add(objViviendaT)) {
                listaViviendasIntroducir.add(objViviendaT);

                try {

                    objDatos.conectarBD();
                    objViviendaT.setId(objDatos.insertarVivienda(_codigo_vivienda, _precio,
                            _descripcion, _habitaciones, _metros, _metrosTerreno));
                    objDatos.desconectarBD();

                } catch (SQLException | ClassNotFoundException e) {
                    e.printStackTrace();
                }

            } else {
                throw new ViviendaRepetidaException(_codigo_vivienda);
            }
        }
    }

    public void anadirVivienda() {
        try {
            objDatos.conectarBD();

            for (clsViviendaTradicional vivienda : listaViviendasIntroducir) {

                int precio = 0;
                String descripcion = null;
                int metro_terreno = 0;

                if (vivienda instanceof clsViviendaMovil) {
                    precio = ((clsViviendaMovil) vivienda).getPrecio();
                    descripcion = ((clsViviendaMovil) vivienda).getDescripcion();
                    metro_terreno = ((clsViviendaMovil) vivienda).getMetros_terreno();
                } else {
                    descripcion = "sin decripcion";
                    metro_terreno = -1;
                }

                objDatos.insertarVivienda(vivienda.getCod_vivienda(), precio, descripcion
                        , vivienda.getHabitaciones(), vivienda.getMetros(), metro_terreno);
            }
            objDatos.desconectarBD();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        listaViviendasIntroducir.clear();
    }

    public void cargarViviendas() {
        try {
            objDatos.conectarBD();
            viviendasBD = objDatos.dameParametros();
            while (viviendasBD.next()) {
                int id = viviendasBD.getInt(VIVIENDAT_ID);
                String codigo_vivienda = viviendasBD.getString(VIVIENDAT_CODIGO);
                int precio = viviendasBD.getInt(VIVIENDAM_PRECIO);
                String descripcion = viviendasBD.getString(VIVIENDAM_DESCRIPCION);
                int habitaciones = viviendasBD.getInt(VIVIENDAT_HABITACIONES);
                int metros = viviendasBD.getInt(VIVIENDAT_METROS);
                int metros_terreno = viviendasBD.getInt(VIVIENDA_M_METROS_TERRENO);

                if (metros_terreno == -1) {
                    clsViviendaTradicional objViviendaT = new clsViviendaTradicional(id, codigo_vivienda,
                            habitaciones, metros);
                    viviendasDistintos.add(objViviendaT);
                } else {
                    clsViviendaMovil objViviendaM = new clsViviendaMovil(id, codigo_vivienda,
                            precio, descripcion, habitaciones, metros, metros_terreno);
                    viviendasDistintos.add(objViviendaM);
                }
            }
            objDatos.desconectarBD();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public void eliminarVivienda(int id) {

        try {
            objDatos.conectarBD();
            objDatos.eliminarVivienda(id);
            objDatos.desconectarBD();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
