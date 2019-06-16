package LN;

import comun.PropiedadInexistente;
import comun.itfPersistable;
import comun.itfProperty;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

import static comun.clsConstantes.*;

public class Tradicional  implements itfProperty , itfPersistable,Comparable<Tradicional> {
    private  String codigo;
    private int precio;
    private String descripcion;
    private int habitaciones;
    private int metros;


    public boolean sicncronizada;

    public Tradicional() {
    }

    public Tradicional(String codigo, int precio, String descripcion, int habitaciones, int metros) {
        this.codigo = codigo;
        this.precio = precio;
        this.descripcion = descripcion;
        this.habitaciones = habitaciones;
        this.metros = metros;
        this.sicncronizada=false;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tradicional)) return false;
        Tradicional that = (Tradicional) o;
        return codigo.equals(that.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public Object getProperty(String prop) {
        switch (prop){
            case VIVIENDA_CODIGO:return this.codigo;
            case VIVIENDA_PRECIO:return this.precio;
            case VIVIENDA_DESC:return this.descripcion;
            case VIVIENDA_HAB:return this.habitaciones;
            case VIVIENDA_METROS:return this.metros;
            default: throw new PropiedadInexistente(prop);

        }
    }

    @Override
    public void loadResulstSet(ResultSet rs) throws Exception {

        this.codigo = rs.getString(BD_VIVIENDA_CODIGO);

        this.precio = rs.getInt(BD_VIVIENDA_PRECIO);
        this.descripcion = rs.getString(BD_VIVIENDA_DESC);

        this.habitaciones = rs.getInt(BD_VIVIENDA_HAB);
        this.metros  =rs.getInt(BD_VIVIENDA_METROS);
        this.sicncronizada=true;

    }

    @Override
    public int compareTo(Tradicional o) {
        return this.codigo.compareTo(o.codigo);
    }
}
