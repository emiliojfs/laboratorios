package modulo006.clase005;


import java.io.*;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        //inputStreamApi();
        outputStreamApi();
    }

    private static void inputStreamApi() {
        int dato;

        try (InputStream entrada = new FileInputStream(Paths.get("C:\\users\\jefs\\IdeaProjects\\BibliotecaEstandar\\src\\modulo007\\ficheros\\sc.png").toFile())) {
            while ((dato = entrada.read()) != -1) {
                System.out.print((char) dato);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void outputStreamApi() {
        int dato;
        try (
                InputStream entrada = new FileInputStream(Paths.get("C:\\users\\jefs\\IdeaProjects\\BibliotecaEstandar\\src\\modulo007\\ficheros\\sc.png").toFile());
                OutputStream salida = new FileOutputStream(Paths.get("C:\\users\\jefs\\IdeaProjects\\BibliotecaEstandar\\src\\modulo007\\ficheros\\sc2.png").toFile())
        ) {
            while ((dato = entrada.read()) != -1) {
                salida.write(dato);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}