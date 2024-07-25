import java.util.LinkedList;

public class ForL{
  public static void main(String[]args){
  // create a Linked List Object

      LinkedList<Integer> i = new LinkedList<Integer>();
    // Add Values

        i.add(1);
        i.add(2);
        i.add(3);
        i.add(4);
        i.add(5);
    // iterate it by using For Each

      for(Integer a:i){
        System.out.println(a);

      }
  }}
