package modulo003.clase004;

public class ListaEnlazadaDobleCircular {
    Nodo primero;
    Nodo ultimo;

    public ListaEnlazadaDobleCircular(){
        primero = null;
        ultimo = null;
    }

    public void agregar(int dato){
        Nodo nuevo = new Nodo(dato);
        if(primero==null){
            primero=nuevo;
            primero.adelante=primero;
            nuevo.atras=ultimo;
            ultimo=nuevo;
        }else{
            ultimo.adelante=nuevo;
            nuevo.adelante=primero;
            nuevo.atras=ultimo;
            ultimo=nuevo;
            primero.atras = ultimo;
        }

    }
    public void eliminar(int dato){
        Nodo actual = new Nodo();
        Nodo anterior = new Nodo();

        actual = primero;
        anterior = ultimo;

        do{
            if(actual.dato == dato){
                if(actual==primero){
                    primero=primero.adelante;
                    ultimo.adelante=ultimo;
                    primero.atras=ultimo;//quiza cambiar ultimo x primero
                }else if(actual==ultimo){
                    ultimo = anterior;
                    primero.atras=ultimo;
                    ultimo.adelante=primero;
                }else{
                    anterior.adelante = actual.adelante;
                    actual.adelante.atras=anterior;
                }
            }
            anterior=actual;
            actual=actual.adelante;
        }while (actual!=primero);
    }
    public void ver(){
        Nodo actual;
        actual = primero;
        do{
            System.out.print(actual.dato);
            actual=actual.adelante;
        }while (actual!=primero);
    }
}
