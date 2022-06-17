package modulo002.clase003;

public class CicloForEach {
    public static void main(String[] args) {
        int cantidadAlumnos = 3;
        String nombresAlumnos[];
        String apellidosAlumonos[];
        String direccionAlumnos[];

        nombresAlumnos = new String[cantidadAlumnos];
        apellidosAlumonos = new String[cantidadAlumnos];
        direccionAlumnos = new String[cantidadAlumnos];

        nombresAlumnos[0]="Juan Carlos";
        apellidosAlumonos[0]="Mendoza Cacho";
        direccionAlumnos[0]="Asoc. Las palmeras";
        nombresAlumnos[1]="Maria";
        apellidosAlumonos[1]="Cardenas Zapata";
        direccionAlumnos[1]="Urb. Los damascos";
        nombresAlumnos[2]="Pedro";
        apellidosAlumonos[2]="Flores Flores";
        direccionAlumnos[2]="Av Leguia 245";

        for (String s:nombresAlumnos){
            System.out.println(s);
        }
        for(String s:apellidosAlumonos){
            System.out.println(s);
        }
        for(String s:direccionAlumnos){
            System.out.println(s);
        }

    }

}
