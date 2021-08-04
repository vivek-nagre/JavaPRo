

public class oop {
    public static void main(String[] args) {
        System.out.println("access modifier\'s");
        check_Access c1=new check_Access();
        c1.show_all();
        System.out.println("old d value:"+c1.getd());        
        c1.setd(152.369f);
        System.out.println("new set balue of the vaiable d :"+c1.getd());
    }
    
}
class check_Access{int
    public int a=1;
    protected int b=11;
    public long c=21454;
    private float d=31.65f;
    

    public float getd(){
        return d;
    }
    
    public float setd(float d){
        return this.d=d;
    }


    public void show_all(){
        System.out.println("valu of a :"+a);
        System.out.println("valu of b :"+b);
        System.out.println("valu of c :"+c);
        System.out.println("valu of d :"+d);
    }
}

 