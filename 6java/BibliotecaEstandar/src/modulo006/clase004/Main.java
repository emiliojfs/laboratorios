package modulo006.clase004;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        gestionarFicheros();
    }

    public static void gestionarFicheros() throws IOException {
        Path rutaOrigen = Paths.get("C:\\users\\jefs\\IdeaProjects\\BibliotecaEstandar\\src\\modulo007\\ficheros\\subcarpeta001\\aaa.txt");
        Path rutaDestino = Paths.get("C:\\users\\jefs\\IdeaProjects\\BibliotecaEstandar\\src\\modulo007\\ficheros\\subcarpeta003\\aaa.txt");

        Files.copy(rutaOrigen,rutaDestino);
    }
}
