package day8;
import java.util.Scanner;

/**
 * Doctor
 */
public class Doctor {
    Scanner sc = new Scanner(System.in);
    int age;
    String name, designation;
    double Salery;

    public void getDetail() {
        System.out.println("please enter the all required detail of the employee...");
        System.out.println();
        System.out.print("pease enter the name of employee: ");
        name = sc.next();
        System.out.print("pease enter the age of employee: ");
        age = sc.nextInt();
        System.out.print("pease enter the salery of employee: ");
        Salery = sc.nextDouble();
        System.out.print("pease enter the designation of employee: ");
        designation = sc.next();

    }
    public void showDetail() {
        System.out.println("folloing are the detail of the given employee..");
        System.out.println("employe name: "+name);
        System.out.println("employe age: "+age);
        System.out.println("employe salery: "+Salery);
        System.out.println("employe designation: "+designation);

    }

    // class Engineer extends Doctor(){

    // }
    // class Pilot extends Doctor(){

    // }
    
    public static void main(String[] args) {
        Doctor dr=new Doctor();
        System.out.println(dr.age);
        dr.getDetail();
        dr.showDetail();
    }
}