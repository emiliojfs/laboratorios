package modulo003.clase0080;

public class Main {
    public static void main(String[] args) {
        Cola cola = new Cola();

        cola.insert(1);
        cola.insert(2);
        cola.insert(3);
        cola.insert(4);
        cola.insert(5);
        cola.insert(6);
        cola.insert(7);
        cola.insert(8);
        cola.delete();
        while (!cola.empty()){
            System.out.println(cola.delete());
        }

    }
}
