import java.util.Iterator;
import java.util.LinkedList;

public class Create{
public static void main(String[]args){
// create  a Linked List class object
  // Add Values in it
  // Iterate it by using Iterator
  LinkedList<Integer>  l = new LinkedList<>();
  l.add(1);
  l.add(2);
  l.add(3);
  l.add(4);
  
  Iterator<Integer> i = l.iterator();
  while(i.hasNext()){
    System.out.println(i.next());
  }

}
}
