package modulo001.clase004;

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
    public Laptop(){
        this("Sin marca","sin marca");
    }

    //metodo de clase
    public static int getContador() {
        return contador;
    }
}
