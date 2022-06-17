package modulo006.clase007;

import java.io.*;
import java.nio.file.Paths;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class Main {
    public static void main(String[] args){
        String path="C:\\users\\jefs\\IdeaProjects\\BibliotecaEstandar\\src\\modulo007\\ficheros\\archivogzip.txt";

        //escribirFicheroComprimido(path);
        //leerFicheroComprimido(path);
    }

    private static void leerFicheroComprimido(String path)  {
        String linea = null;

    try(            FileInputStream entrada = new FileInputStream(Paths.get(path).toFile());
                    GZIPInputStream entradaComprimidad = new GZIPInputStream(entrada);
                    BufferedInputStream entradaCache = new BufferedInputStream(entradaComprimidad);
                    InputStreamReader transformador = new InputStreamReader(entradaCache);
                    BufferedReader lectorTexto = new BufferedReader(transformador);
                    ){
                while((linea=lectorTexto.readLine())!=null){
                    System.out.println(linea);
        }

        }catch (FileNotFoundException e) {
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        }
    }

    public static void escribirFicheroComprimido(String path){
        try(
                FileOutputStream salida = new FileOutputStream(Paths.get(path).toFile());
                GZIPOutputStream salidaComprimida = new GZIPOutputStream(salida);
                BufferedOutputStream salidaCache = new BufferedOutputStream(salidaComprimida);
                OutputStreamWriter transformador = new OutputStreamWriter(salidaCache);
                BufferedWriter escritorTexto = new BufferedWriter(transformador);
                ) {
            for(int i=0;i<1000;i++){
                escritorTexto.write("Hola, esto es un texto "+i);
                escritorTexto.newLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
