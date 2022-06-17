package modulo002.clase001;

public class Main {
    public static void main(String[] args) {
        Moto moto = new Moto("Honda", "Japon", "mecanico");
        Auto auto = new Auto("Toyota", "Japon", "Automatico");

        System.out.println(moto.getMarca());
        System.out.println(auto.getMarca());

        // el programador no necesita conocer la jerarquia de clases
        acelerarVehiculo(moto);
        acelerarVehiculo(auto);

        moto.pagarImpuesto();
        auto.pagarImpuesto();
        //No se puede instanciar una clase abstracta
        //Vehiculo vehiculo = new Vehiculo("Mercedes","Alemania","Dual");
        //System.out.println(vehiculo.getMarca());
    }

    public static void acelerarVehiculo(Vehiculo v){
        v.acelerar();
    }
}
