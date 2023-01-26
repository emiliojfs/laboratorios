package modulo001.clase003;

public class Laptop {
    //variable de clase
    private static int contador;
    //variable de instancia
    private String marca;
    private String modelo;

    public Laptop(String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;
        contador++;
    }

    public int iniciarPrograma(){
        int programasActivos = 0;
        return programasActivos++;
    }
}
