import java.util.Iterator;
import java.util.LinkedList;

public class Create{
public static void main(String[]args){
// create  a Linked List class object
  // Add Values in it
  // Iterate it by using Iterator
  LinkedList<Integer>list = new LinkedList<Integer>();
  list.add(1);
  list.add(2);
  list.add(3);
  Iterator<Integer> i = list.iterator();
  while (i.hasNext()) {
    System.out.println(i.next());
  }
}
}
