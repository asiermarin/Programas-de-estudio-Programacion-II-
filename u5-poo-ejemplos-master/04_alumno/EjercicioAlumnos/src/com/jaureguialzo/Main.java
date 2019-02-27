package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Alumno[] curso = new Alumno[5];

/*
        for (int i = 0; i < 5; i++) {

            System.out.print("Nombre: ");
            String nombre = br.readLine();
            System.out.print("Apellido: ");
            String apellido = br.readLine();
            System.out.print("DNI: ");
            String DNI = br.readLine();
            System.out.print("Teléfono: ");
            String telefono = br.readLine();

            curso[i] = new Alumno(nombre,apellido,DNI,telefono);
        }
*/

        for (int i = 0; i < 5; i++) {

            curso[i] = new Alumno();

            System.out.print("Nombre: ");
            String nombre = br.readLine();
            curso[i].setNombre(nombre);

            System.out.print("Apellido: ");
            String apellido = br.readLine();
            curso[i].setApellido(apellido);

            System.out.print("DNI: ");
            curso[i].setDNI(br.readLine());

            System.out.print("Teléfono: ");
            String telefono = br.readLine();
            curso[i].setTelefono(telefono);
        }

        for (int i = 0; i < curso.length; i++) {
            System.out.println("Nombre: " + curso[i].getNombre());
            System.out.println("Apellido: " + curso[i].getApellido());
            System.out.println("DNI: " + curso[i].getDNI());
            System.out.println("Teléfono: " + curso[i].getTelefono());
        }

        for (int i = 0; i < curso.length; i++) {
            System.out.println(curso[i]);
        }

    }
}
