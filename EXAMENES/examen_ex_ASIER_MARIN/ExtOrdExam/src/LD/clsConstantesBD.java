package LD;

public class clsConstantesBD {

    public final static String USER = "root";
    public final static String PASS = "lossolfamidas";
    public final static String PORT = "3306";
    public final static String DATABASE = "examen_ex_18_19";
    public final static String DIRECTION = "127.0.0.1";
    public final static String URL = "jdbc:mysql://" + DIRECTION + ":" + PORT + "/" + DATABASE + "?useTimezone=true&serverTimezone=GMT&useSSL=false&allowPublicKeyRetrieval=true";
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    public static final String SELECT_VIVIENDA = "SELECT * FROM examen_ex_18_19.vivienda";

    public static final String INSERT_VIVIENDA = "INSERT INTO examen_ex_18_19.vivienda (COD_VIVIENDA,PRECIO,DESCRIPCION,HABITACIONES,METROS,METROS_TERRENO) VALUES (?,?,?,?,?,?)";

    public static final String DELETE_VIVIENDA = "DELETE FROM examen_ex_18_19.vivienda WHERE id_vivienda = ?";

}
