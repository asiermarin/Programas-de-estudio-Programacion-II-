package LN;

import COMUN.ViviendaRepetidaException;
import COMUN.itfProperty;
import LD.clsDatos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import static COMUN.clsConstantes.*;

public class clsGestor {

    private clsDatos objDatos = new clsDatos();
    private ArrayList<clsVivienda> listaViviendasIntroducir = new ArrayList<>();
    private HashSet<clsVivienda> viviendasDistintos = new HashSet<>(); //ArrayList de BD para comprobar los objetos existentes
    private ResultSet viviendasBD;

    public void altaVivienda(String _codigo_vivienda, int _precio, String _descripcion,
                             int _habitaciones, int _metros, int _metrosTerreno) throws ViviendaRepetidaException {

        clsVivienda objVivienda = null;


        objVivienda = new clsVivienda(_codigo_vivienda, _precio,
                _descripcion, _habitaciones, _metros, _metrosTerreno);

        if (viviendasDistintos.add(objVivienda)) {
            listaViviendasIntroducir.add(objVivienda);
            try {
                objDatos.conectarBD();
                objVivienda.setId(objDatos.insertarVivienda(_codigo_vivienda, _precio,
                        _descripcion, _habitaciones, _metros, _metrosTerreno));
                objDatos.desconectarBD();
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            throw new ViviendaRepetidaException(_codigo_vivienda, _habitaciones, _metros);
        }
    }

    public void cargarViviendas() {
        try {
            objDatos.conectarBD();
            viviendasBD = objDatos.dameParametros();
            while (viviendasBD.next()) {
                int id = viviendasBD.getInt(VIVIENDA_ID);
                String codigo_vivienda = viviendasBD.getString(VIVIENDA_CODIGO);
                int precio = viviendasBD.getInt(VIVIENDA_PRECIO);
                String descripcion = viviendasBD.getString(VIVIENDA_DESCRIPCION);
                int habitaciones = viviendasBD.getInt(VIVIENDA_HABITACIONES);
                int metros = viviendasBD.getInt(VIVIENDA_METROS);
                int metros_terreno = viviendasBD.getInt(VIVIENDA_METROS_TERRENO);


                clsVivienda objViviendaM = new clsVivienda(id, codigo_vivienda,
                        precio, descripcion, habitaciones, metros, metros_terreno);
                viviendasDistintos.add(objViviendaM);

            }
            objDatos.desconectarBD();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public ArrayList<itfProperty> leerViviendas() {

        ArrayList<clsVivienda> listaViviendas = new ArrayList<>(viviendasDistintos);

        ArrayList<itfProperty> rViviendas = new ArrayList<>();

        for (clsVivienda vivienda : listaViviendas) {
            rViviendas.add(vivienda);
        }
        return rViviendas;
    }

    public ArrayList<itfProperty> leerViviendasMetros() {

        ArrayList<clsVivienda> listaViviendas = new ArrayList<>(viviendasDistintos);

        clsViviendaMetros viviendaMetros = new clsViviendaMetros();

        Collections.sort(listaViviendas, viviendaMetros);


        ArrayList<itfProperty> rViviendas = new ArrayList<>();

        for (clsVivienda vivienda : listaViviendas) {
            rViviendas.add(vivienda);
        }
        return rViviendas;
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
