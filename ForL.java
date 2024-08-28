import java.util.LinkedList;

public class ForL{
  public static void main(String[]args){
  // create a Linked List Object
    // Add Values
    // iterate it by using For Each

    LinkedList<String> l = new LinkedList<>();
    l.add("Apple");
    l.add("Mango");
    l.add("Grapes");
    l.add("Pineapple");

    for(String p : l){
      System.out.println(p);
    }
  }
}
