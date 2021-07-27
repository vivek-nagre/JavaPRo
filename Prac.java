import java.util.Scanner;
 class prac {
    public String name;
    public int age;
    Scanner sc=new Scanner(System.in);

    public void getDetail() {
    System.out.print("Enter the name of employee: ");
    name=sc.next();
    System.out.print("Enter the age: ");
    age=sc.nextInt();
        
    }
    public void displayDetail() {
        System.out.println("name of  employee is: "+name +" age of employee is: "+age);
    }
    public static void main(String[] args) {
        System.out.println("here we are going to to call the method");
        // prac p=new prac();
        // p.getDetail();
        // p.displayDetail();
        // prac p1=new prac();
        // p1.getDetail();
        // p1.displayDetail();
           
        Scanner sc=new Scanner(System.in);
        int [] a=new int[5];
        for (int i = 0; i < 5; i++) {
            
            System.out.print("enter any number at index : "+i+" :");
            int b=sc.nextInt();
            a[i]=b;
        }
            for (int j : a) {
                // System.out.print("value at ".concat(a[j])+" ");
                System.out.print("value at "+a[j]+" is: "+j);
                // System.out.println(j);
            }
        
                
        //a[0]=25;
                // a[1]=50;
                // a[2]=100;
                // a[3]=150;
                // a[4]=200;
            for (int i = 0; i < args.length; i++) {
                
            int b=sc.nextInt();
            System.out.println(b);
            }
    }
}
