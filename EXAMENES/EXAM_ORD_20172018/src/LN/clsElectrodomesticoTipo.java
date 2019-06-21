package LN;

import java.util.Comparator;

public class clsElectrodomesticoTipo implements Comparator<clsElectrodomestico> {

    @Override
    public int compare(clsElectrodomestico obj1, clsElectrodomestico obj2) {
        return obj1.getTipo().compareTo(obj2.getTipo());
    }

}
