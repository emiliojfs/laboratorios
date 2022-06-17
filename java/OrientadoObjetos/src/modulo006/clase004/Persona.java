package modulo006.clase004;

import java.util.ArrayList;
import java.util.Objects;

public class Persona {
    private String nombre;
    private ArrayList<Persona> amigos = new ArrayList<Persona>();

    public void agregarAmigo(Persona persona){
        amigos.add(persona);
    }

    public void eliminarAmigo(Persona persona){
        amigos.remove(persona);
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Persona> getAmigos() {
        return amigos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return nombre.equals(persona.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
