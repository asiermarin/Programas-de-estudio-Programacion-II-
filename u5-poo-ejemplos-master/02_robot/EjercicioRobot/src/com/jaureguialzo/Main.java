package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Robot robbie = new Robot(0, 0);

        do {
            System.out.println(robbie);

            System.out.print("dx: ");
            int dx = Integer.parseInt(br.readLine());

            System.out.print("dy: ");
            int dy = Integer.parseInt(br.readLine());

            robbie.mover(dx, dy);
        } while (true);

    }

}
