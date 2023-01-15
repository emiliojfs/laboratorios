package modulo004.clase001;

public class Deportista extends Persona {
    private float altura;
    private float peso;

    public Deportista(String nombre) {
        super(nombre);
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
}
