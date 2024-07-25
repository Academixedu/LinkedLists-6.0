import java.util.LinkedList;
import java.util.Iterator;

public class Create {
    public static void main(String[] args) {
        
        LinkedList<String> l1 = new LinkedList<>();

        l1.add("1");
        l1.add("2");
        l1.add("3");
        l1.add("4");
        l1.add("5");

        // Iterate through the LinkedList using an Iterator
        Iterator<String> iterator = l1.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }
    }
}

