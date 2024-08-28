import java.util.Iterator;
import java.util.LinkedList;

public class ForL{
  public static void main(String[]args){
  // create a Linked List Object
    // Add Values
    // iterate it by using For Each
    LinkedList<Integer>no = new LinkedList<Integer>();
    no.add(1);
    no.add(2);
    no.add(3);
    for (Integer i : no) {
      System.out.println(i);
    }
  }
}
