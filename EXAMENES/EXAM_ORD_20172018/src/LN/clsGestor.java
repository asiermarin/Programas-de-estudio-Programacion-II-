package LN;

import COMUN.ElectrodomesticoRepetidoExcepcion;
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
    private HashSet<clsElectrodomestico> electrodomesticosDistintos = new HashSet<>();
    private ArrayList<clsElectrodomestico> listaElectrodomesticos;
    private ResultSet electrodomesticosBaseDatos;

    public clsGestor() {

    }

    public void altaElectrodomestico(String marca, String tipo, int precio, String descripcion) throws ElectrodomesticoRepetidoExcepcion {

        clsElectrodomestico objElectrodomestico = new clsElectrodomestico(marca, tipo, precio, descripcion);

        if (electrodomesticosDistintos.add(objElectrodomestico)) {

            try {
                objDatos.conectarBD();
                objElectrodomestico.setId(objDatos.insertarIdElectrodomestico(marca, tipo, precio, descripcion));
                objDatos.desconectarBD();

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            throw new ElectrodomesticoRepetidoExcepcion(marca, tipo);
        }
    }

    public void cargarElectrodomesticos() {

        try {
            objDatos.conectarBD();

            electrodomesticosBaseDatos = objDatos.dameParametros();

            while (electrodomesticosBaseDatos.next()) {
                int id = electrodomesticosBaseDatos.getInt(ELEC_ID);
                String marca = electrodomesticosBaseDatos.getString(ELEC_MARCA);
                String tipo = electrodomesticosBaseDatos.getString(ELEC_TIPO);
                int precio = electrodomesticosBaseDatos.getInt(ELEC_PRECIO);
                String descripcion = electrodomesticosBaseDatos.getString(ELEC_DESCRIPCION);

                clsElectrodomestico objElectrodomestico = new clsElectrodomestico(id, marca, tipo, precio, descripcion);
                electrodomesticosDistintos.add(objElectrodomestico);
            }
            objDatos.desconectarBD();
        } catch (SQLException | ClassNotFoundException e) {e.printStackTrace();
        }
    }

    public ArrayList<itfProperty> leerElectrodomesticos (int codigo) {

        listaElectrodomesticos = new ArrayList<>(electrodomesticosDistintos);

        if (codigo == 1) {
            clsElectrodomesticoMarca objEMarca = new clsElectrodomesticoMarca();
            Collections.sort(listaElectrodomesticos, objEMarca);
        } else if (codigo == 2){
            clsElectrodomesticoTipo objETipo = new clsElectrodomesticoTipo();
            Collections.sort(listaElectrodomesticos, objETipo);
        }else {
            // no se hace nada
        }

        ArrayList<itfProperty> rViviendas = new ArrayList<>();

        for (clsElectrodomestico vivienda : listaElectrodomesticos) {
            rViviendas.add(vivienda);
        }
        return rViviendas;
    }

    public void eleminarElectrodomestico(int id){
        try {
            objDatos.conectarBD();
            objDatos.eliminarElectrodomestico(id);
            objDatos.desconectarBD();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
