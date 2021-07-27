import java.util.Scanner;
public class string {


    public int sum(int a, int b) {
        int add=a+b;
        System.out.print("addition of given to number is :");
        return add;
    }
    public string(){
        System.out.println(" i am the constructor i am free to come when you create any object");
    }
    static void myname(){
        System.out.println("vivek suresh nagre");
    }

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter your lucky number here:");
    int num=sc.nextInt();
    System.out.println("your enter number is:"+num);
        string str=new string();
        System.out.println( str.sum(12, 13));
        myname();
        
}
    
}