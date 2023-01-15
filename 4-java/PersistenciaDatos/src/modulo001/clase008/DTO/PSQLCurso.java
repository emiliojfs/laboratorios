package modulo001.clase008.DTO;

import modulo001.clase008.BO.Curso;
import modulo001.clase008.DAO.CursoDAO;
import modulo001.clase008.DAO.ExceptionDAO;

import java.util.List;

public class PSQLCurso implements CursoDAO {

    @Override
    public void insertar(Curso c) throws ExceptionDAO {

    }

    @Override
    public void modificar(Curso c) throws ExceptionDAO {

    }

    @Override
    public void eliminar(Curso c) throws ExceptionDAO {

    }

    @Override
    public List<Curso> listarTodos() throws ExceptionDAO {
        return null;
    }

    @Override
    public Curso obtener(Long id) throws ExceptionDAO {
        return null;
    }
}
