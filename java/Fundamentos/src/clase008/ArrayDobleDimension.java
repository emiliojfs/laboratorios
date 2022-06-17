package clase008;

public class ArrayDobleDimension {
    public static void main(String[] args) {
        {
            //en una unica sentencia asignando valores constantes
            float[][] matriz = {
                    {51, 52, 53},
                    {54, 55, 56},
                    {57, 58, 59},
                    {60, 61, 62},
                    {63, 64, 65}
                                };
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print("|" + matriz[i][j]);
                    if (j == matriz[i].length - 1) {
                        System.out.println("|");
                    }
                }
            }
            System.out.println("------------------------");
        }
        {
            //en una unica sentencia para luego asignar valores
            float[][] precioVenta = new float[3][2];
            precioVenta[0][0] = 45.1f;
            precioVenta[0][1] = 33;
            precioVenta[1][0] = 54;
            precioVenta[1][1] = 54;
            precioVenta[2][0] = 5.15f;
            precioVenta[2][1] = 20;

            for (int i = 0; i < precioVenta.length; i++) {
                for (int j = 0; j < precioVenta[i].length; j++) {
                    System.out.print("|" + precioVenta[i][j]);
                    if (j == precioVenta[i].length - 1) {
                        System.out.println("|");
                    }
                }
            }
            System.out.println("------------------------");
        }
        {
            //todos son declarados como array
            float[][] libros, cuadernos, revistas;
            libros = new float[3][2];
            cuadernos = new float[2][2];
            revistas = new float[3][2];
            libros[0][0] = 4;
            libros[0][1] = 4;
            libros[2][0] = 8;
            libros[2][1] = 8;

            for (int i = 0; i < libros.length; i++) {
                for (int j = 0; j < libros[i].length; j++) {
                    System.out.print("|" + libros[i][j]);
                    if (j == libros[i].length - 1) {
                        System.out.println("|");
                    }
                }
            }
            System.out.println("------------------------");
        }
        {
            //solo la variable con [] es declarado como array
            int a = 5, b = 6, matrix[][];
            matrix = new int[a][b];
            matrix[0][0]=25;
            matrix[0][1]=25;
            matrix[0][2]=25;
            matrix[0][3]=25;
            matrix[0][4]=25;
            matrix[0][5]=25;

            matrix[4][0]=50;
            matrix[4][1]=50;
            matrix[4][2]=50;
            matrix[4][3]=50;
            matrix[4][4]=50;
            matrix[4][5]=50;

            for (int fila=0; fila< matrix.length;fila++){
                for (int columna=0; columna<matrix[fila].length;columna++){
                    System.out.print("|"+matrix[fila][columna]);
                    if(columna == matrix[fila].length-1){
                        System.out.println("|");
                    }
                }
            }
            System.out.println("------------------------");
        }
    }
}