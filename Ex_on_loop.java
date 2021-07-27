// import java.util.Scanner;
import java.util.Scanner;

public class Ex_on_loop {
    public static void main(String[] args) {
        for(int col=4;col>0;col--){
        for(int row=0;row<col;row++)
        {
            System.out.print("* ");
        }
        System.out.println("");

    }
    Scanner sc=new Scanner(System.in);
    System.out.print("enter first any number:");

    int n=sc.nextInt();
    int sum=0;
    for (int i=0;i<n;i++){
        sum=sum+(2*i);
        System.out.println("sum of first n even number:"+sum);

    }
}

}


