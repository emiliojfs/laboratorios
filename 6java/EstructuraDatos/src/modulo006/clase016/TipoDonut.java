package modulo006.clase016;

import java.util.Objects;

public class TipoDonut {
    private String sabor;

    public TipoDonut(String sabor) {
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
        TipoDonut tipoDonut = (TipoDonut) o;
        return Objects.equals(sabor, tipoDonut.sabor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sabor);
    }
}
