package modulo006.clase020;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();
        Ingeniero i = new Ingeniero();
        Deportista d = new Deportista();

        p.setNombre("pepe");
        i.setNombre("ana");
        d.setNombre("maria");

        andar(p);
        andar(i);
        andar(d);

        System.out.println("------------------");

        List<Persona> listaPersona = new ArrayList<Persona>();
        List<Ingeniero> listaIngeniero = new ArrayList<Ingeniero>();
        List<Deportista> listaDeportista = new ArrayList<Deportista>();

        listaPersona.add(p);
        listaPersona.add(i);
        listaPersona.add(d);

        listaIngeniero.add(i);
        listaDeportista.add(d);

        andarConList(listaPersona);
        //andarConList(listaDeportista);//no compila por que los genericos no tienen relacion definidas
        //andarConList(listaIngeniero);//no compila por que los genericos no tienen relacion definidas
    }
    public static void andar (Persona persona){
        persona.andar();
    }
    public static void andarConList (List<? extends Persona> persona){
        for(Persona p:persona){
            p.andar();
        }
    }
}
