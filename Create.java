
import java.util.Iterator;
import java.util.LinkedList;

public class Create{
public static void main(String[]args){
  LinkedList<Integer> List = new LinkedList<Integer>();
  List.add(1);
  List.add(2);
  List.add(3);
  Iterator<Integer> i=List.iterator();
  while(i.hasNext()){
      System.out.println(i.next());
  }
// create  a Linked List class object
  // Add Values in it
  // Iterate it by using Iterator
}
}
