package modulo003.clase001;

public class Main {
    public static void main(String[] args) {
        //Persona persona00 = new Persona();
        Persona persona; //asigna una referencia en memoria de tipo persona
        persona = new Persona(); //crea objeto tipo persona
        persona.setNombre("Agustin");
        persona.setApellidos("Leon");
        //persona.setPeso(""); //'persona' no hereda de 'deportista' por lo tanto no puede hacer uso de sus metodos
        //persona.setAltura(""); //'persona' no hereda de 'deportista' por lo tanto no puede hacer uso de sus metodos

        //Deportista  deportista00 = new Deportista();
        Deportista  deportista; //asigna una referencia en memoria de tipo deportista que heredea de persona
        deportista = new Deportista(); //crea objeto tipo deportista
        deportista.setNombre("Jorge"); //hereda atributos y metodos de la clase persona
        deportista.setApellidos("Roca Fuerte"); //hereda atributos y metodos de la clase persona
        deportista.setAltura(1.85f); //hereda atributos y metodos de la clase persona
        deportista.setPeso(90.5f); //hereda atributos y metodos de la clase persona

        System.out.println("Atributos heredados de la clase Persona: "+ deportista.getNombre()+" "+deportista.getApellidos());
        System.out.println("Atributos propios de la clase Deportista : altura="+deportista.getAltura()+"  peso="+deportista.getPeso());
    }
}
