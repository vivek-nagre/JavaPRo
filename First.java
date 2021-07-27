// import java.util.*;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("please enter yor name:");
        String name=input.nextLine();
    System.out.println("hey welcome,"+name+" click ok prcoceed and check yor result");
    System.out.print("enter your option:\n1)proceed\n2)cancel\nyour choice:");
    int opt=input.nextInt();
    if (opt==1) {
        System.out.println("you are pass");

    }
    else if(opt==2){
        System.out.println("you dont have dare to see your result...");
    }
    else{
        System.out.println("please enter the option from the list..");
    }
    }

    }
