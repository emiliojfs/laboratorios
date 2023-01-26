package clase004;

public class OperadorRelacional {
    public static void main(String[] args) {
        int a=0,b=0;
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        System.out.println("-------------------");

        boolean p= (a==b);
        System.out.println("(a == b) a es igual b  : "+p);
        System.out.println("-------------------");

        boolean q = (a!=b);
        System.out.println("(a != b) a es diferente de b  : "+q);
        System.out.println("-------------------");

        boolean r = (a>b);
        System.out.println("(a > b) a es mayor que b  : "+r);
        System.out.println("-------------------");

        boolean s = (a<b);
        System.out.println("(a < b) a es menor que b  : "+s);
        System.out.println("-------------------");

        boolean t = (a>=b);
        System.out.println("(a >= b) a es mayor igual que b  : "+t);
        System.out.println("-------------------");

        boolean  u= (a<=b);
        System.out.println("(a <= b) a es menor igual que b  : "+u);
        System.out.println("-------------------");
    }
}
