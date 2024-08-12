import java.util.LinkedList;

public class ForL{
  public static void main(String[]args){
  // create a Linked List Object
    // Add Values
    // iterate it by using For Each

       LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        for (Integer value : list) {
            System.out.println(value); 
        }
  }}
