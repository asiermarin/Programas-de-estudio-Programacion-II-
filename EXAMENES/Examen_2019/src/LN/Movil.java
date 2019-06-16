package LN;

import java.sql.ResultSet;

import static comun.clsConstantes.BD_VIVIENDA_METROS_TERRENO;
import static comun.clsConstantes.VIVIENDA_METROS_TERRENO;

public class Movil extends Tradicional{
    private int metros_terreno;

    public Movil(String codigo, int precio, String descripcion, int habitaciones, int metros, int metros_terreno) {
        super(codigo, precio, descripcion, habitaciones, metros);
        this.metros_terreno = metros_terreno;

    }

    public Movil() {
    }

    public int getMetros_terreno() {
        return metros_terreno;
    }

    public void setMetros_terreno(int metros_terreno) {
        this.metros_terreno = metros_terreno;
    }


    @Override
    public Object getProperty(String prop) {
        switch (prop){
            case VIVIENDA_METROS_TERRENO:return this.metros_terreno;
            default:return super.getProperty(prop);
        }
    }

    @Override
    public void loadResulstSet(ResultSet rs) throws Exception {
        this.metros_terreno=rs.getInt(BD_VIVIENDA_METROS_TERRENO);
        super.loadResulstSet(rs);
    }
}
