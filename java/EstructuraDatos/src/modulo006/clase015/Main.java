package modulo006.clase015;

public class Main {
    public static void main(String[] args) {
        genericoParteI();
        genericoParteII();
        genericoParteIII();
    }

    private static void genericoParteI(){
        Caja<TipoGalleta> cajaGalleta= new Caja<TipoGalleta>(3);

        cajaGalleta.agregar(new TipoGalleta("Chocolate"));
        cajaGalleta.agregar(new TipoGalleta("Vainilla"));
        cajaGalleta.agregar(new TipoGalleta("Fresa"));
        cajaGalleta.agregar(new TipoGalleta("Lucuma"));//esta no se agrega por que se sobrepasa del limite definido en clase

        for (TipoGalleta tg:cajaGalleta.getListaCaja()){
            System.out.println(tg.getSabor());
        }

    }
    private static void genericoParteII(){
        Caja<TipoBombon> cajaBombon = new Caja<TipoBombon>(3);

        TipoBombon tipoBombon01=new TipoBombon("Fresa10");
        TipoBombon tipoBombon02=new TipoBombon("Fresa20");
        TipoBombon tipoBombon03=new TipoBombon("Fresa30");

        cajaBombon.agregar(tipoBombon01);
        cajaBombon.agregar(tipoBombon02);
        cajaBombon.agregar(tipoBombon03);
        cajaBombon.agregar(tipoBombon03);//esta no se agrega por que se sobrepasa del limite definido en clase

        for (TipoBombon tb:cajaBombon.getListaCaja()){
            System.out.println(tb.getSabor());
        }
    }

    private static void genericoParteIII(){
        TipoDonut g1 = new TipoDonut("Vainilla con Fresa");
        TipoDonut g2 = new TipoDonut("Chocolate con Vainilla");
        TipoDonut g3 = new TipoDonut("Lucuma con Chocolate");
        TipoDonut g4 = new TipoDonut("Vainilla con Fresa");

        Caja<TipoDonut> cajaDonut = new Caja<TipoDonut>(3);//llama al constructor de Pack

        System.out.println(g1.equals(g2));
    }
}
