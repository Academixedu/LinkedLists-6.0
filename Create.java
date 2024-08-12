import java.util.LinkedList;
import java.util.Iterator;


public class Create{
public static void main(String[]args){
// create  a Linked List class object
  // Add Values in it
  // Iterate it by using Iterator
  LinkedList<Integer> list = new LinkedList<>();
  list.add(1);
  list.add(2);
  list.add(3);
  Iterator<Integer> iterator = list.iterator();
  while (iterator.hasNext()) {
    Integer value = iterator.next();
    System.out.println(value); 
}
}
}
