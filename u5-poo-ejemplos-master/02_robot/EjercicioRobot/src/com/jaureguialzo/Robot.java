package com.jaureguialzo;

public class Robot {

    private int x;  // = 0;
    private int y;  // = 0;

    public Robot() {
        x = 0;
        y = 0;
    }

    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void mover(int dx, int dy) {

        // Comprobar si el desplazamiento es válido
        // Comprobar si estamos dentro del "tablero"
        if (dx >= -1 && dx <= 1 &&
                dy >= -1 && dy <= 1 &&
                (dx == 0 || dy == 0) &&
                x > -10 && x < 10 &&
                y > -10 && y < 10
        ) {
            x += dx;
            y += dy;
        }

    }

    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
