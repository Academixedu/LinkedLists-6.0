import java.util.*;
public class ForL{
  public static void main(String[]args){
  // create a Linked List Object
    // Add Values
    // iterate it by using For Each
    LinkedList<String> string=new LinkedList<String>();
    string.add("rose");
    string.add("lotus");

    for(String flowers : string){
      System.out.println(flowers);
    }
  }
}
