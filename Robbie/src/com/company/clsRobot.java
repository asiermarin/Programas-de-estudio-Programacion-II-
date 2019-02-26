package com.company;

public class clsRobot {

    private int dX = 0;
    private int dY = 0;


    public clsRobot(int x, int y) {

        this.dX = x;
        this.dY = y;

    }

    //Para visualizar las coordenadas del robot
    @Override
    public String toString() {
        return "clsRobot{" +
                "dX=" + dX +
                ", dY=" + dY +
                '}';
    }

    public static void visualizarTablero() {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                System.out.print(".  ");
            }
            System.out.println();
        }

        System.out.println();

    }



}
