package modulo005.clase008;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Hola");
        conjunto.add("que");
        conjunto.add("tal");
        conjunto.add("estas");
        conjunto.add("bro");

        for(String s:conjunto){
            System.out.println(s);
        }
        System.out.println("*********************");

        Set<Persona> conjuntoPersona = new TreeSet<Persona>();
        Persona persona01= new Persona("pepe","perez","Tacna");
        Persona persona02= new Persona("juan","sanchez","Ica");
        Persona persona03= new Persona("ana","sanz","Lima");
        conjuntoPersona.add(persona01);
        conjuntoPersona.add(persona02);
        conjuntoPersona.add(persona03);


        for(Persona p:conjuntoPersona){
            System.out.println(p.getApellido());
        }
    }
}
