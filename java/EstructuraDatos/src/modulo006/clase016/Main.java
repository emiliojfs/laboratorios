package modulo006.clase016;

public class Main {
    public static void main(String[] args) {
        genericoParteIV();
    }

    private static void genericoParteIV(){
        TipoGalleta tipoGalleta01 = new TipoGalleta("Chocolate10");
        TipoGalleta tipoGalleta02 = new TipoGalleta("Chocolate20");
        TipoGalleta tipoGalleta03 = new TipoGalleta("Chocolate30");
        TipoGalleta tipoGalleta04 = new TipoGalleta("Chocolate10");

        Pack<TipoGalleta> packTipoGalleta = new Pack<TipoGalleta>(tipoGalleta01,tipoGalleta02,tipoGalleta03);

        System.out.println(tipoGalleta01.equals(tipoGalleta04));

    }

}
