// import sun.security.util.Length;

public class pattern {
static int sumRec(int n){
    if (n==1) {
        return 1;
    }
    return n+sumRec(n-1);
}
// int sum;
static int varg (int ... a){
    int sum=0;
for (int i : a) {
    sum+=i;
    float avrg=sum/a.length;
    System.out.println("the sum is: "+ sum +" and the average is:"+ avrg);
    System.out.println();
}
return 0;
}
    public static void main(String[] args) {
     System.out.println("thisis program for printing some basic pattern");
    // for (int i = 0; i <=4 ; i++) {
    //     for (int j = 0; j <i; j++) {
    //         System.out.print("* ");
            
    //     }
    //     System.out.println();
    // }
        // for (int i = 0; i <= 4; i++) {
        //     for (int j = i-1; j <= i; j--) {
                
        //         System.out.print("* ");
        //         // System.out.println(j);
        //     }
        //     System.out.println();
            // table
        // for (int i = 1; i <= 10; i++) {
            //     for (int j = 1; j <= 10; j++) {
            //         // System.out.print((i*j));
            //         System.out.print(" "+(i*j));
            //     }
            //     System.out.println();
                
            // }
        //   recursive function
        // System.out.println(sumRec(5));
    //    varg(1,2,3,4); 
    //    float b=10/4;
    //    System.out.println(b);
    // System.out.println(10/2);

    }
}


    
