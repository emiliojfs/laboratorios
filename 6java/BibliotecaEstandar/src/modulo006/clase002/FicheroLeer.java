package modulo006.clase002;

import java.io.FileReader;
import java.io.IOException;

public class FicheroLeer {
    public static void main(String[] args) {
        FileReader fl;
        //BufferedReader br;
        String contenido="";
        int c;

        {
            try {
                fl = new FileReader("C:\\users\\jefs\\desktop\\carpetajava\\archivojava02.txt");
                //br = new BufferedReader(fl);
                //contenido = br.readLine();//lee una sola linea

                while ((c = fl.read())!=-1){//lee ttodo el texto
                    contenido+=(char)c;
                }
                fl.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("No se encontro el archivo");
            }
        }
        System.out.println(contenido);
    }
}
