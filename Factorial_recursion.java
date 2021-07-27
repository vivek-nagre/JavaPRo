 class Factorial_recursion {
static int fact(int n){
    System.out.println("factorial of : "+n +" is: ");
     if (n==0 || n==1){
         return 1;
     }
     else{
         return n*fact(n-1);
     }
}
static void pattern(int n){
    for (int i = 0; i <=n; i++) {
        for (int j = 0; j <i+1; j++) {
            System.out.print("* ");

        }
        System.out.println();
    }
}    
public static void main(String[] args) {
    System.out.println(fact(5)); 
    pattern(4);
}
}
