import java.util.LinkedList;


public class ForL{
  public static void main(String[]args){
  // create a Linked List Object
    // Add Values
    // iterate it by using For Each


        LinkedList<String> list = new LinkedList<>();

        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");

        for (String value : list) {
            System.out.println(value);
        }
    }
}

