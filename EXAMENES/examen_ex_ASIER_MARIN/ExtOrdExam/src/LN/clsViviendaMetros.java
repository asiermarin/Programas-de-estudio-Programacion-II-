package LN;

import java.util.Comparator;

public class clsViviendaMetros implements Comparator<clsVivienda> {

    @Override
    public int compare(clsVivienda vivienda1, clsVivienda vivienda2) {
        return vivienda2.getMetros_terreno() - vivienda1.getMetros_terreno(); // En este caso de forma descendente por ejemplo
    }
}
