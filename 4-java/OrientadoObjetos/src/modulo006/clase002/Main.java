package modulo006.clase002;

public class Main {
    public static void main(String[] args) {
        CajaGalleta cajaGalleta = new CajaGalleta();
        cajaGalleta.agregarGalleta(new Galleta("Chocalate",100));
        cajaGalleta.agregarGalleta(new Galleta("Fresa",100));
        //con sobre carga estatica
        cajaGalleta.agregarGalleta("Vainilla",100);
        cajaGalleta.agregarGalleta("Platano",100);
        cajaGalleta.agregarGalleta("Manzana",100);

        System.out.println("Cantidad de galletas en caja: "+cajaGalleta.contadorGalletas());
        System.out.println("Precio Total de caja: "+cajaGalleta.precioTotal());
    }
}
