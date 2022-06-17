package modulo002.clase002;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        stringPatternMatcher();

    }
    private static void stringPatternMatcher(){
        String texto = "Las facturas son 123AB y 234CD";
        String expresion = "\\d{3}[A-Z]{2}";

        Pattern patron = Pattern.compile(expresion);
        Matcher coincidencias = patron.matcher(texto);

        //Enum.out.println(coincidencias.find());

        while(coincidencias.find()){
            int inicio = coincidencias.start();
            int fin = coincidencias.end();
            System.out.println(texto.substring(inicio,fin));
        }
    }
}
