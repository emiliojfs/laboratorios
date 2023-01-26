package modulo006.clase018;

import java.util.ArrayList;
import java.util.List;

public class Caja<T extends Producto> {
    private List<T> listaCaja = new ArrayList<T>();
    private int limiteUnidadesCaja;

    public Caja(int limiteUnidadesCaja) {
        this.limiteUnidadesCaja = limiteUnidadesCaja;
    }

    public List<T> getListaCaja() {
        return listaCaja;
    }

    public void agregar(T elemento){
        if(listaCaja.size()< limiteUnidadesCaja){
            listaCaja.add(elemento);
        }
    }
    public void borrar(T elemento){
        listaCaja.remove(elemento);
    }

    public double precioTotalCaja(){
        double total=0;
        for (T mitipo: listaCaja){
            total=total+mitipo.getPrecio();//Si T no EXTIENDE a interfaz producto, entonces no reconoce el metodo getPrecio
        }
        return total;
    }
}
