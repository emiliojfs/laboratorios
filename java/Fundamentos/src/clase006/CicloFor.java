package clase006;

import java.util.Scanner;

public class CicloFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese rango inferior: ");
        Integer rangoInferior = teclado.nextInt();
        System.out.print("Ingrese rango superior: ");
        Integer rangoSuperior = teclado.nextInt();
        for(int i=rangoInferior+1; i<rangoSuperior;i++){
            System.out.println("Elementos dentro del rango :"+"["+i+"]");
        }
    }
}
