package modulo005.clase006;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Telefono telefono = new Telefono();

        System.out.print("Ingrese su numero telefonico: ");
        String numero = teclado.nextLine();

        telefono.setTelefono(numero);

    }
}
