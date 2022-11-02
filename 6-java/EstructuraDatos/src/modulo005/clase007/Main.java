package modulo005.clase007;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList();
        myArrayList.add("Hola");
        myArrayList.add("como");
        myArrayList.add("estas?");

        Iterable<String> myIterable = myArrayList;
        Iterator<String> myIterator;

        myIterator = myIterable.iterator();
        while (myIterator.hasNext()){
            System.out.println(myIterator.next());
        }

        for(String cadena:myArrayList){
            System.out.println(cadena);
        }
    }
}
