package modulo001.clase007.DAO;

import modulo001.clase007.BO.Curso;

import java.util.List;

public interface CursoDAO {
    void insertar(Curso c) throws ExceptionDAO;
    void modificar(Curso c) throws ExceptionDAO;
    void eliminar(Curso c) throws ExceptionDAO;
    List<Curso> listarTodos() throws ExceptionDAO;
    Curso obtener(Long id) throws ExceptionDAO;
}
