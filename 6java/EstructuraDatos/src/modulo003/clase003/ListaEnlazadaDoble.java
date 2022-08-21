package modulo003.clase003;

public class ListaEnlazadaDoble extends ListaEnlazada {
Nodo primero;
Nodo ultimo;
    int tamano;

    public ListaEnlazadaDoble(){}


    public void agregarInicio(int dato){
    Nodo nuevo = new Nodo(dato);
        if(tamano==0){
            this.primero=nuevo;
            this.ultimo=nuevo;
        }else{
            nuevo.referenciaAdelante=this.primero;
            this.primero.referenciaAtras=nuevo;
            this.primero=nuevo;
        }
        tamano++;
    }

    public void agregarFinal(int dato){
        Nodo nuevo = new Nodo(dato);
        if (tamano == 0){
            this.primero=nuevo;
            this.ultimo=nuevo;
        }else{
            nuevo.referenciaAtras=this.ultimo;
            this.ultimo.referenciaAdelante=nuevo;
            this.ultimo=nuevo;
        }
        tamano++;
    }

    public boolean eliminarFinal(){
        if (tamano>0){
            if(tamano()==1){
                this.primero=null;
                this.ultimo=null;
            }else{
                this.ultimo.referenciaAtras.referenciaAdelante=null;
                this.ultimo=this.ultimo.referenciaAdelante=null;
            }
            tamano--;
        }
        return false;
    }
    public boolean eliminarInicio(){
        if(tamano>0){
            if(tamano==1){
                this.primero=null;
                this.ultimo=null;
            }else{
                this.primero.referenciaAdelante.referenciaAtras=null;
                this.primero=primero.referenciaAdelante;
            }
            tamano--;
        }
        return false;
    }

    public void verLista(){
        Nodo nodoVista;
        nodoVista = primero;
        while (nodoVista!=null){
            System.out.print(nodoVista.dato);
            nodoVista=nodoVista.referenciaAdelante;
        }
    }

    public int tamano(){
        return tamano;
    }

    public boolean vacio (){
        return tamano()==0;
    }
}
