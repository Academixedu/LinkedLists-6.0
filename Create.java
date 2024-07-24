import java.util.LinkedList;
import java.util.Iterator;

public class Create {
    public static void main(String[] args) {
        // Create a LinkedList class object
        LinkedList<String> list = new LinkedList<>();

        // Add values in it
        list.add("Yash");
        list.add("Hemanth");
        list.add("Manoj");

        // Iterate it by using Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }
    }
}
