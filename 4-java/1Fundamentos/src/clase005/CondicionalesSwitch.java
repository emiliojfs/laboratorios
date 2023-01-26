package clase005;

import java.util.Scanner;

public class CondicionalesSwitch {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int primerValor;
		int segundoValor;
		float resultado;
		int opcion = 0;
		System.out.println("CALCULADORA SIMPLE");
		System.out.println("------------------------------------");
		System.out.print("Ingrese el primer valor: ");
		primerValor = teclado.nextInt();
		System.out.print("Ingrese el segundo valor: ");
		segundoValor = teclado.nextInt();
		System.out.println("------------------------------------");
		System.out.println("Seleccione un número según su opción");
		System.out.println("1.- Suma");
		System.out.println("2.- Resta");
		System.out.println("3.- Multiplicación");
		System.out.println("4.- División");
		System.out.println("------------------------------------");
		opcion = teclado.nextInt();
		System.out.println("------------------------------------");
		teclado.close();

		switch (opcion) {
		case 1:
			resultado = primerValor + segundoValor;
			System.out.println("Usted eligio Sumar y el resultado es: " + resultado);
			break;
		case 2:
			resultado = primerValor - segundoValor;
			System.out.println("Usted eligio Restar y el resultado es: " + resultado);
			break;
		case 3:
			resultado = primerValor * segundoValor;
			System.out.println("Usted eligio Multiplicar y el resultado es: " + resultado);
			break;
		case 4:
			resultado = primerValor / segundoValor;
			System.out.println("Usted eligio Dividir y el resultado es: " + resultado);
			break;

		default:
			System.out.println("Selección no valido");
		}
	}
}
