package modulo002.clase005;


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

        BrazoAcero brazoAcero = new BrazoAcero();
        robot.setBrazo(new AdaptadorBrazoAcero(brazoAcero));
        robot.girarBrazo(); // patron de diseño Adaptador para
        // se encarga de utilizar una interface por otra
    }
}
