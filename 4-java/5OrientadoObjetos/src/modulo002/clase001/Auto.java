package modulo002.clase001;

public class Auto extends Vehiculo{
    private String puertas;
    private String cantidadAsientos;

    public Auto(String marca, String paisProcedencia, String tipoCambio) {
        super(marca, paisProcedencia, tipoCambio);
    }

    @Override
    public void acelerar() {
        System.out.println("El auto acelera");
    }


}
