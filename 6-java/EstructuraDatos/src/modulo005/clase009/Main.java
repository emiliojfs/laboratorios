package modulo005.clase009;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myList = new ArrayList();
        myList.add("Hola");
        myList.add("como");
        myList.add("estas?");

        System.out.println(myList.get(0));
        System.out.println(myList.get(2));
        System.out.println(myList.indexOf("Hola"));

        myList.set(0,"Hey");

        System.out.println(myList.get(0));

    }
}
