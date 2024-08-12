import java.util.Iterator;
import java.util.LinkedList;

public class Create{
public static void main(String[]args){
// create  a Linked List class object
  // Add Values in it
  // Iterate it by using Iterator
  LinkedList<Integer> a = new LinkedList<>();
  a.add(1);
  a.add(1);
  a.add(3);
  Iterator i=a.iterator();
  while(i.hasNext()) {
    System.out.println(i.next());
    
  }
}
}
