package modulo001.clase001;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String urlBaseDato = "jdbc:postgresql://localhost:5432/registro";

        try (Connection conexion = DriverManager.getConnection(urlBaseDato, "postgres", "tierra666+");) {

            System.out.println("La conexión se realizo sin problemas");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}