package clase006;

import java.util.Scanner;

public class CicloWhile {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("------------------------------------------------------");
		System.out.println("Sistema para calcular el factorial de un numero entero");
		System.out.println("------------------------------------------------------");

		int num;
		int i=1;
		double aux=1;

		System.out.print("Ingrese un numero entero: ");
		num = teclado.nextInt();
		while (i<=num){
			aux=aux*i;
			i++;
		}
		System.out.println("El resultado es: "+aux);
	}
}
