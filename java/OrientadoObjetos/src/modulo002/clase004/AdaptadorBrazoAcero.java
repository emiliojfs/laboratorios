package modulo002.clase004;

public class AdaptadorBrazoAcero implements Girable {
    private Rotable brazoAcero;

    public AdaptadorBrazoAcero(Rotable brazoAcero) {
        super();
        this.brazoAcero = brazoAcero;
    }

    public Rotable getBrazoAcero() {
        return brazoAcero;
    }

    public void setBrazoAcero(BrazoAcero brazoAcero) {
        this.brazoAcero = brazoAcero;
    }

    @Override
    public void girar() {
        brazoAcero.rotar();
        // este es el metodo que adapta el brazo de acero al robot
        //usando delegacion
    }
}
