package modulo006.clase019;

import java.util.Objects;

public class TipoDonut implements Producto {
    private String sabor;
    private double precio;

    public TipoDonut(String sabor,double precio) {
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
        TipoDonut tipoDonut = (TipoDonut) o;
        return Objects.equals(sabor, tipoDonut.sabor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sabor);
    }
}
