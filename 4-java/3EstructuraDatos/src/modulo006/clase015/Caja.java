package modulo006.clase015;

import java.util.ArrayList;
import java.util.List;

public class Caja<T> {
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
}
