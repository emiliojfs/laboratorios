package modulo003.clase002;

public class Nodo {
    int dato;
    Nodo ref;

    public Nodo getRef() {
        return ref;
    }

    public void setRef(Nodo ref) {
        this.ref = ref;
    }

    public Nodo(int dato){
        this.dato = dato;
    }

    public int getDato(){
        return dato;
    }

}
