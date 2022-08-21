package modulo001.clase007.BO;

import java.util.Date;
import java.util.Objects;

public class Matricula {
    private long idAlumno;
    private long idCurso;
    private int fechaMatricula;

    public Matricula(long idAlumno, long idCurso, int fechaMatricula) {
        this.idAlumno = idAlumno;
        this.idCurso = idCurso;
        this.fechaMatricula = fechaMatricula;
    }

    public long getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(long idAlumno) {
        this.idAlumno = idAlumno;
    }

    public long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(long idCurso) {
        this.idCurso = idCurso;
    }

    public int getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(int fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matricula matricula = (Matricula) o;
        return idAlumno == matricula.idAlumno &&
                idCurso == matricula.idCurso &&
                fechaMatricula == matricula.fechaMatricula;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAlumno, idCurso, fechaMatricula);
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "idAlumno=" + idAlumno +
                ", idCurso=" + idCurso +
                ", fechaMatricula=" + fechaMatricula +
                '}';
    }
}


