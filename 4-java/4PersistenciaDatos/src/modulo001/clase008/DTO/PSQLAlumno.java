package modulo001.clase008.DTO;

import modulo001.clase008.BO.Alumno;
import modulo001.clase008.DAO.AlumnoDAO;
import modulo001.clase008.DAO.ExceptionDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PSQLAlumno implements AlumnoDAO {
    private Connection conexion;

    final String INSERT = "INSERT INTO alumnos(nombres_alumno, apellidos_alumno, fechaNacimiento_alumno)" +
            "VALUES (?,?,?)";
    final String UPDATE = "UPDATE alumnos SET nombres_alumno=?, apellidos_alumno=?, fechaNacimiento_alumno=?" +
            "WHERE id_alumno = ?";
    final String DELETE = "DELETE FROM alumnos WHERE id_alumnos = ?";
    final String GETALL = "SELECT * FROM alumnos";
    final String GETONE = "SELECT * FROM alumnos WHERE id_alumnos = ?";

    private PSQLAlumno(Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public void insertar(Alumno a) throws ExceptionDAO {
        PreparedStatement consultaParametrizada = null;
        ResultSet conjunto = null;
        try {
            consultaParametrizada = conexion.prepareStatement(INSERT);
            consultaParametrizada.setString(1, a.getNombres());
            consultaParametrizada.setString(2, a.getApellidos());
            consultaParametrizada.setDate(3, new Date(a.getFechaNacimiento().getTime()));
            if (consultaParametrizada.executeUpdate() == 0) {
                throw new ExceptionDAO("Ocurrio un error al guardar registro.");
            }
            conjunto = consultaParametrizada.getGeneratedKeys();
            if (conjunto.next()) {
                a.setId(conjunto.getLong(1));
            }
        } catch (SQLException ex) {
            throw new ExceptionDAO("Error en SQL: ", ex);
        }
    }

    @Override
    public void modificar(Alumno a) throws ExceptionDAO {

    }


    @Override
    public void eliminar(Alumno a) throws ExceptionDAO {

    }

    private Alumno convertir(ResultSet conjunto) throws SQLException {
        String nombres = conjunto.getString("nombres_alumno");
        String apellidos = conjunto.getString("apellidos_alumno");
        Date fechaNacimiento = conjunto.getDate("fechaNacimiento_alumno");
        Alumno alumno = new Alumno(nombres, apellidos, fechaNacimiento);
        alumno.setId(conjunto.getLong("id_alumno"));
        return alumno;
    }

    @Override
    public List<Alumno> listarTodos() throws ExceptionDAO {
        PreparedStatement consultaParametrizada = null;
        ResultSet conjunto = null;
        List<Alumno> alumnos = new ArrayList<>();

        try {
            consultaParametrizada = conexion.prepareStatement(GETALL);
            conjunto = consultaParametrizada.executeQuery();
            while (conjunto.next()) {
                alumnos.add(convertir(conjunto));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return alumnos;
    }

    @Override
    public Alumno obtener(Long id) throws ExceptionDAO {
        PreparedStatement consultaParametrizada = null;
        ResultSet conjunto = null;
        Alumno a = null;
        try {
            consultaParametrizada = conexion.prepareStatement(GETONE);
            consultaParametrizada.setLong(1, id);
            conjunto = consultaParametrizada.executeQuery();
            if (conjunto.next()) {
                a = convertir(conjunto);
            }
        } catch (SQLException ex) {
            throw new ExceptionDAO("Error en SQL: ", ex);
        }
        return a;
    }

    public static void main(String[] args) throws ExceptionDAO {
        String urlBaseDato = "jdbc:postgresql://localhost:5432/escuela";
        try (Connection conexion = DriverManager.getConnection(urlBaseDato, "postgres", "PG2525");) {

            AlumnoDAO alumnoDAO = new PSQLAlumno(conexion);
            Alumno nuevoAlumno = new Alumno("Emilio", "Flores", new Date(2014, 2, 8));
            alumnoDAO.insertar(nuevoAlumno);
            //List<Alumno> alumnos = alumnoDAO.listarTodos();
            //for(Alumno a:alumnos){System.out.println(a.toString());}

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}