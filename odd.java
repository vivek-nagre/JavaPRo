import java.util.Scanner;
public class odd {
    public static void main(String[] args){
        System.out.println("odd number");
     Scanner sc=new Scanner(System.in);
     System.out.print("please enter a number:");
     int n=sc.nextInt();
     System.out.println("your n number end : "+n);
    for (int i = n; i > 0; i--) {
        System.out.println(i);
    } 
    }
}
