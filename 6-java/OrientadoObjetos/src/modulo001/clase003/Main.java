package modulo001.clase003;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("lenovo","lenA");
        Laptop laptop2 = new Laptop("toshiba","tosB");
        Laptop laptop3 = new Laptop("asus","asuC");
        Laptop laptop4 = new Laptop("samsung","samD");
        Laptop laptop5 = new Laptop("microsof","microE");

        System.out.println(laptop1.iniciarPrograma()); //metodo con variable local: inicio y fin
        System.out.println(laptop1.iniciarPrograma()); //metodo con variable local: inicio y fin
        System.out.println(laptop1.iniciarPrograma()); //metodo con variable local: inicio y fin
        System.out.println(laptop1.iniciarPrograma()); //metodo con variable local: inicio y fin

    }
}