package clase004;

public class OperadorIncrementoDecremento {
    public static void main(String[] args) {
        int a=0,b=0,m=0,n=0;

        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        System.out.println("m = "+ m);
        System.out.println("n = "+ n);
        System.out.println("-------------------");

        a++;
        System.out.print("INCREMENTO === a++ === a=a+1 === ");
        System.out.println(a);
        System.out.println("-------------------");

        b--;
        System.out.print("DECREMENTO === b-- === b=b+1 === ");
        System.out.println(b);
        System.out.println("-------------------");

        ++m;
        System.out.print("INCREMENTO === ++m === m+=1 === m=m+1 === ");
        System.out.println(m);
        System.out.println("-------------------");

        --n;
        System.out.print("DECREMENTO === ++n === n+=1 === n=n+1 === ");
        System.out.println(n);
        System.out.println("-------------------");
    }
}
