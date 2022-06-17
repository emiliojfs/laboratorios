package modulo006.clase003;

import java.util.ArrayList;
import java.util.Objects;

public class Persona {
    private String nombre;
    private ArrayList<Casa> arrayCasa;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.arrayCasa = new ArrayList<Casa>();
    }
    //generacion de metodos delegados

    public boolean contains(Object o) {
        return arrayCasa.contains(o);
    }

    public void add(Casa element) {
        arrayCasa.add(element);
    }

    //getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
