package modulo001.clase001;

public class Main {
    public static void main(String[] args) {
        //tipo primitivo a tipo envoltorio
        int numero = 7;
        Integer objetoNumero = numero;//cuando sale subrayado significa que no se recomienda su uso
        System.out.println(objetoNumero);

        int nuevoNumero = objetoNumero.intValue()+5;
        System.out.println(nuevoNumero);

        //MatcherPattern (Tipo envoltorio) a Integer(Tipo envoltorio)
        String numeroA1="14";
        String numeroA2="21";
        int resultadoA = Integer.parseInt(numeroA1)+Integer.parseInt(numeroA2);
        System.out.println(resultadoA);

        //MatcherPattern (Tipo envoltorio) a Double(Tipo envoltorio)
        String numeroB1="14.20";
        String numeroB2="21.20";
        double resultadoB = Double.parseDouble(numeroB1)+Double.parseDouble(numeroB2);
        System.out.println(resultadoB);

        double nb1 = Double.parseDouble(numeroB1);
        double nb2 = Double.parseDouble(numeroB2);
        double resultadoC = nb1+nb2;
        System.out.println(resultadoC);
    }
}