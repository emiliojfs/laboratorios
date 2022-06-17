package clase010;

public class ClaseVehiculo {
    String marca;
    private int cantidadLlantas;
    private int cantidadPuertas;
    private int cantidadAsientos;
    private int kilometrajeActual;

    public ClaseVehiculo (String marca, int cantidadLlantas, int cantidadPuertas, int cantidadAsientos){
        this.marca = marca;
        this.cantidadLlantas = cantidadLlantas;
        this.cantidadPuertas = cantidadPuertas;
        this.cantidadAsientos = cantidadAsientos;
    }

    public int obtenerKilometrajeActual(){
        return this.kilometrajeActual;
    }

    public void avanzar(int km){
        this.kilometrajeActual = this.kilometrajeActual + km;
    }
}
