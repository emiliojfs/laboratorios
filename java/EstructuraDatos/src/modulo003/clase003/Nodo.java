package modulo003.clase003;

public class Nodo {
    int dato;
    Nodo referenciaAdelante;
    Nodo referenciaAtras;
    Nodo ref;

    public Nodo getRef() {
        return ref;
    }

    public void setRef(Nodo ref) {
        this.ref = ref;
    }

    public Nodo(int dato){
        this.dato = dato;
        this.referenciaAdelante=null;
        this.referenciaAtras=null;
    }

    public int getDato(){
        return dato;
    }

}
