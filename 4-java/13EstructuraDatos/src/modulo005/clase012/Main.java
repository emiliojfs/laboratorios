package modulo005.clase012;

public class Main {
    public static void main(String[] args) {
        Libro libro001 = new Libro("El codigo da vinci","Dan Brown");
        libro001.addCapitulo(new Capitulo("Introduccion",25));
        libro001.addCapitulo(new Capitulo("Tipos basicos",20));
        System.out.println("Total capitulos del libro: "+libro001.totalCapitulos());
        System.out.println("Total paginas del libro: "+libro001.totalPaginas());

        System.out.println(libro001.contieneCapitulo(new Capitulo("Introduccion",25)));

        for (Capitulo c: libro001.getListCapitulo()){
            System.out.println(c.getTitulo());
        }

        libro001.cambiarCapitulo(new Capitulo("Introduccion",25),new Capitulo("Presentacion",15));

        for (Capitulo c: libro001.getListCapitulo()){
            System.out.println(c.getTitulo());
        }
    }
}
