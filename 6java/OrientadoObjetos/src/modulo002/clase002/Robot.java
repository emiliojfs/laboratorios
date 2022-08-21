package modulo002.clase002;

public class Robot {

    //composiccion
    // se apoya en polimorfismo
    private Brazo brazo;

    public Brazo getBrazo() {
        return brazo;
    }

    public void setBrazo(Brazo brazo) {
        this.brazo = brazo;
    }

    public void girarBrazo(){
        brazo.girar();
    }
}
