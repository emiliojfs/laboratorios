package clase009;

import java.util.Scanner;

public class MetodoTipoFuncion {

   static int suma (int a, int b){
        int r=a+b;
        return r;
    }
	static int resta (int a, int b){
        int r=a-b;
        return r;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese primer numero: ");
        int a = teclado.nextInt();
        System.out.print("Ingrese segundo numero: ");
        int b = teclado.nextInt();

        System.out.println("La suma es: "+suma(a,b));
        System.out.println("La resta es: "+resta(a,b));
    }
}
