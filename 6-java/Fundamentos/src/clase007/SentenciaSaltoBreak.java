package clase007;

import java.util.Scanner;

public class SentenciaSaltoBreak {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;
        char letra;
        int vocales=0;
        int consonantes=0;
        int espacios=0;
        int numeros=0;

        System.out.print("Ingrese una frase: ");
        frase = teclado.nextLine();

        for(int i=0;i<frase.length();i++){
            letra=frase.charAt(i);
                switch (letra){
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U': vocales++;
                    break;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9': numeros++;
                    break;
                    case ' ':espacios++;
                    break;
                    default: consonantes++;
                    break;
                }
        }
        System.out.println("La frase '"+frase+"' tiene: \n"+vocales+" vocales\n"+consonantes+" consonantes\n"+espacios+" espacios\n"+numeros+" numeros");
    }
}
//La sentencia break se utiliza para --interrumpir-- la ejecución de una estructura de repetición o de un switch.
// Cuando se ejecuta el break, el flujo del programa continúa en la sentencia inmediatamente posterior a la
// estructura de repetición o al switch.