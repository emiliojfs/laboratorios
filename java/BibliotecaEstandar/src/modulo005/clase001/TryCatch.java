package clase0091;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese dividendo: ");
            Integer a = scanner.nextInt();

            System.out.print("Ingrese divisor: ");
            Integer b = scanner.nextInt();

            Integer resultado = a / b;
            System.out.println("Resultado es: " + resultado);
        } catch (InputMismatchException e1) {
            System.out.println(e1);
        } catch (ArithmeticException e2) { //divido por 0
            System.out.println(e2);
        }catch (NullPointerException e3){ // vacio
            System.out.println(e3);
        }
        finally {
            System.out.println("Operacion concluida");
        }
        scanner.close();
    }
}
//ctrl+/