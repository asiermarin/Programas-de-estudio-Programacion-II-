package com.company;

public class Cronometro {

    private long horainicio = 0;
    private long horafinal = 0;

    public long getHorafinal() {
        return horafinal;
    }

    public void setHorafinal(long horafinal) {
        this.horafinal = horafinal;
    }

    public long getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(long horainicio) {
        this.horainicio = horainicio;
    }


    public void tiempreTranscurrido(int op, int i){

        switch (op){

            case 1:
                System.out.println(horainicio);
                break;
            case 2:
                System.out.println(horafinal);
                break;
                default:
                    System.out.println("Adios");
                    break;
        }
    }
}
