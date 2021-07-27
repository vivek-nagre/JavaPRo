import java.util.Scanner;

// import sun.security.util.Length;
public class Array {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("array");

        // int [] a= new int [5];
        // for(int x=0;x<=4;x++)
        // {
        // System.out.print("please enter your "+x+ " number");
        // // a[x]=sc.nextInt();
        // // System.out.println(a[x]);
        // }
        // // System.out.println(a);
        // // System.out.println(a[2]);
        // System.out.println(" my array list ");
        // System.out.println();
        // for (int i : a) {
        // System.out.println(i);
        // }
        System.out.println("new one");
        int[] b = { 1, 2, 3, 5, 6 };
        for (int i : b) {
            System.out.println(i);
        }
        System.out.println(b.length);
        String[] s = new String[4];
        s[0] = "sham";
        s[1] = "ram";
        s[2] = "kam";
        s[3] = "laxman";
        System.out.println("my frnd name is: " + s[3]);
        System.out.println(s.length);
        for (int i = 0; i <= s.length; i++) {
            System.out.println("printing: " + s[i]);
        }
        
    }
}
