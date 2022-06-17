package modulo005.clase010;

import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static Vector vector = new Vector();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        int eleccion=0;

        do {
            System.out.println("------------------------");
            System.out.println("Seleccione una opción: ");
            System.out.println("1. Insertar");
            System.out.println("2. Listar");
            System.out.println("3. Eliminar");
            System.out.println("4. Salir");
            System.out.println("------------------------");
            eleccion = scanner.nextInt();

            switch (eleccion){
                case 1:
                    nombre = scanner.nextLine();
                    System.out.print("Inserte nombre: ");
                    insertar(nombre);
                    scanner.nextLine();
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    nombre = scanner.nextLine();
                    System.out.print("Nombre a eliminar: ");
                    eliminar(nombre);
                    scanner.nextLine();
                    break;
                default:
                    System.out.println("Seleccione opcion valida");
            }
        }
        while (eleccion!=4);
    }

    private static void insertar(String nombre){
        vector.addElement(nombre);
    }
    private static void eliminar(String nombre){
        vector.removeElement(nombre);
    }
    private static void listar(){
        //System.out.println(vector.size());
        for (int i=0;i<vector.size();i++){
            System.out.println(vector.elementAt(i));
        }
    }
}
