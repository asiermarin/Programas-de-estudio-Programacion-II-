package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class clsCreacionPersonas {

	public static void main(String[] args) {

		clsPersonas p1 = new clsPersonas("Jesus", "Baldomero", 77, 1.67);
		clsPersonas p2 = new clsPersonas("Hortensia", "Ramirez", 65, 1.68);
		clsPersonas p3 = new clsPersonas("Xabier", "Tolano", 32, 1.96);
		clsPersonas p4 = new clsPersonas("Rogelio", "Tolosa", 23, 1.80);
		clsPersonas p5 = new clsPersonas("Raul", "Beltran", 43, 1.65);
		clsPersonas p6 = new clsPersonas("Martina", "Rodriguez", 44, 1.86);
		clsPersonas p7 = new clsPersonas("Ainhoa", "Serna", 21, 1.75);
		clsPersonas p8 = new clsPersonas("Oscar", "Areitio", 58, 1.79);
		clsPersonas p9 = new clsPersonas("Omar", "Estebanez", 27, 1.62);
		clsPersonas p10 = new clsPersonas("Fran", "Alba", 62, 1.70);
		clsPersonas p11 = new clsPersonas("Julen", "Fuente", 21, 1.84);
		clsPersonas p12 = new clsPersonas("Jorge", "Martiarena", 44, 1.74);
		clsPersonas p13 = new clsPersonas("Amaia", "Saenz", 42, 1.67);
		clsPersonas p14 = new clsPersonas("Isabel", "Campillo", 29, 1.59);
		clsPersonas p15 = new clsPersonas("Fran", "Aizpurua", 53, 1.87);
		clsPersonas p16 = new clsPersonas("Maite", "Ibisate", 43, 1.65);
		clsPersonas p17 = new clsPersonas("Eugenio", "Frondoso", 83, 1.64);
		clsPersonas p18 = new clsPersonas("Fernando", "Goikoetxea", 44, 1.98);
		clsPersonas p19 = new clsPersonas("Olga", "Tolagua", 66, 1.77);
		clsPersonas p20 = new clsPersonas("Marina", "Sanchez", 39, 1.61);

		List<clsPersonas> listadoTrabajadores = new ArrayList<clsPersonas>();

		listadoTrabajadores.add(p1);
		listadoTrabajadores.add(p2);
		listadoTrabajadores.add(p3);
		listadoTrabajadores.add(p4);
		listadoTrabajadores.add(p5);
		listadoTrabajadores.add(p6);
		listadoTrabajadores.add(p7);
		listadoTrabajadores.add(p8);
		listadoTrabajadores.add(p9);
		listadoTrabajadores.add(p10);
		listadoTrabajadores.add(p11);
		listadoTrabajadores.add(p12);
		listadoTrabajadores.add(p13);
		listadoTrabajadores.add(p14);
		listadoTrabajadores.add(p15);
		listadoTrabajadores.add(p16);
		listadoTrabajadores.add(p17);
		listadoTrabajadores.add(p18);
		listadoTrabajadores.add(p19);
		listadoTrabajadores.add(p20);

		System.out.println("LISTADO DE TRABAJADORES: ");
		System.out.println();
		System.out.println(listadoTrabajadores);
		System.out.println();
	
		clsComparadorPorNombre comp = new clsComparadorPorNombre();

		Collections.sort(listadoTrabajadores, comp);

		System.out.println("Los trabajadores ordenados por nombre son: ");
		System.out.println();
		System.out.println(listadoTrabajadores);

		clsComparadorPorEdad comp2 = new clsComparadorPorEdad();

		Collections.sort(listadoTrabajadores, comp2);

		System.out.println("Los trabajadores ordenados por edad son: ");
		System.out.println();
		System.out.println(listadoTrabajadores);

		clsComparadorPorAltura comp3 = new clsComparadorPorAltura();

		Collections.sort(listadoTrabajadores, comp3);

		System.out.println("Los trabajadores ordenados por altura son: ");
		System.out.println();
		System.out.println(listadoTrabajadores);

	}

}
