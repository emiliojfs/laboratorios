package modulo005.clase006;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<String> myCollection = new ArrayList<String>();
        myCollection.add("Hola");
        myCollection.add("como");
        myCollection.add("estas?");

        myCollection.addAll(myCollection);
        System.out.println(myCollection.size());
        System.out.println(myCollection.contains("como"));

        for (String cadena:myCollection){
            System.out.println(cadena);
        }
        System.out.println(myCollection.isEmpty());
        myCollection.clear();
        System.out.println(myCollection.isEmpty());

    }

}
