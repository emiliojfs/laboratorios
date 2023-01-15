package modulo001.clase006;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        TransaccionJDBC transaccionJDBC = new TransaccionJDBC();
        try {
            transaccionJDBC.conectar();
            transaccionJDBC.transaccion();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
