package modulo001.clase007;

public class Persona {
    private String nombre;
    private String apellidos;

    public Persona(String nombre, String apellidos) {
        super();// indica que es el constructor padre
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

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

    protected void imprimirMensaje(){
        System.out.print(getNombre() + " camina a ");
    }

    public void andar(){
        imprimirMensaje();
        System.out.println("5km/h (persona)");
    }
}
