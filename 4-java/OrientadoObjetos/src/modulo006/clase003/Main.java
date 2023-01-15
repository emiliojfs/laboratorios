package modulo006.clase003;

public class Main {
    public static void main(String[] args) {
        Casa casa01 = new Casa("Tacna");
        Casa casa02 = new Casa("Arequipa");
        Persona persona01 = new Persona("Emilio");
        Persona persona02 = new Persona("Izan");

        casa01.add(persona01);
        casa01.add(persona02);

        System.out.println("La casa contiene a "+persona01.getNombre() +"? : "+ casa01.contains(new Persona("Emilio")));
        System.out.println("Cantidad de personas en "+casa01.getDireccion()+"? : "+casa01.contarPersonas());

        persona01.add(casa02);
        persona02.add(casa02);

        System.out.println(persona01.contains(casa02));
    }


}
