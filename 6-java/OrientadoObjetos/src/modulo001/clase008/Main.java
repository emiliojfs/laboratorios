package modulo001.clase008;

public class Main {
    public static void main(String[] args) {
        Persona a = new Persona("Juan","Flores",2030010);
        Persona b = a;
        Persona c = a;

        //
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
        //se comprueba si son iguales
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(b.equals(c));
        //se muestra como apuntan a la misma zona de memoria (1 objeto)
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("***********************************");

        Persona x = new Persona("Pedro","Flores Condori",2030020); //homonimia = true/ misma persona
        Persona y = new Persona("Pedro","Flores Condori",2030021); //homonimia = true/ otra persona
        Persona z = new Persona("Pedro","Flores Condori",2030020); //homonimia = true/ misma persona

        //
        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(z.hashCode());
        //se comprueba si son iguales
        System.out.println(x.equals(y));
        System.out.println(x.equals(z));
        System.out.println(y.equals(z));
        //se muestra como apuntan a distintas zonas de memoria (3 objetos)
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
