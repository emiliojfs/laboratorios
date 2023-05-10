package modulo001.clase008.DAO;

import modulo001.clase008.BO.Profesor;

import java.util.List;

public interface ProfesorDAO {
    void insertar(Profesor a) throws ExceptionDAO;
    void modificar(Profesor a) throws ExceptionDAO;
    void eliminar(Profesor a) throws ExceptionDAO;
    List<Profesor> listarTodos() throws ExceptionDAO;
    Profesor obtener(Long id) throws ExceptionDAO;
}
