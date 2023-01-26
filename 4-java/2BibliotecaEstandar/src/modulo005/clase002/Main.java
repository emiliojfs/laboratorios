package modulo005.clase002;

public class Main {
    public static void main(String[] args) {

        metodoConControlExcepcion();
        System.out.println("--------------");
        metodoSinControlExcepcion();

    }
    private static void metodoSinControlExcepcion(){
        for(int i=3;i>=0;i--){
            double resultado = 10/i;
            System.out.println(resultado);
        }
    }

    private static void metodoConControlExcepcion(){
        try {
            for (int i = 3; i >= 0; i--) {
                double resultado = 10 / i;
                System.out.println(resultado);
            }
        }catch (Exception e){
            System.out.println("Ocurrio un error de tipo: "+e.getMessage());
        }finally {
            System.out.println("Operacion finalizada");
        }
    }
}
