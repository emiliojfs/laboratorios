package modulo005.clase001;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        //acceso default
        persona1.paisNacimiento = "Irlanda";
        persona1.regionNacimiento = "Irlandita";
        System.out.println("Pais de nacimiento: " +persona1.paisNacimiento);
        System.out.println("Region de nacimiento: " +persona1.regionNacimiento);

        //acceso publico
        persona1.nombre="Rick";
        persona1.apellidoP="Einstein";
        persona1.apellidoM="Newton";
        System.out.println("Nombre completo: " + persona1.nombre + persona1.apellidoP + persona1.apellidoM);

        //acceso protegido
        persona1.estadoCivil=true;
        persona1.donacionOrganos=true;
        System.out.println("Soltero: "+persona1.estadoCivil);
        System.out.println("Donacion organos: "+persona1.donacionOrganos);

        //acceso privado
        //persona1.edad = 65;
        //persona1.movil = 9542135;
        persona1.setEdad(615);
        persona1.setMovil(9542135);
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getMovil());
    }
}
