package modulo001.clase008.BO;

import java.util.Objects;

public class Curso {
    private Long id = null;
    private String nombre;
    private Long idProfesor;

    public Curso(String nombre, Long idProfesor) {
        this.nombre = nombre;
        this.idProfesor = idProfesor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombres) {
        this.nombre = nombres;
    }

    public Long getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Long idProfesor) {
        this.idProfesor = idProfesor;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", idProfesor=" + idProfesor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(id, curso.id) &&
                Objects.equals(nombre, curso.nombre) &&
                Objects.equals(idProfesor, curso.idProfesor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, idProfesor);
    }
}
