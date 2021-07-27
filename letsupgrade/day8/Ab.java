package day8;

 class Ab {
String name="vivek";


}
/**
 * InnerAb
 */
 class InnerAb extends Ab {
String srname="nagre";
public static void main(String[] args) {
    InnerAb ib=new InnerAb();
    System.out.println(ib.name);

}    
}