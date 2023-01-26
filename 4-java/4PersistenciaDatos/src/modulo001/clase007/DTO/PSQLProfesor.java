package modulo001.clase007.DTO;

import modulo001.clase007.BO.Profesor;
import modulo001.clase007.DAO.ExceptionDAO;
import modulo001.clase007.DAO.ProfesorDAO;

import java.util.List;

public class PSQLProfesor implements ProfesorDAO {

    @Override
    public void insertar(Profesor a) throws ExceptionDAO {

    }

    @Override
    public void modificar(Profesor a) throws ExceptionDAO {

    }

    @Override
    public void eliminar(Profesor a) throws ExceptionDAO {

    }

    @Override
    public List<Profesor> listarTodos() throws ExceptionDAO {
        return null;
    }

    @Override
    public Profesor obtener(Long id) throws ExceptionDAO {
        return null;
    }
}
