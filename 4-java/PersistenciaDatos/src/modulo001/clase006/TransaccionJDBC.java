package modulo001.clase006;

import java.sql.*;

public class TransaccionJDBC {

    private Connection conexion = null;

    public void conectar() throws SQLException {
        String urlDatabase = "jdbc:postgresql://localhost:5432/escuela";
        conexion=DriverManager.getConnection(urlDatabase,"postgres","PG2525");
        conexion.setAutoCommit(false);
    }

    public void transaccion() throws SQLException {
        final String PROFESOR ="INSERT INTO profesores(id_profesor,nombres_profesor,apellidos_profesor) VALUES (?,?,?)";
        final String CURSO = "INSERT INTO cursos(id_curso,nombre_curso,id_profesor) VALUES (?,?,?)";
        PreparedStatement profesor = null;
        PreparedStatement curso = null;

        profesor = conexion.prepareStatement(PROFESOR);
        profesor.setInt(1,8);
        profesor.setString(2,"ccc");
        profesor.setString(3,"ccc");
        profesor.executeUpdate();

        curso = conexion.prepareStatement(CURSO);
        curso.setInt(1,5);
        curso.setString(2,"ccc");
        curso.setInt(3,3);
        curso.executeUpdate();

        conexion.commit();
        conexion.rollback();
        conexion.close();

        //ok
    }
}
