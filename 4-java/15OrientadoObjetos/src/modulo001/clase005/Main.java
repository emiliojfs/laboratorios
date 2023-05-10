package modulo001.clase005;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro();

        libro.setTitulo("Codigo daVinci");
        libro.setTotalPaginas(500);

        System.out.println(libro.getPaginaActual());
        libro.avanzarPagina();
        libro.avanzarPagina();
        System.out.println(libro.getPaginaActual());
        libro.avanzarPagina(50);
        libro.avanzarCapitulo();
        System.out.println(libro.getPaginaActual());
    }
}