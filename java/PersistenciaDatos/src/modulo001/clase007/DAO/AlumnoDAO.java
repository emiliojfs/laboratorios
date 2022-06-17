package modulo001.clase007.DAO;

import modulo001.clase007.BO.Alumno;

import java.util.List;

public interface AlumnoDAO {
    void insertar(Alumno a) throws ExceptionDAO;
    void modificar(Alumno a) throws ExceptionDAO;
    void eliminar(Alumno a) throws ExceptionDAO;
    List<Alumno> listarTodos() throws ExceptionDAO;
    Alumno obtener(Long id) throws ExceptionDAO;
}
