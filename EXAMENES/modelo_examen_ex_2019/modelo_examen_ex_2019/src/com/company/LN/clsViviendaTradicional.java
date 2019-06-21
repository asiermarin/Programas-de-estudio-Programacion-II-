package com.company.LN;

import com.company.COMUN.PropiedadInexistente;
import com.company.COMUN.itfProperty;

import java.util.Objects;

import static com.company.COMUN.clsConstantes.*;


public class clsViviendaTradicional implements itfProperty {

    private int id_vivienda;
    private String cod_vivienda;
    private int habitaciones;
    private int metros;

    public int getId() {
        return id_vivienda;
    }

    public void setId(int id) {
        this.id_vivienda = id;
    }

    public String getCod_vivienda() {
        return cod_vivienda;
    }

    public void setCod_vivienda(String cod_vivienda) {
        this.cod_vivienda = cod_vivienda;
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

    public clsViviendaTradicional(int id, String cod_vivienda, int habitaciones, int metros) {
        this.id_vivienda = id;
        this.cod_vivienda = cod_vivienda;
        this.habitaciones = habitaciones;
        this.metros = metros;
    }

    public clsViviendaTradicional(String cod_vivienda, int habitaciones, int metros) {
        this.cod_vivienda = cod_vivienda;
        this.habitaciones = habitaciones;
        this.metros = metros;
    }

    public clsViviendaTradicional() {
    }


    @Override
    public Object getPropertyV(String Propiedad) {

        switch (Propiedad) {
            case VIVIENDAT_ID:
                return id_vivienda;
            case VIVIENDAT_CODIGO:
                return cod_vivienda;
            case VIVIENDAT_HABITACIONES:
                return habitaciones;
            case VIVIENDAT_METROS:
                return metros;
            default:
                throw new PropiedadInexistente(Propiedad);

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        clsViviendaTradicional that = (clsViviendaTradicional) o;
        return habitaciones == that.habitaciones &&
                Objects.equals(cod_vivienda, that.cod_vivienda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cod_vivienda, habitaciones);
    }
}
