package com.company.LN;

import com.company.COMUN.itfProperty;

import static com.company.COMUN.clsConstantes.*;


public class clsViviendaMovil extends clsViviendaTradicional implements itfProperty {

    private int precio;
    private String descripcion;
    private int metros_terreno;

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

    public int getMetros_terreno() {
        return metros_terreno;
    }

    public void setMetros_terreno(int metros_terreno) {
        this.metros_terreno = metros_terreno;
    }

    public clsViviendaMovil(int id, String cod_vivienda, int precio, String descripcion, int habitaciones, int metros, int metros_terreno) {
        super(id, cod_vivienda, habitaciones, metros);
        this.precio = precio;
        this.descripcion = descripcion;
        this.metros_terreno = metros_terreno;
    }

    public clsViviendaMovil(String cod_vivienda, int precio, String descripcion, int habitaciones, int metros, int metros_terreno) {
        super(cod_vivienda, habitaciones, metros);
        this.precio = precio;
        this.descripcion = descripcion;
        this.metros_terreno = metros_terreno;
    }

    public clsViviendaMovil() {
    }

    public Object getPropertyV(String Propiedad) {
        switch (Propiedad) {
            case VIVIENDAM_PRECIO:
                return precio;
            case VIVIENDAM_DESCRIPCION:
                return descripcion;
            case VIVIENDA_M_METROS_TERRENO:
                return metros_terreno;
            default:
                return super.getPropertyV(Propiedad);

        }
    }

}
