package modulo004.clase002;

public class Main {
    public static void main(String[] args) {

        // se referencia una variable de tipo 'persona' con un objeto del mismo tipo
        Persona persona  = new Persona("Izan","Flores", 2000);
        Deportista deportista = new Deportista("Emilio","Flores", 1975);
        Ingeniero ingeniero = new Ingeniero("Pedro","Flores", 1985);

        //metodos sobrecargados con comportamiento distinto
        iniciarCorrerPersona(persona);
        iniciarCorrerPersona(deportista);
        iniciarCorrerPersona(ingeniero);

        //metodo propio
        deportista.getNombreDeporte();
        ingeniero.getNombreEspecialidad();

        //*****************************************************************************************

        // se referencia una variable de tipo 'persona' con un objeto del mismo linaje (descendiente)
        Persona persona1 = new Persona("Izan","Flores", 2000);
        Persona persona2 = new Deportista("Emilio","Flores", 1975);
        Persona persona3 = new Ingeniero("Pedro","Flores", 1985);

        //metodos sobrecargados con comportamiento distinto
        iniciarCorrerPersona(persona1);
        iniciarCorrerPersona(persona2);
        iniciarCorrerPersona(persona3);

        //metodo propio
        //persona2.getNombreDeporte();
        //persona2.getNombreEspecialidad();



        Persona persona00 = new Deportista("Emilio","Flores", 1975); //Advertencia-> Se crea un objeto 'objdeportista' que referencia a una variable tipo 'persona'
        // 'objdeportista' hereda de 'persona' pero solo podra hacer uso de los atributos
        // y metodos que tengan en comun (herencia)

        persona00.setNombre("Jorge"); //hereda atributos y metodos de la clase persona
        persona00.setApellido("Roca Fuerte"); //hereda atributos y metodos de la clase persona
        //persona00.setAltura(1.85f); //hereda atributos y metodos de la clase persona
        //persona00.setPeso(90.5f); //hereda atributos y metodos de la clase persona

        //Deportista  deportista00 = new Persona(); // Error -> Se crea un objeto 'objpersona' que referencia a una variable tipo 'deportista'
        // pero 'objpersona' no puede acceder
        //

        //deportista00.setNombre("Jorge"); // Error
        //deportista00.setApellidos("Roca Fuerte"); // Error
        //deportista00.setAltura(1.85f); // Error
        //deportista00.setPeso(90.5f); // Error
    }



    public static void iniciarCorrerPersona(Persona persona){
        persona.correr();
    }
}
