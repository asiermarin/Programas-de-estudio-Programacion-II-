package LN;

import java.util.Comparator;

public class clsElectrodomesticoMarca implements Comparator<clsElectrodomestico> {

    @Override
    public int compare(clsElectrodomestico obj1, clsElectrodomestico obj2) {
        return obj1.getMarca().compareTo(obj2.getMarca());
    }
}
