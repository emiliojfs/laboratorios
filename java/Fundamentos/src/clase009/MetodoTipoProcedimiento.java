package clase009;

public class MetodoTipoProcedimiento {
    //sin parametro
    static void mensajeBienvenida() {
        imprimirMensaje("Hola", 10);
    }

    //sin parametro
    static void mensajeDespedia() {
        imprimirMensaje("Adios", 10);
    }

    //con parametro
    static void imprimirMensaje(String mensaje, int repeticiones) {
        for (int i = 0; i < repeticiones; i++) {
            System.out.print(mensaje+"["+(i+1)+"]");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        mensajeBienvenida();
        mensajeDespedia();
        mensajeBienvenida();
    }
}
