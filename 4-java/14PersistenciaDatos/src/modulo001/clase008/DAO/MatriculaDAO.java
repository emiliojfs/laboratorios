package modulo001.clase008.DAO;

import modulo001.clase008.BO.Matricula;

import java.util.List;

public interface MatriculaDAO {
    void insertar(Matricula a) throws ExceptionDAO;
    void modificar(Matricula a) throws ExceptionDAO;
    void eliminar(Matricula a) throws ExceptionDAO;
    List<Matricula> listarTodos() throws ExceptionDAO;
    Matricula obtener(Long id) throws ExceptionDAO;
}
