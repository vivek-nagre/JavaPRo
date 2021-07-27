public class BIg {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            if (i==5 | i==12)  {
                System.out.println("eliminated from the round: "+i);
                break;
                
            }
            System.out.println("Hello i am: "+i);
        }
    String name="vivek";
    System.out.println(name.length()); 
        System.out.println();
        System.out.println();
        System.out.println("TABLE UPTO 1-10");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <=i ; j++) 
            {
                System.out.print("\t"+i*j);
            }
            System.out.println("\t");
        }
        System.out.println();
        System.out.println();
        System.out.println("secound way of making tables.....");
        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("\t"+i*j);
                
            }
            System.out.println();
            
        }
    }
}
