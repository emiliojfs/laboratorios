package modulo001.clase006;

public class Deportista extends Persona {
    private float altura;
    private float peso;

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

    //sobrecarga dinamica
    @Override
    public void andar(){
        System.out.println(getNombre()+ " el deportista(hija) camina a 10km/h");
    }
}
