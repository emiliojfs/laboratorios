package modulo005.clase004;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    private static void excepcionTipoMetodo() throws FileNotFoundException {
        File archivo = new File("D:\\prueba\\texto.txt");
        FileReader fr = new FileReader(archivo);
        System.out.println(fr);
    }

    //dado que excepcionTipoMetodo() podría arrojar una excepción,
    // una llamada debe incluirse dentro de un bloque try

    public static void main(String[] args) {
        try {
            excepcionTipoMetodo();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
