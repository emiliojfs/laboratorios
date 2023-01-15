package modulo006.clase001;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "C:\\users\\jefs\\IdeaProjects\\BibliotecaEstandar\\src\\modulo007\\ficheros\\";
        crearFichero(path);
        crearCarpeta(path);
        accederPropiedadesFichero(path);
        listarFicheros(path);
    }

    private static void crearFichero(String path) throws IOException{
        File mifichero = new File(path+"archivojava005.txt");//ruta completa (concatenado)
        mifichero.createNewFile();

        File mifichero002 = new File (path,"archivojava006.txt");//ruta completa (separada)
        mifichero002.createNewFile();
    }

    private static void crearCarpeta(String path) throws IOException{
        File mifichero001 = new File (path+"subcarpeta003");
        mifichero001.mkdir();
    }

    private static void accederPropiedadesFichero(String path){
        File mifichero = new File(path+"archivojava001.txt");
        System.out.println(mifichero.getAbsolutePath());
        System.out.println(mifichero.getName());
        System.out.println(mifichero.isDirectory());
    }

    private static void listarFicheros(String path){
        File micarpeta = new File(path);
        File[] ficheros = micarpeta.listFiles();
        for (int i = 0; i < ficheros.length; i++) {
            System.out.println(ficheros[i].getName());
        }
    }
}
