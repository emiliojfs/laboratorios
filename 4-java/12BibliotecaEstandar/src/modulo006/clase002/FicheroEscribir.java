package modulo006.clase002;

import java.io.FileWriter;
import java.io.IOException;

public class FicheroEscribir {
    public static void main(String[] args) {

        FileWriter fw;
        String mensaje="Mensaje a la nacion";
        {
            try {
                fw = new FileWriter("C:\\Users\\JEFS\\IdeaProjects\\BibliotecaEstandar\\src\\modulo007\\ficheros\\archivojava001.txt");//crea fichero ->sin true elimina el texto anterior e ingresa el nuevo.
                fw.write(mensaje);//escribe en el archivo
                fw.close();

                fw = new FileWriter("C:\\Users\\JEFS\\IdeaProjects\\BibliotecaEstandar\\src\\modulo007\\ficheros\\archivojava002.txt",true);//crea archivo ->con true agrega texto en el archivo
                fw.write("\nHola archivo\n");//escribe en el archivo
                fw.write("Estoy agregando mas texto\n");
                fw.write("Esta es otra linea\n");
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
