package LD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import static LD.constantesBD.*;


/**
 * Clase encargada de gestionar comunicacion entre LD y LN
 */
public class clsDatos extends Conexion{
    /**
     * Atributo de conexion con la BBDD
     */
    private Connection con;


    /**
     * Metodo empleado para conectarnos con la BD
     *
     * @throws SQLException throws Exception
     */
    public void conectarBD() throws SQLException {
        //Ruta de la base de datos (jdbc:mysql://localhost:3306/alumnoBD?useTimezone=true&serverTimezone=GMT&useSSL=false)
        String url = "jdbc:mysql://" + DIRECCION + ":" + PUERTO + "/" + NAME + "?useTimezone=true&serverTimezone=GMT&useSSL=false&allowPublicKeyRetrieval=true";
        con = DriverManager.getConnection(url, USUARIO, PASS);

    }

    /**
     * Metodo para desconectarnos de la BD
     *
     * @throws SQLException throws SQLException
     */
    public void desconectarBD() throws SQLException {
        con.close();
    }

    public void insertarVivienda(String codigo, int precio, String descripcion, int habitaciones, int metros, int metros_terreno) throws Exception {
        Object[] params={codigo, precio, descripcion, habitaciones, metros,metros_terreno};
        insert(con,"insert into vivienda values(?,?,?,?,?,?)",params);
    }
    public ResultSet selectViviendas() throws Exception {
        return select(con,"SELECT * FROM vivienda");
    }


}