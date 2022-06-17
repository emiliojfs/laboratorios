package modulo004.clase002;

public class Deportista extends Persona {
    private String nombreDeporte;

    public Deportista(String nombre, String apellido, int anioNacimiento) {
        super(nombre, apellido, anioNacimiento);
    }

    public String getNombreDeporte() {
        return nombreDeporte;
    }

    public void setNombreDeporte(String nombreDeporte) {
        this.nombreDeporte = nombreDeporte;
    }

    @Override
    public void correr(){
        System.out.println("Deportista: " + getNombre()+" "+getApellido()+" "+"corre a 15km/h");
    }
}
