package modulo002.clase004;

public class Main {
    public static void main(String[] args){
        //
        Girable brazoNormal = new BrazoNormal();
        Rotable rotable = new BrazoAcero();
        RobotPro robotPro = new RobotPro();

        //robotPro.setBrazoPro(rotable);
        //robotPro.rotarBrazoPro();
        robotPro.setBrazo(new SuperBrazo());
        robotPro.setBrazoPro(new SuperBrazo());

        robotPro.girarBrazo();
        robotPro.rotarBrazoPro();
    }
}
