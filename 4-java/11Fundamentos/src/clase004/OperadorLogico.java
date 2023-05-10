package clase004;

public class OperadorLogico {
    public static void main(String[] args) {
        int p=0,q=0;

        System.out.println("p = "+ p);
        System.out.println("q = "+ q);
        System.out.println("-------------------");

        boolean not = !(p==1);
        System.out.println("NEGACION === !(p==1) === not (p es igual a 1) ===> "+ not);
        System.out.println("-------------------");

        boolean xor1 = (p==0)^(q==0);
        System.out.println("XOR === (p==0)^(q==0) === V ^ V ===> "+ xor1);
        boolean xor2 = (p==0)^(q==1);
        System.out.println("XOR === (p==0)^(q==1) === V ^ F ===> "+ xor2);
        boolean xor3 = (p==1)^(q==0);
        System.out.println("XOR === (p==1)^(q==0) === F ^ V ===> "+ xor3);
        boolean xor4 = (p==1)^(q==1);
        System.out.println("XOR === (p==1)^(q==1) === F ^ F ===> "+ xor4);
        System.out.println("-------------------");

        boolean and1 = (p==0)&&(q==0);
        System.out.println("AND === (p==0)&&(q==0) === V && V ===> "+ and1);
        boolean and2 = (p==0)&&(q==1);
        System.out.println("AND === (p==0)&&(q==1) === V && F ===> "+ and2);
        boolean and3 = (p==1)&&(q==0);
        System.out.println("AND === (p==1)&&(q==0) === F && V ===> "+ and3);
        boolean and4 = (p==1)&&(q==1);
        System.out.println("AND === (p==1)&&(q==1) === F && F ===> "+ and4);
        System.out.println("-------------------");

        boolean or1 = (p==0)||(q==0);
        System.out.println("OR === (p==0)||(q==0) === V || V ===> "+ or1);
        boolean or2 = (p==0)||(q==1);
        System.out.println("OR === (p==0)||(q==1) === V || F ===> "+ or2);
        boolean or3 = (p==1)||(q==0);
        System.out.println("OR === (p==1)||(q==0) === F || V ===> "+ or3);
        boolean or4 = (p==1)||(q==1);
        System.out.println("OR === (p==1)||(q==1) === F || F ===> "+ or4);
        System.out.println("-------------------");
    }
}
