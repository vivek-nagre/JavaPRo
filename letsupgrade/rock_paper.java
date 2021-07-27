import java.util.Random;
import java.util.Scanner;

public class rock_paper {
    public static void main(String[] args) {
        String action;
        int My_sc=0;
        int com_Sc=0;
        int tie=0;
        System.out.println("Rock Paper Scissor game");
        String[] arr = { "Rock", "Paper", "Scissor" };
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int i;
        for (i=1;i<=5;i++) {
            System.out.println();
            System.out.print("1)Rock\n2)Paper\n3)Scissor\nenter your choise number:");
            // System.out.println();
            int my_ch = sc.nextInt();
            if (my_ch == 1) {
                action = "Rock";

            } else if (my_ch == 2) {
                action = "Paper";
            } else {
                action = "Scissor";
            }
            int randomNumber = r.nextInt(arr.length);
            // System.out.println(arr[randomNumber]);
            String com_ch = arr[randomNumber];
            System.out.println("your action is: " + action);
            System.out.println();
            System.out.println("Computer action is: " + com_ch);

            if (action == "Rock" && com_ch == "Scissor" || action == "Paper" && com_ch == "Rock"
                    || action == "Scissor" && com_ch == "Paper") {
                System.out.println("you won this Round");
                System.out.println();
                My_sc=My_sc+1;
            } else if (action == com_ch) {
                System.out.println("This Round is tied");
                System.out.println();
                tie+=1;
            } else {
                System.out.println("computer won this round...");
                com_Sc+=1;
                
            }
        }
        System.out.println("player score is: "+My_sc);
        System.out.println();
        System.out.println("computer score is: "+com_Sc);
        System.out.println();
        System.out.println("total round tied: "+tie);
        System.out.println();
        System.out.println("over all result.........");
        if (My_sc>com_Sc) {
            System.out.println("congratulation you are winner");

            
        }
        else if ( My_sc < com_Sc){
            System.out.println("computer win this match.... better luck next time");
        }       
        else if(My_sc==com_Sc){
            System.out.println("hooooo its tie..");
        }
    }

}