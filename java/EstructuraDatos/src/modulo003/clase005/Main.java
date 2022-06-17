package modulo003.clase005;

public class Main {
    public static void main(String[] args) {
        Pila pila = new Pila();

        pila.push(1);
        pila.push(1);
        pila.push(2);
        pila.push(5);
        pila.push(20);
        pila.pop();
        pila.pop();
        pila.pop();
        pila.pop();
        pila.view();
        }
    }

