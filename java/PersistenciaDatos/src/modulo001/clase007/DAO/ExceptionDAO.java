package modulo001.clase007.DAO;

public class ExceptionDAO extends Exception{
    public ExceptionDAO(String message) {
        super(message);
    }

    public ExceptionDAO(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionDAO(Throwable cause) {
        super(cause);
    }
}
