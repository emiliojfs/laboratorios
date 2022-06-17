package modulo006.clase004;

public class Main {
    public static void main(String[] args) {
        Persona carlos = new Persona("Carlos");
        Persona oscar = new Persona("Oscar");
        Persona miguel = new Persona("Miguel");

        miguel.agregarAmigo(oscar);
        miguel.agregarAmigo(carlos);

        for (Persona persona:miguel.getAmigos()){
            System.out.println(persona.getNombre());
        }
    }
}
