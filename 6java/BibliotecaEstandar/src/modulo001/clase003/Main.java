package modulo001.clase003;

public class Main {
    public static void main(String[] args) {
        //stringBasico();
        //stringRendimiento();
        //stringBufferRendimiento();
        stringExpressionRegular();
    }

    private static void stringBasico() {
        String cadena = "Hola que tal";

        System.out.println(cadena.length());
        System.out.println("-----------------------");

        for (int i = 0; i < cadena.length(); i++) {
            System.out.println("Caracter (" + i + "): " + cadena.charAt(i));
        }

        System.out.println("-----------------------");

        System.out.println("\n" + cadena.toUpperCase());

        System.out.println("-----------------------");

        String cadena2 = "     Hola hace tanto que te fuiste     ";

        System.out.println(cadena2);
        System.out.println(cadena2.trim());
        System.out.println("-----------------------");

        String cadena3 = "Hello";
        String cadena4 = cadena2.concat(cadena3);
        System.out.println(cadena4);

        System.out.println("-----------------------");
        String subcadena2 = cadena2.substring(10, 20);
        System.out.println(subcadena2);
    }

    private static void stringRendimiento() {
        //crea objetos cada ves que se usa MatcherPattern
        long inicio = System.currentTimeMillis();
        System.out.println("Inicio");
        String cadena = null;
        for (int i = 0; i < 50000; i++) {
            cadena = cadena + "Soy una cadena concatenada n veces";
        }
        System.out.println(cadena);
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo de ejecucion : " + (fin - inicio));
        System.out.println("Fin");
    }

    private static void stringBufferRendimiento() {
        //StringBuffer almacena texto en memoria
        //No crea objetos cada ves que usa MatcherPattern
        StringBuffer stringBuffer = new StringBuffer();
        long inicio = System.currentTimeMillis();
        System.out.println("Inicio");
        String cadena = null;
        stringBuffer.append(cadena);
        for (int i = 0; i < 50000; i++) {
            stringBuffer.append("Soy una cadena concatenada n veces "); //no crea objetos, solo almacena en memoria
        }
        System.out.println(stringBuffer.toString());//recien genera el objeto string
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo de ejecucion : " + (fin - inicio));
        System.out.println("Fin");
    }

    private static void stringExpressionRegular(){
        String mensaje = "Hola, mi nombre es Emilio Flores y tengo 32 años";
        String[] mensajeArray = mensaje.split("[aeiou]"); //[a][a-g][\\s] busca y quita la letra asignada

        for(int i=0; i< mensajeArray.length;i++){
            System.out.print(mensajeArray[i]);
        }
        System.out.println("");

        String texto = "El cliente A tiene de clave clave1234"+
                ", el cliente B tiene de clave otraclave3424";
        //busca cadenas de texto de la a la z que tengan tamaño de 3 a 10 caracteres y 4 digitos numericos
        String nuevoTexto = texto.replaceAll("[a-zA-Z]{3,10}\\d{4}","XXXXXXXXX");
        System.out.println(nuevoTexto);
    }
}