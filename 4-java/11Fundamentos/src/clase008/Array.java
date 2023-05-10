package clase008;

public class Array {
    public static void main(String[] args) {
        //Array: conjunto de datos del mismo tipo
        //Los array son objetos
        //Los array normalmente se nombran en plural
        //Los array se inician con un tamaño y terminan con el mismo tamaño
        //referencia = puntero debil

        {
            int b[] = new int[5]; // crea 1 referencia para guardar la direccion donde esta el array de 5 enteros
            // 'b' es una referencia q crea una zona de memoria
            // 'new' crea 5 enteros
            // total = 6
        }

        {
            int a[];//crea 1 zona de memoria = referencia / inicializado en null / direccion = null
            a = new int[5];//

            a[0]=100;//ingreso de datos
            a[4]=150;//ingreso de datos

            for(int i=0;i< a.length;i++){
                System.out.println(a[i]);
            }
        }

        {
            int c[] = {100, 0, 0, 0, 150};
            for (int i = 0; i < c.length; i++) {
                System.out.println(c[i]);
            }
        }

    }
}
