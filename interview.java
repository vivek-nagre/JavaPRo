import java.util.Stack;

public class interview {
    public static void main(String[] args) {
        System.out.println("interview prepration");
        String s1 = "vivek";
        StringBuilder s2 = new StringBuilder();

        s2.append(s1);
        System.out.println(s2.reverse());

        System.out.println("swapping of two number");
        int a = 3, b = 6, tem = 0;
        System.out.println("before swaping: " + " value of a is :" + a + " value of b is: " + b);
        tem = a;
        a = b;
        b = tem;

        System.out.println("after swaping: " + " value of a is :" + a + " value of b is: " + b);
        Stack<String> mystack = new Stack<>();
        mystack.push("vivek");
        mystack.push("shubham");
        mystack.push("sharda");
        System.out.println(mystack.peek());
        mystack.pop();
        System.out.println(mystack.peek());
        System.out.println("factorial using for loop");
        int i, fact = 1;
        int any_number = 10;
        for (i = 1; i <= any_number; i++) {
            fact = fact * i;
        }
        System.out.println("factorial of given number is:" + fact);
        factorial d = new factorial();
        System.out.println(d.fcti(10));
        factorial df=new factorial();
        df.swapping();
        

    }

}

class factorial {
    static int fcti(int n) {
        if (n == 1) {
            return n;
        } else {
            return (n * fcti(n - 1));
        }

    }
    static Void swapping(){
        int a=30;
        int b=60;
        int temp=0;

        temp=a;
        a=b;
        b=temp;
        System.out.println("value of a is:" + a + " value of b is : "+b);
    }

}
