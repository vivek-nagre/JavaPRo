
public class practice {
   int x=10;
public int edit(){

    System.out.println("value of x is: "+x);
return 1;
}
public static void main(String[] args) {
    practice p =new practice();
    p.x=15;
    System.out.println(p.x);
}
}