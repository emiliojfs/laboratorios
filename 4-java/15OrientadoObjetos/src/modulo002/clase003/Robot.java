package modulo002.clase003;

public class Robot {

    //composiccion
    // se apoya en polimorfismo
    private Girable girable;

    public Girable getBrazo() {
        return girable;
    }

    public void setBrazo(Girable girable) {
        this.girable = girable;
    }

    public void girarBrazo(){
        girable.girar();
    }
}
