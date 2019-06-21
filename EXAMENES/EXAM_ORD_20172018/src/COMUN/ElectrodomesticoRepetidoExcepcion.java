package COMUN;


public class ElectrodomesticoRepetidoExcepcion extends Throwable {

    private String marca;
    private String tipo;

    public ElectrodomesticoRepetidoExcepcion(String marca, String tipo) {
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getMessage() {
        return "electrodomestico repetido de la marca "+marca+" tipo "+tipo;
    }
}

