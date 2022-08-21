package modulo002.clase002;


public class Main {
    public static void main(String[] args){
        Brazo brazoNormal = new BrazoNormal();
        Brazo brazoRapido = new BrazoRapido();
        Brazo coctelera = new Coctelera();

        Robot robot = new Robot();
        robot.setBrazo(brazoNormal);
        robot.girarBrazo();

        robot.setBrazo(brazoRapido);
        robot.girarBrazo();

        robot.setBrazo(coctelera);
        robot.girarBrazo();
    }
}
