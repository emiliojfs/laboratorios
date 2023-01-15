package modulo003.clase004;

public class Nodo {
    int dato;
    Nodo adelante;
    Nodo atras;

    public Nodo(){}
    public Nodo(int dato){
        this.dato=dato;
        this.adelante=null;
        this.atras=null;
    }
    public int getDato(){
        return dato;
    }
}
