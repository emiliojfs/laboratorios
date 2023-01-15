package modulo003.clase006;

public class Main {
    public static void main(String[] args) {
        PilaObjetos pilaObjetos = new PilaObjetos();

        pilaObjetos.push("hhh");
        pilaObjetos.push(1);
        pilaObjetos.push("ASD");
        pilaObjetos.push(true);
        pilaObjetos.push(2.2f);
        pilaObjetos.push(4);
        pilaObjetos.pop();
        pilaObjetos.view();

    }
}
