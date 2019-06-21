package LN;

import COMUN.itfProperty;

import java.util.Objects;

import static COMUN.clsConstantes.*;

public class clsElectrodomestico implements itfProperty {

    private int id;
    private String marca;
    private String tipo;
    private int precio;
    private String descripcion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public clsElectrodomestico(int id, String marca, String tipo, int precio, String descripcion) {
        this.id = id;
        this.marca = marca;
        this.tipo = tipo;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public clsElectrodomestico(String marca, String tipo, int precio, String descripcion) {
        this.marca = marca;
        this.tipo = tipo;
        this.precio = precio;
        this.descripcion = descripcion;
    }


    public clsElectrodomestico(){

    }

    @Override
    public Object getPropertyV(String Propiedad) {

        switch (Propiedad){
            case ELEC_ID:
                return this.id;
            case ELEC_MARCA:
                return this.marca;
            case ELEC_TIPO:
                return this.precio;
            case ELEC_PRECIO:
                return this.precio;
            case ELEC_DESCRIPCION:
                return this.descripcion;
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        clsElectrodomestico that = (clsElectrodomestico) o;
        return Objects.equals(marca, that.marca) &&
                Objects.equals(tipo, that.tipo) &&
                Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, tipo, descripcion);
    }


    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     * <p>The implementor must ensure
     * {@code sgn(x.compareTo(y)) == -sgn(y.compareTo(x))}
     * for all {@code x} and {@code y}.  (This
     * implies that {@code x.compareTo(y)} must throw an exception iff
     * {@code y.compareTo(x)} throws an exception.)
     *
     * <p>The implementor must also ensure that the relation is transitive:
     * {@code (x.compareTo(y) > 0 && y.compareTo(z) > 0)} implies
     * {@code x.compareTo(z) > 0}.
     *
     * <p>Finally, the implementor must ensure that {@code x.compareTo(y)==0}
     * implies that {@code sgn(x.compareTo(z)) == sgn(y.compareTo(z))}, for
     * all {@code z}.
     *
     * <p>It is strongly recommended, but <i>not</i> strictly required that
     * {@code (x.compareTo(y)==0) == (x.equals(y))}.  Generally speaking, any
     * class that implements the {@code Comparable} interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     *
     * <p>In the foregoing description, the notation
     * {@code sgn(}<i>expression</i>{@code )} designates the mathematical
     * <i>signum</i> function, which is defined to return one of {@code -1},
     * {@code 0}, or {@code 1} according to whether the value of
     * <i>expression</i> is negative, zero, or positive, respectively.
     *
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     */

    /**
    @Override
    public int compareTo(clsElectrodomestico o) {
        return this.marca.compareTo(o.marca);
    }

    public int compareTo(clsElectrodomestico o) {
        return this.tipo.compareTo(o.tipo);
    }

    */

}
