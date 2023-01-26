package modulo001.clase001;
public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(); //instanciar clase = objeto
        Rectangulo rectangulo2 = new Rectangulo(); //instanciar clase = objeto

        rectangulo1.lado1=5;
        rectangulo1.lado2=9;
        System.out.println("El area del rectangulo 1 es: "+rectangulo1.area());
        System.out.println("El perimetro del rectangulo 1 es: "+rectangulo1.perimetro());

        rectangulo2.lado1=3;
        rectangulo2.lado2=7;
        System.out.println("El area del rectangulo 2 es: "+rectangulo2.area());
        System.out.println("El perimetro del rectangulo 2 es: "+rectangulo2.perimetro());
    }
}
