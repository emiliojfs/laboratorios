package clase006;

import java.util.Scanner;

public class CicloDoWhile {
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("---------------------------------------");
        System.out.println("Sistema para registrar venta del cajero");
        System.out.println("---------------------------------------");
        System.out.println("Para terminar la venta ingrese 0\n\n");

        float total = 0;
        float precio;

        do {
            System.out.print("Ingrese precio del producto: ");
            precio = teclado.nextFloat();
            total = total + precio;
        }while (precio!=0);

        System.out.println("---------------------------------------");
        System.out.println("La venta total es de : "+total);
	}
}
