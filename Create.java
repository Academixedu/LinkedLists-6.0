import java.util.LinkedList;
import java.util.Iterator;
public class Create{
public static void main(String[]args){
// create  a Linked List class object
  // Add Values in it
  // Iterate it by using Iterator
  LinkedList<String> linkedList = new LinkedList<>();

    
        linkedList.add("One");
        linkedList.add("Two");
        linkedList.add("Three");
        linkedList.add("Four");
        linkedList.add("Five");

       
        Iterator<String> iterator = linkedList.iterator();

       
        while (iterator.hasNext()) {
            // Print each element
            System.out.println(iterator.next());
        }
    }
}
