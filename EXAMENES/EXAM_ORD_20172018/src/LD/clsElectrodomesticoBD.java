package LD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static LD.clsConstantesBD.*;

public class clsElectrodomesticoBD {
    public static int insertarElectrodomestico(Connection objCon, PreparedStatement objStat, ResultSet objRS, Object[] parametros) throws SQLException {

        int regActualizada = 0;
        int idP = 0;

        objStat = objCon.prepareStatement(INSERT_ELEC, PreparedStatement.RETURN_GENERATED_KEYS);

        objStat.setString(1, (String) parametros[0]); //marca
        objStat.setString(2,(String) parametros [1]); //tipo
        objStat.setInt(3, (Integer) parametros [2]);//precio
        objStat.setString(4, (String) parametros [3]);//descripcion

        regActualizada = objStat.executeUpdate();


        if (regActualizada == 1) {

            objRS = objStat.getGeneratedKeys();

            if (objRS.next()) {

                idP = objRS.getInt(1);
            }
        }
        return idP;

    }

    public static void deleteElctrodomestico(Connection objCon, PreparedStatement objStat, ResultSet objRS, int id) {

        try {
            objStat = objCon.prepareStatement(DELETE_ELECTRODOMESTICO);

            objStat.setInt(1, id);//usuarios_codigo_aleatorio

            objStat.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ResultSet consultaElectrodomestico(Connection _objCon, PreparedStatement _objStat, ResultSet _objRS) {
        try {
            _objStat = _objCon.prepareStatement(SELECT_ELEC);
            _objRS = _objStat.executeQuery(SELECT_ELEC);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return _objRS;
    }
}
