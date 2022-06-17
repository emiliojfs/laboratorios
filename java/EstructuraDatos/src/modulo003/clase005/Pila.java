package modulo003.clase005;

public class Pila {
    private Nodo ultimo;
    int tamano;

    public Pila(){
        this.ultimo=null;
        this.tamano=0;
    }
    public boolean empty(){ //verifica si esta vacio
        return this.ultimo == null;
    }
    public void push(int dato){ //pone
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = ultimo;
        ultimo = nuevo;
        tamano++;
    }
    public int pop(){ //saca
        int tmp = this.ultimo.dato;
        ultimo = ultimo.siguiente;
        tamano--;
        return tmp;

    }
    public int peek(){ //regresa el ultimo
        return ultimo.dato;
    }
    public int size(){ //tamaño
        return tamano;
    }
    public void clear(){ //limpia
        while (!empty()){
            pop();
        }
    }
    public void view(){
        while (!this.empty()){
            System.out.print(this.pop());
        }
    }


}
