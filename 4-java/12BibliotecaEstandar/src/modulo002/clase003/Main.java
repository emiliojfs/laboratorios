package modulo002.clase003;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextLong());
        System.out.println(random.nextFloat());
        System.out.println(random.nextDouble());

        int rangoInferior = 20;
        int rangoSuperior = 60;
        int numeroAleatorio = (int) (random.nextDouble()*rangoSuperior)+(rangoInferior);

        System.out.println(numeroAleatorio);

    }
}
