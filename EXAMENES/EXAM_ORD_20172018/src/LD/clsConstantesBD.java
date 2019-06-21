package LD;

public class clsConstantesBD {

    public final static String USER = "root";
    public final static String PASS = "lossolfamidas";
    public final static String PORT = "3306";
    public final static String DATABASE = "examen_17_18";
    public final static String DIRECTION = "127.0.0.1";
    public final static String URL = "jdbc:mysql://" + DIRECTION + ":" + PORT + "/" + DATABASE + "?useTimezone=true&serverTimezone=GMT&useSSL=false&allowPublicKeyRetrieval=true";
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    public static final String SELECT_ELEC = "select*from examen_17_18.electrodomesticos";

    public static final String INSERT_ELEC = "INSERT INTO examen_17_18.electrodomesticos (marca,tipo,precio,descripcion) VALUES (?,?,?,?)";

    public static final String DELETE_ELECTRODOMESTICO = "DELETE FROM examen_17_18.electrodomesticos WHERE id = ?";

}
