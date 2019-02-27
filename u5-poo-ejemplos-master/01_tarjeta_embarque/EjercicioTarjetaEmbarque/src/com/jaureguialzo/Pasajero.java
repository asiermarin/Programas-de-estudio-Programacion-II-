package com.jaureguialzo;

public class Pasajero {

    // Propiedades
    private String nombre;
    private String telefono;

    // Asociación
    private TarjetaEmbarque tarjetaEmbarque;

    public Pasajero() {

        nombre = "HORITO/WHITNEY";
        telefono = "???";

    }

    @Override
    public String toString() {
        return "Pasajero{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

}
