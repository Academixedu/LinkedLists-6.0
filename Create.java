import java.util.Iterator;
import java.util.LinkedList;



public class Create{
public static void main(String[]args){
// create  a Linked List class object

   LinkedList<Integer> L = new LinkedList<Integer>();
  // Add Values in it

  L.add(10);
  L.add(20);
  L.add(30);
  L.add(40);
  L.add(50);

  // Iterate it by using Iterator

  Iterator iterator = L.listIterator();

  while(iterator.hasNext()){

    System.out.println(iterator.next());

  }
}
}
