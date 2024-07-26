import java.util.LinkedList;
import java.util.Iterator;

 class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("apple");
        list.add("banana");
        list.add("orange");

        Iterator<String> iterator = list.iterator();
        
        while (iterator.hasNext()) {
            String day = iterator.next();
            System.out.println(day);
        }
    }
}
