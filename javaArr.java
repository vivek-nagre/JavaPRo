import java.util.Scanner;
import java.math;
public class javaArr {

    static int arr() {
        Scanner sc = new Scanner(System.in);
        int b[] = new int[5];
        for (int i = 0; i < b.length; i++) {
            System.out.print("enter your " + i + " element:");
            int app = sc.nextInt();
            b[i] = app;
            System.out.println(b[i]);
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
        // System.out.println();
        return 0;
    }

    public static void main(String[] args) {
        arr();
        
    }
}


