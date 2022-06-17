package modulo004.clase002;

import java.time.Year;

public class Persona {
    private String nombre;
    private String apellido;
    private int anioNacimiento;
    private int edad;

    public Persona(String nombre, String apellido, int anioNacimiento) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioNacimiento = anioNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public int getEdad() {
        return calcularEdad();
    }

    private int calcularEdad (){
        int anioActual = Year.now().getValue();
        this.edad=anioActual-this.anioNacimiento;
        return edad;
    }
    public void correr(){
        System.out.println("Persona comun: " + getNombre()+" "+getApellido()+" "+"corre a 10km/h");
    }
}