package com.company.LD;

import java.sql.*;

import static com.company.LD.clsConstantesBD.*;

public class clsDatos {

    private Connection objConexion = null;
    private PreparedStatement objStatements = null;
    private ResultSet objRS = null;

    public Connection conectarBD() throws SQLException, ClassNotFoundException {

        try {

            Class.forName(DRIVER).newInstance();
            objConexion = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ignored) {
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return objConexion;
    }

    public void desconectarBD() throws SQLException {
        objConexion.close();
    }


    public int insertarVivienda(String codigo_vivienda, int precio, String descripcion, int habitaciones, int metros, int metros_terreno) {
        Object[] parametrosViviendaM = {codigo_vivienda, precio, descripcion, habitaciones, metros, metros_terreno};
        return clsViviendaBD.insertVivienda(objConexion, objStatements, objRS, parametrosViviendaM);
    }

    public void eliminarVivienda(int _id) throws SQLException {
        clsViviendaBD.deleteVivienda(objConexion, objStatements, objRS, _id);
    }


    public ResultSet dameParametros() {
        return clsViviendaBD.consultaVivienda(objConexion, objStatements, objRS);
    }


}
