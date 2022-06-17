package modulo005.clase003;

public class Main {
    public static void main(String[] args) {
        multipleCatchExcepcion();
    }

    private static void multipleCatchExcepcion(){
        int dividendo[]={2,4,8,16,32,64,128,256,512};
        int divisor[]={2,0,4,2,0,4,1};

        for(int i=0;i<dividendo.length;i++){
            try{
                double resultado=dividendo[i]/divisor[i];
                System.out.println(resultado);
            }catch (ArithmeticException e){
                System.out.println("No se puede dividir por 0");
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("No se encontro ningun elemento");
            }
        }
    }
}
