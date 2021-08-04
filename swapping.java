public class swapping {
    public static void main(String[] args) {
        swapped st = new swapped();
        st.lets_swapped();
        factorial f = new factorial();
        System.out.println("factorial of given number is :" + f.facti_by_recurssion(7));
        System.out.println("normal factorial:\n");
        factorial nf = new factorial();
        nf.normal_fact();
        // fiboncii series object
        fiboncii fb=new fiboncii();
        fb.fib();
        

    }

}

class swapped {
    static void lets_swapped() {
        System.out.println("swwapping of emlement");

        int a = 30;
        int b = 90;
        int temp = 0;

        temp = a;
        a = b;
        b = temp;
        System.out.println("value of a: " + a + " value of b is : " + b);
    }
}

class factorial {
    static int facti_by_recurssion(int n) {
        if (n == 1) {
            return n;
        } else {
            return n * facti_by_recurssion(n - 1);
        }

    }

    static void normal_fact() {
        int i = 1;
        int number = 7;
        int factooo = 1;
        for(i=1;i<=number;i++){
            factooo=factooo*i;
        }
        System.out.println("factorial by nomral method:"+factooo);
    }

}

class fiboncii{
    static void fib(){
        int a=0;
        int b=1;
        int c;
        for (int i=1;i<=10;i++){
            c=a+b;
            a=b;
            b=c;
            System.err.println(c);
            

            
        }
        System.out.println("done");
    }
}