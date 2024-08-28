import java.util.LinkedList;
public class Main{
  public static void main(String[]args){
    LinkedList<Integer>linkedList = new LinkedList<>();
  // create a Linked List Object
    // Add Values
    // iterate it by using For Each
    linkedList.add(10);
    linkedList.add(20);
    linkedList.add(30);
    linkedList.add(40);
    for(Integer value : linkedList){
      System.out.println("Value:"+ value);
    }
  }
}

