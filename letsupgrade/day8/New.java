package day8;

public class New {
    static int n = 0;
    static int d = 2;
    public static void main(String[] args) {
        // int n=10;
        System.out.println("value of N: "+n);
        
        if (n != 0 && (n % d == 0)) {
            System.out.println("all fine");
        } else {
            System.out.println("smothing went wrong");
        }

    System.out.println("truth table .....");
    System.out.println();
    boolean p,q;
    System.out.println("p\tq\toperation\tresult");
    System.out.println();
    p =true;
    q=true;
    System.out.println(p+"\t"+q+"\tAND\t\t"+(p&q));
    
    System.out.println();
    p =true;
    q=false;
    System.out.println(p+"\t"+q+"\tor\t\t"+(p|q));
    System.out.println();
    p =true;
    // q=true;
    System.out.println(p+"\t\tnot\t\t"+(!p));


    }
}
