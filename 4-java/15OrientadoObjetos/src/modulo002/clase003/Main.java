package modulo002.clase003;


public class Main {
    public static void main(String[] args){
        //
        Girable brazoNormal = new BrazoNormal();
        Girable brazoRapido = new BrazoRapido();
        Girable coctelera = new Coctelera();

        Robot robot = new Robot();

        robot.setBrazo(brazoNormal);
        robot.girarBrazo();

        robot.setBrazo(brazoRapido);
        robot.girarBrazo();

        robot.setBrazo(coctelera);
        robot.girarBrazo();
    }
}
