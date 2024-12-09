 import java.util.LinkedList;

public class ForL {
    public static void main(String[] args) {
         
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}

