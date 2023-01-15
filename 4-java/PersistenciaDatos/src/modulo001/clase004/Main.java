package modulo001.clase004;

import java.sql.*;

public class Main {
    private static Connection conexion;
    private static String urlBaseDato = "jdbc:postgresql://localhost:5432/escuela";

    public static void main(String[] args) throws SQLException {
        conectar();
        consultaParametrizada("López");
    }

    private static void conectar() throws SQLException {
     conexion = DriverManager.getConnection(urlBaseDato, "postgres", "PG2525");
     System.out.println("La conexión se realizo sin problemas");
    }

    private static PreparedStatement consultaParametrizada(String apellido) throws SQLException {
        String sqlQuery = "select * from alumnos where apellidos_alumno=?";
        PreparedStatement sentenciaParametrizada = conexion.prepareStatement(sqlQuery);
        sentenciaParametrizada.setString(1, apellido);
        ResultSet conjunto = sentenciaParametrizada.executeQuery();

        while (conjunto.next()){
            int idAlumno = conjunto.getInt("id_alumno");
            String nombreAlumno = conjunto.getString("nombres_alumno");
            String apellidoAlumno = conjunto.getString("apellidos_alumno");
            System.out.println("ID: "+idAlumno+" Nombres: "+nombreAlumno+" Apellidos: "+apellidoAlumno);
        }

        conjunto.close();

        return sentenciaParametrizada;
    }
}