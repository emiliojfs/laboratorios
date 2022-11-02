package modulo001.clase008.DTO;

import modulo001.clase008.BO.Matricula;
import modulo001.clase008.DAO.ExceptionDAO;
import modulo001.clase008.DAO.MatriculaDAO;

import java.util.List;

public class PSQLMatricula implements MatriculaDAO {

    @Override
    public void insertar(Matricula a) throws ExceptionDAO {

    }

    @Override
    public void modificar(Matricula a) throws ExceptionDAO {

    }

    @Override
    public void eliminar(Matricula a) throws ExceptionDAO {

    }

    @Override
    public List<Matricula> listarTodos() throws ExceptionDAO {
        return null;
    }

    @Override
    public Matricula obtener(Long id) throws ExceptionDAO {
        return null;
    }
}
