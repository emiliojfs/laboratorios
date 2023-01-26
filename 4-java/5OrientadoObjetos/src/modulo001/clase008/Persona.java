package modulo001.clase008;

import java.util.Objects;

public class Persona {
    private String nombres;
    private String apellidos;
    private int dni;

    public Persona(String nombres, String apellidos, int dni) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return dni == persona.dni &&
                Objects.equals(nombres, persona.nombres) &&
                Objects.equals(apellidos, persona.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombres, apellidos, dni);
    }
}
