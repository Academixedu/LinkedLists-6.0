import java.util.LinkedList;

public class ForL {
    public static void main(String[] args) {
        
        LinkedList<String> a = new LinkedList<>();

        
        a.add("21");
        a.add("30");
        a.add("41");
        a.add("27");
        a.add("38");

        
        for (String integers : a) {
            
            System.out.println(integers);
        }
    }
}