
import java.util.Iterator;
import java.util.LinkedList;

public class ForL{
  public static void main(String[]args){
  // create a Linked List Object
    // Add Values
    // iterate it by using For Each

    LinkedList<Integer> s = new LinkedList<>();
        s.add(5);
        s.add(91);
        s.add(13);
        Iterator i = s.iterator();
         for (Integer values : s) {
          System.out.println(values);

        }
  }}
