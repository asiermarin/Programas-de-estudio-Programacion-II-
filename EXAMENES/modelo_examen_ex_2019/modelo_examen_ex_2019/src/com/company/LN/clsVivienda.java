package com.company.LN;

public class clsVivienda {

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





}
