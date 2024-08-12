
import java.util.LinkedList;

public class ForL{
  public static void main(String[]args){
  // create a Linked List Object
  LinkedList<Integer> obj=new LinkedList<>();

    // Add Values
    obj.add(3);
    obj.add(6);
    obj.add(9);
    obj.add(12);

    // iterate it by using For Each
    for(Integer integer:obj){
      System.out.println(integer);
    }
  }
}
