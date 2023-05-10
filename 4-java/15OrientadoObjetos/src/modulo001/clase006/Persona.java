package modulo001.clase006;

public class Persona {
    private String nombre;
    private String apellidos;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void andar(){
        System.out.println(getNombre()+ " la persona(padre) camina a 5km/h");
    }
}
