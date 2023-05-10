package modulo001.clase006;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Pedro");
        persona.andar();

        Deportista deportista = new Deportista();
        deportista.setNombre("Juan");
        deportista.andar();
    }
}
