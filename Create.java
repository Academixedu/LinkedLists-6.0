import java.util.Iterator;
import java.util.LinkedList;
public class Create{
public static void main(String[]args){
// create  a Linked List class object
  LinkedList<Integer> l = new LinkedList<>();
  // Add Values in it
  l.add(10);
  l.add(20);
  l.add(30);
  // Iterate it by using Iterator
  Iterator i=l.iterator();
  while (i.hasNext()) {
    System.out.println(i.next());
  }
}
}
