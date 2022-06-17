package modulo006.clase019;

public class Main {
    public static void main(String[] args) {
        implementarInterface();
    }
    private static void implementarInterface(){
        CajaProducto<TipoGalleta> cajaProductoGalleta = new CajaProducto<TipoGalleta>(4);

        cajaProductoGalleta.agregar(new TipoGalleta("chocolate10",10));
        cajaProductoGalleta.agregar(new TipoGalleta("chocolate20",20));
        cajaProductoGalleta.agregar(new TipoGalleta("chocolate30",30));
        cajaProductoGalleta.agregar(new TipoGalleta("chocolate40",400));

        //System.out.println(cajaProductoGalleta.precioTotalCaja());

        for(TipoGalleta tg:cajaProductoGalleta){
            System.out.println(tg.getSabor());
            System.out.println(tg.getPrecio());
        }
    }
}
