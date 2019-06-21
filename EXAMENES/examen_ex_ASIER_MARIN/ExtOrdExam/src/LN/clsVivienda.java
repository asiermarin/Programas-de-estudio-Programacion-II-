package LN;

import COMUN.PropiedadInexistente;
import COMUN.itfProperty;

import javax.print.DocFlavor;
import java.util.Objects;

import static COMUN.clsConstantes.*;

public class clsVivienda implements itfProperty {

    private int id;
    private String cod_vivienda;
    private int precio;
    private String descripcion;
    private int habitaciones;
    private int metros;
    private int metros_terreno;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCod_vivienda() {
        return cod_vivienda;
    }

    public void setCod_vivienda(String cod_vivienda) {
        this.cod_vivienda = cod_vivienda;
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

    public int getMetros_terreno() {
        return metros_terreno;
    }

    public void setMetros_terreno(int metros_terreno) {
        this.metros_terreno = metros_terreno;
    }

    public clsVivienda(int id, String cod_vivienda, int precio, String descripcion, int habitaciones, int metros, int metros_terreno) {
        this.id = id;
        this.cod_vivienda = cod_vivienda;
        this.precio = precio;
        this.descripcion = descripcion;
        this.habitaciones = habitaciones;
        this.metros = metros;
        this.metros_terreno = metros_terreno;
    }

    public clsVivienda(String cod_vivienda, int precio, String descripcion, int habitaciones, int metros, int metros_terreno) {
        this.cod_vivienda = cod_vivienda;
        this.precio = precio;
        this.descripcion = descripcion;
        this.habitaciones = habitaciones;
        this.metros = metros;
        this.metros_terreno = metros_terreno;
    }

    public clsVivienda() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        clsVivienda that = (clsVivienda) o;
        return habitaciones == that.habitaciones &&
                metros == that.metros &&
                Objects.equals(cod_vivienda, that.cod_vivienda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cod_vivienda, habitaciones, metros);
    }


    @Override
    public Object getPropertyV(String Propiedad) {
        switch (Propiedad) {
            case VIVIENDA_ID:
                return id;
            case VIVIENDA_CODIGO:
                return cod_vivienda;
            case VIVIENDA_PRECIO:
                return precio;
            case VIVIENDA_DESCRIPCION:
                return descripcion;
            case VIVIENDA_HABITACIONES:
                return habitaciones;
            case VIVIENDA_METROS:
                return metros;
            case VIVIENDA_METROS_TERRENO:
                return metros_terreno;
            default:
                throw new PropiedadInexistente(Propiedad);
        }

    }
}
