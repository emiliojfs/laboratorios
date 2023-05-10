package modulo001.clase002;

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
        System.out.println(consulta.executeQuery("select * from alumnos").toString());
    }
}