package modulo001.clase003;

import java.sql.*;

public class Main {
    private static Connection conexion;
    private static String urlBaseDato = "jdbc:postgresql://localhost:5432/escuela";


    public static void main(String[] args) throws SQLException {
        conectar();
        consulta();
    }
    private static void conectar() throws SQLException {
        conexion = DriverManager.getConnection(urlBaseDato,"postgres","PG2525");
        System.out.println("Conexion exitosa");
    }

    public static void consulta() throws SQLException {
        Statement consulta = conexion.createStatement();
        ResultSet conjunto = consulta.executeQuery("select * from alumnos");
        while (conjunto.next()){
            int idAlumno = conjunto.getInt("id_alumno");
            String nombreAlumno = conjunto.getString("nombres_alumno");
            String apellidoAlumno = conjunto.getString("apellidos_alumno");
            System.out.println("ID: "+idAlumno+" Nombres: "+nombreAlumno+" Apellidos: "+apellidoAlumno);
        }
        conjunto.close();
    }
}

