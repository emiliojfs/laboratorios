package modulo003.clase003;

public class Main {
    public static void main(String[] args) {
        ListaEnlazadaDoble listaEnlazadaDoble = new ListaEnlazadaDoble();

        listaEnlazadaDoble.agregarFinal(1);
        listaEnlazadaDoble.agregarFinal(2);
        listaEnlazadaDoble.agregarFinal(3);
        listaEnlazadaDoble.agregarFinal(4);
        listaEnlazadaDoble.agregarFinal(5);
        listaEnlazadaDoble.agregarInicio(9);
        listaEnlazadaDoble.agregarInicio(7);
        listaEnlazadaDoble.agregarFinal(8);

        listaEnlazadaDoble.verLista();

    }
}
