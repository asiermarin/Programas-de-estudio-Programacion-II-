package Comparator;

import java.util.Comparator;

public class clsComparadorPorEdad implements Comparator<clsPersonas> {

	@Override
	public int compare(clsPersonas p1, clsPersonas p2) { // Compara y ordena de menor a mayor
		return p1.getEdad() - (p2.getEdad());
	}
}
