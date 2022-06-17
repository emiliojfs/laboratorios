package modulo006.clase016;

public class Pack<T> {
    private T elemento1;
    private T elemento2;
    private T elemento3;

    public Pack(T elemento1, T elemento2, T elemento3) {
        this.elemento1 = elemento1;
        this.elemento2 = elemento2;
        this.elemento3 = elemento3;
    }

    public T getElemento1() {
        return elemento1;
    }

    public void setElemento1(T elemento1) {
        this.elemento1 = elemento1;
    }

    public T getElemento2() {
        return elemento2;
    }

    public void setElemento2(T elemento2) {
        this.elemento2 = elemento2;
    }

    public T getElemento3() {
        return elemento3;
    }

    public void setElemento3(T elemento3) {
        this.elemento3 = elemento3;
    }

}
