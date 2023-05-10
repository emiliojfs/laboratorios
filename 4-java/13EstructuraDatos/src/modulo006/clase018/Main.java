package modulo006.clase018;

public class Main {
    public static void main(String[] args) {
        implementarInterface();
    }
    private static void implementarInterface(){
        Caja <TipoGalleta> cajaGalleta = new Caja<TipoGalleta>(4);

        cajaGalleta.agregar(new TipoGalleta("chocolate10",10));
        cajaGalleta.agregar(new TipoGalleta("chocolate20",20));
        cajaGalleta.agregar(new TipoGalleta("chocolate30",30));
        cajaGalleta.agregar(new TipoGalleta("chocolate40",400));

        System.out.println(cajaGalleta.precioTotalCaja());
    }
}
