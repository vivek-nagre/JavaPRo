import java.util.Scanner;
public class AnujBhiya {
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("this is lecture is cunducted by Mr.Anuj Bhiya");

        person p1=new person();
        p1.show();
        person p2=new person();
        p2.show();
    }

}
class person{
        
    
    String course="OPP's in one video" ;
    public void show(){
        Scanner sc=new Scanner(System.in);
    System.out.print("enter the name of Student:");
    String name=sc.next();
    System.out.println("student name is: "+name);
    System.out.println("name of the course is: "+course);

}
}