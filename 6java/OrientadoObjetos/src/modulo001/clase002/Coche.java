package modulo001.clase002;

public class Coche {
    private String marca;
    private String modelo;

    //constructor
    public Coche(String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;
    }
        //sobrecarga de constructores
    public Coche(String modelo){
        this.modelo=modelo;
        this.marca="Toyota";
    }
        //sobrecarga con delegacion de constructores
    public Coche() {
        this("Toyota", "Yaris");
    }

    //get and set
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
