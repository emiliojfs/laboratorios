package modulo004.clase002;

public class Ingeniero extends Persona{
    private String nombreEspecialidad;

    public Ingeniero(String nombre, String apellido, int anioNacimiento) {
        super(nombre, apellido, anioNacimiento);
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    @Override
    public void correr(){
        System.out.println("Ingeniero: " + getNombre()+" "+getApellido()+" "+"corre a 5km/h");
    }
}
