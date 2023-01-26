package modulo001.clase005;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String urlBaseDato = "jdbc:postgresql://localhost:5432/escuela";

        try(Connection conexion = DriverManager.getConnection(urlBaseDato,"postgres","PG2525");

        ){
            CallableStatement llamarProcedimientoAlmacenado= null;
            llamarProcedimientoAlmacenado = conexion.prepareCall("{CALL public.insertaralumno}");
            //llamarProcedimientoAlmacenado.execute();
            //llamarProcedimientoAlmacenado.executeUpdate();
            //llamarProcedimientoAlmacenado.executeQuery();
            System.out.println("se inserto correctamente");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}