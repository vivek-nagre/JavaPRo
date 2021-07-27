public class break_continue {
    public static void main(String[] args) {
        System.out.println("using for loop");
        for (int i = 0; i <= 10; i++) {
            if (i == 3) {
                System.out.println("i am not going to print you : " + i);
                continue;
            }
            System.out.println("this is: " + i);
            if (i == 7) {
                break;
            }
        }
        System.out.println("brek continue using while loop");
        int b=0;;
        while (b<7){
            b+=1;
            if (b==3){
                // System.out.println("ignore: "+b);
                continue;
            }
            System.out.println("come on:"+b);
            }
        
    }
}
