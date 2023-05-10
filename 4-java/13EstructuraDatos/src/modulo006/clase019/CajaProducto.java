package modulo006.clase019;

public class CajaProducto<T extends Producto> extends Caja<T>{

    public CajaProducto(int limiteUnidadesCaja) {
        super();
        this.limiteUnidadesCaja = limiteUnidadesCaja;
    }

    public double precioTotalCaja(){
        double total=0;
        for (T mitipo: listaCaja){
            total=total+mitipo.getPrecio();//Si T no EXTIENDE a interfaz producto, entonces no reconoce el metodo getPrecio
        }
        return total;
    }
}
