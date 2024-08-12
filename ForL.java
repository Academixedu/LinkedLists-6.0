import java.util.LinkedList;

public class ForL{
  public static void main(String[]args){
  // create a Linked List Object
    // Add Values
    // iterate it by using For Each
    LinkedList<Integer> a = new LinkedList<>();
    a.add(2);
    a.add(3);
    a.add(4);
    for (Integer s  :a ) {
      System.out.println(s);
    }
  }
}
