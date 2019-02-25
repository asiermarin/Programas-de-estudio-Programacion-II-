package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int[][] objRobot = new int[10][10];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int x = 0;
        int y = 0;

        visualizarRobot();


    }

    public static void visualizarRobot() {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                System.out.format("%3d",objRobot[i][j]);
            }
            System.out.println();
        }
    }
}


