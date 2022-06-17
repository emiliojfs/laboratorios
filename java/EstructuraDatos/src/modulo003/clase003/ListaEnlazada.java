package modulo003.clase003;

public class ListaEnlazada {
    protected Nodo primero;

    public ListaEnlazada(){
        primero = null;
    }

    public void agregarInicio(int dato){
        Nodo nuevo;
        nuevo = new Nodo(dato);
        nuevo.ref = primero;
        primero = nuevo;
    }
    public void agregarFinal(int dato){
        Nodo nuevoFinal;
        nuevoFinal=new Nodo(dato);
        nuevoFinal.ref=null;

        if(primero==null){
            primero=nuevoFinal;
            return;
        }
        Nodo tmp;
        for(tmp=primero;tmp.getRef()!=null;tmp=tmp.getRef());
        tmp.setRef(nuevoFinal);
    }
    public Nodo buscar(int dato){
        Nodo nodoBuscar;
        for(nodoBuscar=primero; nodoBuscar!=null; nodoBuscar = nodoBuscar.getRef())
            if (dato==nodoBuscar.dato)
                return nodoBuscar;
            return null;
    }
    public void eliminar(int dato){
        boolean encontrado;
        Nodo nodoActual;
        Nodo nodoAnterior;
        nodoActual = primero;
        nodoAnterior=null;
        encontrado=false;

        while (nodoActual!=null && !encontrado){
            encontrado = (nodoActual.dato == dato);
            if(!encontrado){
                nodoAnterior=nodoActual;
                nodoActual=nodoActual.getRef();
            }
        }
        if(nodoActual!=null){
            if(nodoActual==primero){
                primero=nodoActual.ref;
            }else {
                nodoAnterior.setRef(nodoActual.ref);
            }
        }

    }
    public void verLista(){
        Nodo nodoVer;
        nodoVer = primero;
        while (nodoVer!=null){
            System.out.print(nodoVer.dato);
            nodoVer=nodoVer.ref;
        }
    }
}