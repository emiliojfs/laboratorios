package clase004;

public class OperadorAritmetico {
    public static void main(String[] args) {
        int m,n;
        {
            m=20;
            n=10;
            System.out.println("m = "+ m);
            System.out.println("n = "+ n);
            System.out.println("-------------------");
        }
        {
            m=20;
            n=10;
            m+=n;
            System.out.print("SUMA === m+=n === m=m+n === ");
            System.out.println(m);
            System.out.println("-------------------");
        }
        {
            m=20;
            n=10;
            m-=n;
            System.out.print("RESTA === m-=n === m=m-n === ");
            System.out.println(m);
            System.out.println("-------------------");
        }
        {
            m=20;
            n=10;
            m*=n;
            System.out.print("MULTIPLICACION === m*=n === m=m*n === ");
            System.out.println(m);
            System.out.println("-------------------");
        }
        {
            m=20;
            n=10;
            m/=n;
            System.out.print("COCIENTE === m/=n === m=m/n === ");
            System.out.println(m);
            System.out.println("-------------------");
        }
        {
            m=20;
            n=10;
            m%=n;
            System.out.print("RESTO === m%=n === m=m%n === ");
            System.out.println(m);
            System.out.println("-------------------");
        }
    }
}
