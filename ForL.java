import java.util.LinkedList;

public class ForL {
    public static void main(String[] args) {
        
        LinkedList<String> linkedList = new LinkedList<>();

        
        linkedList.add("M1");
        linkedList.add("M2");
        linkedList.add("M3");
        linkedList.add("M4");

        for (String value : linkedList) {
            System.out.println(value);
        }
    }
}
