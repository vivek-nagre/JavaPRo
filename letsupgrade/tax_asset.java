import java.util.Scanner;
public class tax_asset {
    
public static void main(String[] args) {
    System.out.println("hello there.....");
    tax_asset m=new tax_asset();
    m.empdetail();   
}
    public void empdetail() {
        Scanner sc=new Scanner(System.in);
        System.out.print("please enter your name: ");
        String name=sc.next();
        System.out.print("please enter year of birth: ");
        int DOB=sc.nextInt();
        System.out.print("please enter your Salery: ");
        float esal=sc.nextFloat();
        

    }
    public void Display() {
        // tax_asset.empdetail();
        
        System.out.println();
    }
}