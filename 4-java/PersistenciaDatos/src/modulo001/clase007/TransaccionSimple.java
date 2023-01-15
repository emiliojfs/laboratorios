package modulo001.clase007;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransaccionSimple {
    public static void main(String[] args) {
        String urlDatabase = "jdbc:postgresql://localhost:5432/escuela";
        /*
        * try whit resources
        * cierra la conexion automaticamente
        * */
        try(Connection conexion = DriverManager.getConnection(urlDatabase,"postgres","PG2525");
            Statement sentencia = conexion.createStatement();
        ){
            /*
            //aqui se agregan a la BD los elemntos que si se pueden agregar, los que no se pueden son ignorados.
            sentencia.executeUpdate("insert into alumnos (id_alumno, nombres_alumno, apellidos_alumno, \"fechaNacimiento_alumno\") values (14,'Izan8','Flores','2014-12-26')");
            sentencia.executeUpdate("insert into alumnos (id_alumno, nombres_alumno, apellidos_alumno, \"fechaNacimiento_alumno\") values (15,'Izan9','Flores','2014-12-26')");
            sentencia.executeUpdate("insert into alumnos (id_alumno, nombres_alumno, apellidos_alumno, \"fechaNacimiento_alumno\") values (10,'Izan10','Flores','2014-12-26')");
            */


            //aqui se agrega de forma transaccional si no se agrega a 1 no se agrega a ninguno
            conexion.setAutoCommit(true); //FALSE = si no se agrega a 1 no se agrega a ninguno  / TRUE = igual al bloque anterior
            sentencia.executeUpdate("insert into alumnos (id_alumno, nombres_alumno, apellidos_alumno, \"fechaNacimiento_alumno\") values (16,'Izan8','Flores','2014-12-26')");
            sentencia.executeUpdate("insert into alumnos (id_alumno, nombres_alumno, apellidos_alumno, \"fechaNacimiento_alumno\") values (17,'Izan9','Flores','2014-12-26')");
            sentencia.executeUpdate("insert into alumnos (id_alumno, nombres_alumno, apellidos_alumno, \"fechaNacimiento_alumno\") values (10,'Izan10','Flores','2014-12-26')");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
