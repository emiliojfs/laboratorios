package modulo003.clase002;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada listaEnlazada = new ListaEnlazada();

        listaEnlazada.agregarFinal(1);
        listaEnlazada.agregarFinal(2);
        listaEnlazada.agregarFinal(3);
        listaEnlazada.agregarFinal(4);
        listaEnlazada.agregarFinal(5);
        listaEnlazada.agregarInicio(9);
        listaEnlazada.agregarFinal(8);

        listaEnlazada.verLista();

    }
}
