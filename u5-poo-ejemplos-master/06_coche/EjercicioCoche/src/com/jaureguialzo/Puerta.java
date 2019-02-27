package com.jaureguialzo;

public class Puerta {

    private boolean elevalunasElectrico;

    public Puerta(boolean elevalunasElectrico) {
        this.elevalunasElectrico = elevalunasElectrico;
    }

    // Asociación
    private Coche coche;

    public boolean isElevalunasElectrico() {
        return elevalunasElectrico;
    }

    public void setElevalunasElectrico(boolean elevalunasElectrico) {
        this.elevalunasElectrico = elevalunasElectrico;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }
}
