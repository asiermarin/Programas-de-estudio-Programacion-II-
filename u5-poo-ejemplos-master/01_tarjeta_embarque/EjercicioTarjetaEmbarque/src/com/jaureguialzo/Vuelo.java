package com.jaureguialzo;

public class Vuelo {

    // Propiedades
    private String aerolinea;
    private int codigo;

    private String fecha;
    private String hora;

    private String aeropuertoOrigen = "MAD";
    private String aeropuertoDestino = "LHR";

    // Asociación
    private TarjetaEmbarque tarjetaEmbarque;

    public Vuelo() {

        aerolinea = "OA";
        codigo = 815;
        fecha = "23/05";
        hora = "7:00am";
        aeropuertoOrigen = "SYD";
        aeropuertoDestino = "SLR";

    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "aerolinea='" + aerolinea + '\'' +
                ", codigo=" + codigo +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", aeropuertoOrigen='" + aeropuertoOrigen + '\'' +
                ", aeropuertoDestino='" + aeropuertoDestino + '\'' +
                '}';
    }

}
