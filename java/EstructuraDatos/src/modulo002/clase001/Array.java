package modulo002.clase001;

public class Array {
    public static void main(String[] args) {
        //Array: conjunto de datos del mismo tipo
        //Los array son objetos
        //Los array normalmente se nombran en plural

        {
            int numerosX[];//definido
            numerosX = new int[5];//inicializado
            numerosX[0]=100;//ingreso de datos
            numerosX[4]=150;//ingreso de datos

            for(int i=0;i< numerosX.length;i++){
                System.out.println(numerosX[i]);
            }
        }
        {
            int numerosY[] = {100, 0, 0, 0, 150};
            for (int i = 0; i < numerosY.length; i++) {
                System.out.println(numerosY[i]);
            }
        }

    }
}
