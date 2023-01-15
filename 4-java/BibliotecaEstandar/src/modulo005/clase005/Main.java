package modulo005.clase005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws TelefonoException {
        Scanner teclado = new Scanner(System.in);
        Telefono telefono = new Telefono();

        System.out.print("Ingrese su numero telefonico: ");
        String numero = teclado.nextLine();

        telefono.setTelefono(numero);
    }
}
