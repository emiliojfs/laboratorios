package modulo001.clase002;

public class Main {
    public static void main(String[] args) {
        //constructor
        Coche coche1 = new Coche("Toyota", "Yaris");
        System.out.println(coche1.getMarca());
        System.out.println(coche1.getModelo());
        //constructor con sobrecarga
        Coche coche2 = new Coche( "Optimus");
        System.out.println(coche2.getMarca());
        System.out.println(coche2.getModelo());
        //delegacion de constructor con sobrecarga
        Coche coche3 = new Coche( "Optimus");
        System.out.println(coche3.getMarca());
        System.out.println(coche3.getModelo());
    }
}
