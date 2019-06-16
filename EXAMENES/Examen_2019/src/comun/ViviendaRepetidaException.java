package comun;

public class ViviendaRepetidaException extends Exception {
    private String codigo;

    public ViviendaRepetidaException(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getMessage() {
        return "codigo repetido "+codigo;
    }
}
