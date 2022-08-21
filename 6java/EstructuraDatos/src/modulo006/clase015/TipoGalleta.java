package modulo006.clase015;

import java.util.Objects;

public class TipoGalleta {
    private String sabor;

    public TipoGalleta(String sabor) {
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoGalleta tipoGalleta = (TipoGalleta) o;
        return Objects.equals(sabor, tipoGalleta.sabor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sabor);
    }
}
