package modulo006.clase003;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args){
        nioApi();
    }

    public static void nioApi(){
        Path ruta001 = Paths.get("mifichero.txt");
        System.out.println(ruta001.getFileName());
        System.out.println(ruta001.toAbsolutePath());

        Path ruta002 = ruta001.toAbsolutePath();

        for(Path miniruta:ruta002){
            System.out.println(miniruta);
        }
    }
}
