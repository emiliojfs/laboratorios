package modulo006.clase015;

import java.util.Objects;

public class TipoBombon {
    private String sabor;

    public TipoBombon(String sabor) {
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
        TipoBombon that = (TipoBombon) o;
        return Objects.equals(sabor, that.sabor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sabor);
    }
}
