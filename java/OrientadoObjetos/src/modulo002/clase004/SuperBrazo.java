package modulo002.clase004;

public class SuperBrazo implements Girable, Rotable{
    @Override
    public void girar() {
        System.out.println("El superbrazo Gira");
    }

    @Override
    public void rotar() {
        System.out.println("El superbrazo Rota");
    }
}
