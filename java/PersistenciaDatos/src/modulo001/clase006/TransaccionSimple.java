package modulo001.clase006;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransaccionSimple {
    public static void main(String[] args) {
        String urlDatabase = "jdbc:postgresql://localhost:5432/curso";
        /*
        * try whit resources
        * cierra la conexion automaticamente
        * */
        try(Connection conexion = DriverManager.getConnection(urlDatabase,"postgres","PG2525");
            Statement sentencia = conexion.createStatement();
        ){
            /* aqui se agregan los que se pueden agregar.
            sentencia.executeUpdate("insert into persona (nombre, apellido, edad, ci) values ('izan','flores','5','111')");
            sentencia.executeUpdate("insert into persona (nombre, apellido, edad, ci) values ('izan','flores','5','112')");
            sentencia.executeUpdate("insert into persona (nombre, apellido, edad, ci) values ('izan','flores','5','105')");
            */

            //aqui se agrega de forma transaccional si no se agrega a 1 no se agrega a ninguno
            conexion.setAutoCommit(false);
            sentencia.executeUpdate("insert into persona (nombre, apellido, edad, ci) values ('izan','flores','5','131')");
            sentencia.executeUpdate("insert into persona (nombre, apellido, edad, ci) values ('izan','flores','5','132')");
            sentencia.executeUpdate("insert into persona (nombre, apellido, edad, ci) values ('izan','flores','5','105')");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
