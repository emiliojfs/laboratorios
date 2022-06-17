package clase010;

public class Main {
    public static void main(String[] args) {
        //ClaseVehiculo vehiculo = new ClaseVehiculo("Toyota",4,4,5);
        ClaseVehiculo vehiculo; // Se crea referencia
        vehiculo = new ClaseVehiculo("Toyota",4,4,5); // Se crea objeto

        System.out.println("Kilometraje actual: "+vehiculo.obtenerKilometrajeActual());
        vehiculo.avanzar(100);
        vehiculo.avanzar(50);
        vehiculo.avanzar(250);
        vehiculo.avanzar(10);
        System.out.println("Kilometraje actual: "+vehiculo.obtenerKilometrajeActual());
    }
}
