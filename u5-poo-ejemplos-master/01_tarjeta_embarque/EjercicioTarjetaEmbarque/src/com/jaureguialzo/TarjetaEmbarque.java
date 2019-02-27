package com.jaureguialzo;

public class TarjetaEmbarque {

    // Propiedades
    private String billeteElectronico = null;

    private char clase = 'T';
    private String asiento = null;

    private String puertaEmbarque = "?";

    private int numMaletas = 0;

    // Asociación
    private Pasajero pasajero;
    private Vuelo vuelo;

    public TarjetaEmbarque() {

        billeteElectronico = "3 54 4 345 345 3545";
        clase = 'C';
        asiento = "42B";
        puertaEmbarque = "23";
        numMaletas = 1;

        pasajero = new Pasajero();
        vuelo = new Vuelo();

    }

    @Override
    public String toString() {
        return "TarjetaEmbarque{" +
                "billeteElectronico='" + billeteElectronico + '\'' +
                ", clase=" + clase +
                ", asiento='" + asiento + '\'' +
                ", puertaEmbarque='" + puertaEmbarque + '\'' +
                ", numMaletas=" + numMaletas +
                ", pasajero=" + pasajero +
                ", vuelo=" + vuelo +
                '}';
    }

}
