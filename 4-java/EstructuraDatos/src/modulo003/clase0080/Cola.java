package modulo003.clase0080;

public class Cola {
    Nodo primero;
    Nodo ultimo;
    int tamano;

    public Cola(){
        this.primero=null;
        this.ultimo=null;
        this.tamano=0;
    }

    public boolean empty(){
        return primero==null;
    }

    public void insert(int dato){
        Nodo nuevo = new Nodo(dato);
        if(empty()){
            primero=nuevo;
        }else{
            ultimo.siguiente=nuevo;
        }
        ultimo=nuevo;
        tamano++;
    }

    public int delete(){
        int tmp = primero.dato;
        primero=primero.siguiente;
        tamano--;
        return tmp;
    }

    public int start(){
        return primero.dato;
    }

    public int size(){
        return  tamano;
    }
}
