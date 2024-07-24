import java.util.Iterator;
import java.util.LinkedList;

public class Create{
public static void main(String[]args){
// create  a Linked List class object
  // Add Values in it
  // Iterate it by using Iterator
  LinkedList<Integer> list = new LinkedList<Integer>();
  list.add(1);
  list.add(2);
  list.add(3);
  list.add(4);
  list.add(5);
  list.add(6);
  Iterator<Integer> itr = list.iterator();
  while(itr.hasNext()){
    System.out.println(itr.next());
  }
}
}
