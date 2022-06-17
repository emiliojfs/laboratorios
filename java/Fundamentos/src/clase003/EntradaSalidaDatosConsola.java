package clase003;

import java.util.Scanner;

public class EntradaSalidaDatosConsola {
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        float nota1, nota2, nota3, promedio;
        
        System.out.print("Ingrese nombre del alumno: ");
        nombre = teclado.nextLine();
        System.out.print("Ingrese nota 1 del alumno: ");
        nota1 = teclado.nextFloat();
        System.out.print("Ingrese nota 2 del alumno: ");
        nota2 = teclado.nextFloat();
        System.out.print("Ingrese nota 3 del alumno: ");
        nota3 = teclado.nextFloat();
        promedio = (nota1+nota2+nota3)/3;
        System.out.printf("El promedio de %s es %.2f \n",nombre,promedio);
        teclado.close();
    }
}
