package modulo001.clase004;

public class Main {
    public static void main(String[] args) {
        Laptop c1 = new Laptop();
        Laptop c2 = new Laptop();
        Laptop c3 = new Laptop();

        //No instancio un objeto para llamar al metodo
        //utiliza metodo static
        System.out.println(Laptop.getContador());
    }
}