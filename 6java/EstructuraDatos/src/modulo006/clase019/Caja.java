package modulo006.clase019;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Caja<T> implements Iterable<T> {

    protected List<T> listaCaja = new ArrayList<T>();
    protected int limiteUnidadesCaja;

    public void agregar(T elemento){
        if(listaCaja.size()< limiteUnidadesCaja){
            listaCaja.add(elemento);
        }
    }
    public void borrar(T elemento){
        listaCaja.remove(elemento);
    }

    @Override
    public Iterator<T> iterator() {
        return listaCaja.iterator();
    }
}
