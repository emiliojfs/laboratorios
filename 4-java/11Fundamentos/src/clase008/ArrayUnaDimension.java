package clase008;

public class ArrayUnaDimension {
    public static void main(String[] args) {
        {
            //en una unica sentencia asignando valores constantes
            float [] vector = {54.21f, 485,25f,-58,25.25f,325,-85};
            for(int i=0;i<vector.length;i++){
                System.out.println(vector[i]);
            }
            System.out.println("------------------------");
        }
        {
            //en una unica sentencia para luego asignar valores
            double[] precioVenta = new double[5];
                precioVenta[0]=45.1;
                precioVenta[1]=33;
                precioVenta[2]=45.5452;
                precioVenta[3]=-145.1;
                precioVenta[4]=-5545.1;
                for(int i=0;i<precioVenta.length;i++){
                    System.out.println(precioVenta[i]);
                }
            System.out.println("------------------------");
        }
        {
            //todos son declarados como array
            int[] libros, cuadernos, revistas;
            libros = new int[3];
            cuadernos = new int[2];
            revistas = new int[3];
            libros[0]=4;
            libros[1]=3;
            libros[2]=7;
            libros[2]=77;
            for(int i=0;i<libros.length;i++){
                System.out.println(libros[i]);
            }
            System.out.println("------------------------");
        }
        {
            //solo la variable con [] es declarado como array
            int sillones=25, mesas=42, sofas[];
            sofas = new int[2];
            sofas[0]=sillones;
            sofas[1]=mesas;
            for(int i=0;i<sofas.length;i++){
                System.out.println(sofas[i]);
            }
            System.out.println("------------------------");
        }
    }
}