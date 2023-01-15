package modulo001.clase007;

public class Deportista extends Persona {
    private float altura;
    private float peso;

    public Deportista(String nombre, String apellidos, float altura, float peso) {
        super(nombre, apellidos); //'super()' llama a los atributos del constructor de la clase padre
                                //para que pueda disponerse en la clase hija desde el inicio
        this.altura = altura;
        this.peso = peso;
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

    //sobrecarga dinamica
    @Override
    public void andar(){

       super.imprimirMensaje(); //'super' obliga a utilizar metodos de la clase padre
        System.out.println("10km/h (deportista)");
    }
}
