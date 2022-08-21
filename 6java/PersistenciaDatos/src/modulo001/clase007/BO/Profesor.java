package modulo001.clase007.BO;

import java.util.Objects;

public class Profesor {
    private Long id=null;
    private String nombres;
    private String apellidos;

    public Profesor(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profesor profesor = (Profesor) o;
        return Objects.equals(id, profesor.id) &&
                Objects.equals(nombres, profesor.nombres) &&
                Objects.equals(apellidos, profesor.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombres, apellidos);
    }
}

