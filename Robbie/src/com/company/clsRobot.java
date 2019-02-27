package com.company;

public class clsRobot {

    //Propiedades
    private int x = 0;
    private int y = 0;

    public void mover(int dx, int dy) {

        x = dx;
        y = dy;
    }

    //Para visualizar las coordenadas del robot
    @Override
    public String toString() {
        return "clsRobot{" +
                "dX=" + x +
                ", dY=" + y +
                '}';
    }

    //Para visualizar el tablero
    public void visualizarTablero() {

        for (int i = -5; i <= 5; i++) {
            for (int j = -5; j <= 5; j++) {

                if (i == x && j == y) {
                    System.out.print("R  ");
                } else {
                    System.out.print(".  ");
                }
            }
            System.out.println();
        }
    }
}
