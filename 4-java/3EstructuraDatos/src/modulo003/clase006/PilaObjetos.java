package modulo003.clase006;

import java.util.ArrayList;

public class PilaObjetos {
    private ArrayList<Object> pila = new ArrayList<>();

    public void push(Object elemento){
        pila.add(elemento);
    }
    public Object pop(){
        if(!pila.isEmpty()){
            Object tmp = pila.get(pila.size()-1);
            pila.remove(pila.size()-1);
            return tmp;
        } else{
            return null;
        }
    }
    public boolean empty(){
        return pila.isEmpty();
    }

    public void view(){
        while (!this.empty()){
            System.out.print(this.pop());
        }
    }

}
