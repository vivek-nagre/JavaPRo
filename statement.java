import java.util.Scanner;
public class statement {
    
        
    public static void main(String[] args) {
        System.out.println("hello there");
        Scanner sc=new Scanner(System.in);
        System.out.print("enter u r text: ");
        String charecter = sc.next();
        // System.out.println(charecter);

        switch (charecter) {
            case "a":
                System.out.println(charecter+"  is  vowel");
                break;
            case "e":
                System.out.println(charecter +"  is a vowel");
                break;
            default:
            System.out.println("what did you entered");
                break;
        }
        System.out.println(true || false);
        System.out.println("this i while loop");
        int a=1;
        while (a<10) {
            System.out.println("the value of A is: "+a);
            a++;
            
        }
        System.out.println();
        System.out.println("for loop...........");
        for(int b=11;b<=20;b++){
            System.out.println("now b becomes: "+b);

        }
        System.out.println();
        System.out.println("do while loop...");
      int x=32;
        do {
            System.out.println("value of x is: "+x);
            x++;
        } while (x<=30);
    
        
    
    }
}
