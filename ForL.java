import java.util.LinkedList;

public class ForL{
  public static void main(String[]args){
  // create a Linked List Object
  LinkedList<Integer> l = new LinkedList<>();
    // Add Values
    l.add(10);
    l.add(20);
    l.add(30);
    // iterate it by using For Each
    for (Integer i : l) {
      System.out.println(i);
    }
  }}
