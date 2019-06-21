package COMUN;

public class ViviendaRepetidaException extends Exception {

    private String codigo;
    private int habitaciones;
    private int metros;


    public ViviendaRepetidaException(String codigo, int habitaciones, int metros) {
        this.codigo = codigo;
        this.habitaciones = habitaciones;
        this.metros = metros;
    }

    @Override
    public String getMessage() {
        return "vivienda repetida con codigo: "+codigo+" habitaciones: "+ habitaciones+ " y metros: "+metros;
    }
}
