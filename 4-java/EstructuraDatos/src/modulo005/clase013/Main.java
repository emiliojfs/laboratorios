package modulo005.clase013;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> conjunto = new HashSet<String>();
        conjunto.add("Hola");
        conjunto.add("como");
        conjunto.add("estas?");

        //no se muestra ordenado
        for(String cadena:conjunto){
            System.out.println(cadena);
        }
        System.out.println("*********************");
        HashSet<Persona> conjunto2 = new HashSet<Persona>();
        Persona persona0 = new Persona("Pedro");
        Persona persona1 = new Persona("Juan");
        Persona persona2 = new Persona("Juan");//no lo agrega por q no admite duplicidad

        conjunto2.add(persona0);
        conjunto2.add(persona1);
        conjunto2.add(persona2);

        for(Persona p:conjunto2){
            System.out.println(p.getNombre());
        }
    }
}
