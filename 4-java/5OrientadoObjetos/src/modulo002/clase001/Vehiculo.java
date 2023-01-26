package modulo002.clase001;

public abstract class Vehiculo {
    private String marca;
    private String paisProcedencia;
    private String sistemaCambio;

    public Vehiculo(String marca, String paisProcedencia, String tipoCambio) {
        this.marca = marca;
        this.paisProcedencia = paisProcedencia;
        this.sistemaCambio = tipoCambio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPaisProcedencia() {
        return paisProcedencia;
    }

    public void setPaisProcedencia(String paisProcedencia) {
        this.paisProcedencia = paisProcedencia;
    }

    public String getSistemaCambio() {
        return sistemaCambio;
    }

    public void setSistemaCambio(String sistemaCambio) {
        this.sistemaCambio = sistemaCambio;
    }

    public abstract void acelerar();//metodo abstracto todas las clases hijas la deben implementar

    public void pagarImpuesto(){
        System.out.println("impuesto pagado");
    };
}
