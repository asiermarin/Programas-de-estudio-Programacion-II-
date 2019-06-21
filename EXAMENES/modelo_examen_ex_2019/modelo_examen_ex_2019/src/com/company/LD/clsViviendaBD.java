package com.company.LD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.company.LD.clsConstantesBD.INSERT_VIVIENDA_MOVIL;
import static com.company.LD.clsConstantesBD.SELECT_VIVIENDA;

public class clsViviendaBD {

    public static int insertVivienda(Connection objCon, PreparedStatement objStat, ResultSet objRS, Object[] parametrosViviendaM) {

        int regActualizada = 0;
        int idP = 0;

        try {
            objStat = objCon.prepareStatement(INSERT_VIVIENDA_MOVIL, PreparedStatement.RETURN_GENERATED_KEYS);



            objStat.setString(1,(String) parametrosViviendaM[0] ); //codigo
            objStat.setInt(2, (Integer) parametrosViviendaM[1]); //precio
            objStat.setString(3, (String) parametrosViviendaM[2]);//descripcion
            objStat.setInt(4, (Integer) parametrosViviendaM[3]);//habitaciones
            objStat.setInt(5, (Integer) parametrosViviendaM[4]);//metros
            objStat.setInt(6, (Integer) parametrosViviendaM[5]);//metros terreno

            regActualizada = objStat.executeUpdate();

            if (regActualizada == 1) {

                objRS = objStat.getGeneratedKeys();

                if (objRS.next()) {

                    idP = objRS.getInt(1);
                }
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return idP;
    }

    public static void deleteVivienda(Connection objConexion, PreparedStatement objStatements, ResultSet objRS, int id) {


    }

    public static ResultSet consultaVivienda(Connection _objCon, PreparedStatement _objStat, ResultSet _objRS) {

        try {
            _objStat = _objCon.prepareStatement(SELECT_VIVIENDA);
            _objRS = _objStat.executeQuery(SELECT_VIVIENDA);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return _objRS;
    }

}
