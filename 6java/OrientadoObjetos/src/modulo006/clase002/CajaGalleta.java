package modulo006.clase002;

import java.util.ArrayList;

public class CajaGalleta {
    private ArrayList<Galleta> arrayGalleta;

    public CajaGalleta() {
        this.arrayGalleta = new ArrayList<Galleta>();
    }

    public ArrayList<Galleta> getArrayGalleta() {
        return arrayGalleta;
    }

    public void setArrayGalleta(ArrayList<Galleta> arrayGalleta) {
        this.arrayGalleta = arrayGalleta;
    }

    public void agregarGalleta(Galleta galleta){
        arrayGalleta.add(galleta);
    }

    public void agregarGalleta(String sabor, double precio){
        arrayGalleta.add(new Galleta(sabor,precio));
    }

    public int contadorGalletas(){
        return arrayGalleta.size();
    }

    public double precioTotal(){
        double total=0;
        for(Galleta galleta:arrayGalleta){
            total=total+galleta.getPrecioGalleta();
        }
        return total + 1;
    }
}
