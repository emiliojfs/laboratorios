package modulo006.clase001;

public class Main {
    public static void main (String[] args){
        Sobre sobre = new Sobre("Azul",5,"Chocolate",100);

        System.out.println("Color del sobre: "+sobre.getColorSobre());
        System.out.println("Precio del sobre: "+sobre.getPrecioSobre());
        //System.out.println("Acceso al sabor de la Galleta desde el Sobre: "+sobre.getGalleta().getSaborGalleta());
        //System.out.println("Acceso al precio de la Galleta desde el Sobre: "+sobre.getGalleta().getPrecioGalleta());
        System.out.println("Sabor de la galleta: "+sobre.getSaborGalleta());
        System.out.println("Precio de la galleta: "+sobre.getPrecioGalleta());
        System.out.println("----------------------------------------------");
        System.out.println("Precio total: "+sobre.precioTotal());


    }
}
