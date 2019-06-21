package LD;

import java.sql.*;

import static LD.clsConstantesBD.*;
import static LD.clsConstantesBD.PASS;

public class clsDatos {

    private Connection objConexion = null;
    private PreparedStatement objStatements = null;
    private ResultSet objRS = null;


    public clsDatos(Connection objConexion, PreparedStatement objStatements, ResultSet objRS) {
        this.objConexion = objConexion;
        this.objStatements = objStatements;
        this.objRS = objRS;
    }


    public clsDatos() {

    }

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

    public int insertarIdElectrodomestico(String _marca, String _tipo, int _precio, String _descripcion) throws Exception {
        Object[] parametros = {_marca, _tipo, _precio, _descripcion};
        return clsElectrodomesticoBD.insertarElectrodomestico(objConexion, objStatements, objRS, parametros);
    }

    public void eliminarElectrodomestico(int _id) throws SQLException {
        clsElectrodomesticoBD.deleteElctrodomestico(objConexion, objStatements, objRS, _id);
    }


    public ResultSet dameParametros() {
        return clsElectrodomesticoBD.consultaElectrodomestico(objConexion, objStatements, objRS);
    }
}
