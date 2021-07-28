import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class collection {
    public static void main(String[] args) {
        ArrayList<String> yt = new ArrayList<>();
        yt.add("vivek");
        yt.add("shubham");
        yt.add("sharda");
        yt.add("pravin");
        List<Integer> tr = new ArrayList<>();
        tr.add(12);
        tr.add(13);
        tr.add(15);
            for (int i = 0; i < yt.size(); i++) {
            if (yt.contains("pravin")) {
                yt.remove("pravin");
                yt.add("shamprasad");
                System.out.println(yt.size());
            }
            System.out.println(yt.get(i));
        }
        Stack<String> n1=new Stack<>();
        n1.push("haribhau");
        n1.push("baigragi");
        n1.pop();
        System.out.println("last element's:"+n1.peek());
        //
        
    }
}