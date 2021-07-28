import java.security.Principal;
import java.util.Scanner;

public class something {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    // trail code 
    System.out.println("vivek"); // my name  simple function
/* vivek
nagre 
 this is multi line comment */
 System.out.println("this is multiline comment exicution");
 String  name;

 String nav="vivek";
 String adnav="nagre";

 System.out.println(nav+" ".concat( adnav));

//  data type

int a=10;
float b=12.37f;
double d1 = 12E4d;
boolean flag=true;
System.out.println(flag);
System.out.println("float value is:"+d1);
// System.out.println((float)a);
// java operator
System.out.println("1)Aritmatic\n2)logical\n3)comparison\n4)assignment\n5)logical");
System.out.println("post inc value of a is: "+a++);
// System.out.println(a++);
System.out.println(++a);
System.out.println(nav.length());
System.out.println(nav+"\fs");

System.out.println(nav.toUpperCase());
System.out.println(nav.indexOf("i"));
System.out.println(3==2 || "t"=="y");
System.out.println("max "+Math.max(10, 12));
System.out.println("sqrt "+Math.sqrt(90));
System.out.println("sqrt "+Math.abs(-89.32f));
for (int i=1;i<=5;i++ ){
    System.err.println(Math.random());

    // conditional formating check
 



}
// System.out.print("eneter your name: ");
String olhak=sc.next();
// olhak="vivek";
if (10>8) {
    System.err.println(olhak+"welcome");
} else {
    System.out.println("error");
}
// switch case
int mark=70;
switch (mark) {
    case 100:
    System.out.println("you got 100 mark");
    break;
    case 90:
        System.out.println("you got 90 mark");
        break;
    default:
    System.out.println("fail");
    
}
// while loop
while (a<15){
    System.out.println("value of a is :"+a);
    a+=1;
}
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String smt : cars) {
    System.out.println(smt);
}
// int x=3;
// do {
//     System.out.println("vivel is good boy");
//     x++;
// } while (x<2);

// try {
//     System.out.println(2/0);
// } catch (Exception e) {
//     //TODO: handle exception
//     System.out.println(e.getLocalizedMessage());
//     System.out.println("executed");
// }
int[][] z={{1,2,3},{11,22,33}};
for (int row = 0; row < z.length; row++) {
        //  System.out.println("\t");   
    for (int col = 0; col < z[row].length; col++)
    System.out.print(z[row][col]+"\t");
    System.out.println();
}

System.out.println("program end");
    

    // strat from above only
}

}