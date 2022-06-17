package modulo005.clase015;

import java.util.HashMap;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        HashMap<String,String> diccionario = new HashMap<String,String>();
        diccionario.put("nombre","Emilio");
        diccionario.put("apellido","Flores");
        diccionario.put("ciudad","Tacna");

        System.out.println(diccionario.get("nombre"));
        System.out.println("*********************");
        HashMap<Integer,Persona> diccionarioPersona = new HashMap<Integer,Persona>();

        Persona persona01= new Persona("pepe","perez","Tacna");
        Persona persona02= new Persona("juan","sanchez","Ica");
        Persona persona03= new Persona("ana","sanz","Lima");

        diccionarioPersona.put(1001,persona01);
        diccionarioPersona.put(1002,persona02);
        diccionarioPersona.put(1003,persona03);

        System.out.println(diccionarioPersona.get(1003).getNombre());


        Set<Integer> claves = diccionarioPersona.keySet();
        for(Integer i:claves){
            System.out.println(diccionarioPersona.get(i).getApellido());
        }
    }
}
