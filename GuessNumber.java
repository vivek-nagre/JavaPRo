
import java.util.*;


public class GuessNumber {
    Scanner sc = new Scanner(System.in);
    Random rn = new Random();
    static int rand_int;
    static int my_guess;
    static int attempt=0;

    public GuessNumber() {
        System.out.println();
        System.out.println("this is constructor");
        rand_int = rn.nextInt(40);
        
        System.out.println();
        System.out.println("Randomm number is sucessfully genrated in betwwn 1 -40");
        System.out.println();
    }

    public int setMyguess() {
        System.out.println();
        System.out.print("enter the number as a useer input: ");
        // System.out.println();
        int num = sc.nextInt();
        my_guess = num;
        return 0;
    }

    public int isCorrect() {
        if (my_guess > rand_int) {
            System.out.println("you have choosen to large number.");
            System.out.println();
        } else if (my_guess < rand_int && my_guess != 0) {
            System.out.println("your choosed number is less than the computer number");
            System.out.println();
        } else if (my_guess == 0) {
            System.out.println("please selcet the number in between 1-40");
            System.out.println();
        } else if (my_guess == rand_int) {
            System.out.println("you made it..." + "your guess is : " + my_guess + " computer guess is: " + rand_int);
            
            System.out.println();
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println("this is only for genrating random number..");
        GuessNumber g = new GuessNumber();
        while (my_guess != rand_int) {
            

            g.setMyguess();
            // System.out.println("computer guess: " + rand_int);
            System.out.println("user guess: " + my_guess);

            g.isCorrect();
            attempt++;
        }
        
        System.out.println("you made it in the :"+ attempt + " attempt");
    }
}