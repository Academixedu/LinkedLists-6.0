import java.util.LinkedList;

public class ForL {
    public static void main(String[] args) {
        
        LinkedList<String> linkedList = new LinkedList<>();

        
        linkedList.add("21");
        linkedList.add("30");
        linkedList.add("41");
        linkedList.add("27");
        linkedList.add("38");

        
        for (String integers : linkedList) {
            
            System.out.println(integers);
        }
    }
}
