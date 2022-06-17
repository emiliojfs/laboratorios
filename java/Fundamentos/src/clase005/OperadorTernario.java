package clase005;

import java.time.Year;
import java.util.Scanner;

public class OperadorTernario {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese su año de nacimiento :");
		int yearBirth = teclado.nextInt();
		int yearNow = Year.now().getValue();
		teclado.close();

		int age = yearNow - yearBirth;
		System.out.println((age>=18) ?  "Tienes "+age+" y eres mayor de edad" : "Tienes "+age+" y eres menor de edad");
	}
}
