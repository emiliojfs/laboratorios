package modulo006.clase003;

import java.util.ArrayList;

public class Casa {
    private String direccion;
    private ArrayList<Persona> arrayPersona;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.arrayPersona=new ArrayList<Persona>();
    }
    //generacion de metodos delegados
    public boolean contains(Object o) {
        return arrayPersona.contains(o);
    }

    public void add(Persona element) {
        arrayPersona.add(element);
    }
    //getter y setter
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int contarPersonas(){
        return arrayPersona.size();
    }
}
