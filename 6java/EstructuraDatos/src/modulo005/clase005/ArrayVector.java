package modulo005.clase005;

import java.util.Vector;

public class ArrayVector {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("h");
        vector.add("hola");
        vector.insertElementAt("jj",1);
        System.out.println(vector);

        vector.remove("h");
        System.out.println(vector);

        System.out.println(vector.elementAt(0));
    }
}
