/**
 * methodprac
 */
public class methodprac {
static void method(){
    System.out.println(" this is a static method without any parament");
}
static int method(int b){
    System.out.println("this is overloading method with the same name .... but haveing number odf differnt parameter with the int return data type");
    System.out.println("my age is: "+b);
    return b;
}
static void method(String name){
    System.out.println("this is method overloading differnt number of parameter with void return type");
    System.out.println( "my full name is : "+name);
}
//  in this method we are going to use sevraal kind of paremnet which initially packed inside the array and after ownword we used ittrable for Each loop to make un pack it and perform operation on it
static int sum(int ...arr){
    int add=0;
    for (int i : arr) {
        add+=i;
        // System.out.println(add);
    }
    System.out.println("ADDition of array packed numeber: "+add);
    return add;
}

    public static void main(String[] args) {
        method();
        System.out.println();
        // method(22);
        method(33);
        method("vivek suresh nagre");
        sum(12,34,5);
        

    }
}