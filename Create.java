
import java.util.Iterator;
import java.util.LinkedList;

public class Create{
public static void main(String[]args){
// create  a Linked List class object
  // Add Values in it
  // Iterate it by using Iterator
  LinkedList<Integer> obj =new LinkedList<Integer>();
  obj.add(1);
  obj.add(2);
  obj.add(3);
  obj.add(4);
  obj.add(5);
  obj.add(6);
  obj.add(7);
  obj.add(8);
  obj.add(9);
  obj.add(10);
  Iterator load=obj.listIterator();
  while(load.hasNext())
  {
    System.out.println(load.next());
  }
}
}
