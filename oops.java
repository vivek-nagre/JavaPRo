
public class oops {
    int salery;
    String name;
    public int getdetail(int salery){
        System.out.println("salery of employee is : "+salery);
        System.out.println("name of employee is: "+name);
        return salery;
    }

    class cellphone{
        public void silent() {
            System.out.println("silent mode");

        }
        public void vibrate() {
            System.out.println("vibrate mode");
            
        }
        public void Ringing() {
            System.out.println("ringing mode");
            
        }
    }

    
    public void setname( String nam) {
        System.out.println("the naame of employee is changed from " +name +" to : "+nam );
        name=nam;
        
    }
    
    public static void main(String[] args) {
        oops o=new oops();
        o.salery=400;
        o.name="ramesh";
        // System.out.println(o.salery);
        o.getdetail(o.salery);
        o.setname("vivek");
        // cellphone c=new cellphone();
        // c.Ringing();
        
    
    }
    
}

