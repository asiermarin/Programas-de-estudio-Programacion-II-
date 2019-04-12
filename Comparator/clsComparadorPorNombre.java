package Comparator;

import java.util.Comparator;

public class clsComparadorPorNombre implements Comparator<clsPersonas> {

	@Override
	public int compare(clsPersonas p1, clsPersonas p2) { // Metodo que permite comparar personas
		if (p1.getNombre().compareTo(p2.getNombre()) == 0) {// En caso de tener mismo nombre, que compare apellido
			return p1.getApellido().compareTo(p2.getApellido());
		} else { 
			return p1.getNombre().compareTo(p2.getNombre());
		}
	}

}
