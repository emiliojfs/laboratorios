package modulo002.clase005;

public class AdaptadorBrazoAcero implements Girable{
    private BrazoAcero brazoAcero;

    public AdaptadorBrazoAcero(BrazoAcero brazoAcero) {
        this.brazoAcero = brazoAcero;
    }

    public BrazoAcero getBrazoAcero() {
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
