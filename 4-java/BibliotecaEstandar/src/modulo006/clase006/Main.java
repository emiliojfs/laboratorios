package modulo006.clase006;


import java.io.*;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        //inputStreamApi();
        //bufferedInputStreamApi();
    }

    private static void inputStreamApi() {
        int dato;
        long inicio = System.currentTimeMillis();

        try (InputStream entrada = new FileInputStream(Paths.get("C:\\users\\jefs\\IdeaProjects\\BibliotecaEstandar\\src\\modulo007\\ficheros\\sc.png").toFile())) {
            while ((dato = entrada.read()) != -1) {
                System.out.print((char) dato);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long fin = System.currentTimeMillis();
        System.out.println("************************");
        System.out.println(fin-inicio);
    }

    private static void bufferedInputStreamApi() {
        int dato;
        long inicio = System.currentTimeMillis();
        try (
                InputStream entrada = new FileInputStream(Paths.get("C:\\users\\jefs\\IdeaProjects\\BibliotecaEstandar\\src\\modulo007\\ficheros\\sc.png").toFile());
                BufferedInputStream entradaRapida = new BufferedInputStream(entrada)
        ) {
            while ((dato = entradaRapida.read()) != -1) {
                System.out.print((char) dato);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        long fin = System.currentTimeMillis();
        System.out.println("************************");
        System.out.println(fin-inicio);
    }
}