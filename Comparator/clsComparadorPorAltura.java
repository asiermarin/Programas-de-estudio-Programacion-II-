	package Comparator;

import java.util.Comparator;

public class clsComparadorPorAltura implements Comparator<clsPersonas> {

	@Override
	public int compare(clsPersonas p1, clsPersonas p2) {
		Double a;	
		Double b;
		a=p1.getAltura();
		b=p2.getAltura();
		return a.compareTo(b);
//		if (p1.getAltura() < (p2.getAltura())) {
//			return -1;
//		} else if (p1.getAltura() > (p2.getAltura())) {
//			return 1;
//		} else
//			return 0;

	}
}
