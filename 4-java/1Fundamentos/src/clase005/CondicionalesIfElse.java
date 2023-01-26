package clase005;

import java.time.Year;
import java.util.Scanner;

public class CondicionalesIfElse {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int yearNow = Year.now().getValue();
		int yearBirth;
		int age;
				
		System.out.print("Ingrese su año de nacimiento :");
		yearBirth = teclado.nextInt();
		teclado.close();
		
		age = yearNow - yearBirth;
		
		if (age>=18) {
			System.out.println("Usted tiene "+ age + " años y es mayor de edad");
		} else {
			System.out.println("Usted tiene "+ age + " años y es menor de edad");
		}
	}
}
