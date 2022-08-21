package modulo002.clase001;

public class Moto extends Vehiculo{
    private String sistemaDescanso;

    public Moto(String marca, String paisProcedencia, String tipoCambio) {
        super(marca, paisProcedencia, tipoCambio);
    }

    @Override
    public void acelerar() {
        System.out.println("La moto acelera");
    }


}
