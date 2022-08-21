package modulo006.clase018;

import java.util.Objects;

public class TipoBombon implements Producto {
    private String sabor;
    private double precio;

    public TipoBombon(String sabor,double precio) {
        this.sabor = sabor;
        this.precio = precio;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoBombon that = (TipoBombon) o;
        return Objects.equals(sabor, that.sabor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sabor);
    }
}
