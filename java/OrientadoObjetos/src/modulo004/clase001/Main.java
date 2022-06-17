package modulo004.clase001;

public class Main {
    public static void main(String[] args) {


        Persona persona = new Deportista(""); //Advertencia-> Se crea un objeto 'objdeportista' que referencia a un tipo 'persona'
                                              // 'objdeportista' solo ejecutara los metodos y atributos de tipo 'persona'
                                              // 'objdeportista' se comporta como 'objpersona'

        persona.setNombre("Jorge"); //hereda atributos y metodos de la clase persona
        persona.setApellidos("Roca Fuerte"); //hereda atributos y metodos de la clase persona
        //persona.setAltura(1.85f); //hereda atributos y metodos de la clase persona
        //persona.setPeso(90.5f); //hereda atributos y metodos de la clase persona


        //Deportista  deportista = new Persona(""); // Error -> Se crea un objeto 'objpersona' que referencia a un tipo 'deportista'
                                                    // 'objpersona' no puede acceder a los metodos y atributos de tipo 'deportista'
                                                    //

        //deportista.setNombre("Jorge"); // Error
        //deportista.setApellidos("Roca Fuerte"); // Error
        //deportista.setAltura(1.85f); // Error
        //deportista.setPeso(90.5f); // Error
    }
}
